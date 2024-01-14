package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;

public record DadosEnderecoMedico(
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
