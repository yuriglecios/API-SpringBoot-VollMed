package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEnderecoMedico;

public record DadosAtualizacaoMedico(
       @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecoMedico endereco
) {
}
