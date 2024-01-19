package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.medico.DadosDetalhamentoMedico;
import med.voll.api.domain.paciente.*;
import med.voll.api.paciente.DadosDetalhamentoPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrarPaciente(@RequestBody @Valid DadosCadastroPaciente dados, UriComponentsBuilder uriComponentsBuilder){
        var paciente = new Paciente(dados);
        pacienteRepository.save(paciente);
        var uri = uriComponentsBuilder.path("/pacientes/{id}").buildAndExpand(paciente.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoPaciente(paciente));
    }
    @PutMapping
    @Transactional
    public Page<DadosListagemPaciente> listarPaciente(@PageableDefault(size = 10, sort = "nome")Pageable paginacao){
       return pacienteRepository.findAll(paginacao).map(DadosListagemPaciente::new);
    }

}
