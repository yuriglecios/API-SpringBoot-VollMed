package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;

public record DadosEnderecoPaciente(
        @NotBlank
        String logradouro,
        String numero,
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        @NotBlank
        String cep) {
}
