package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEnderecoMedico;

public record DadosAtualizacaoMedico(
       @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecoMedico endereco
) {
}
