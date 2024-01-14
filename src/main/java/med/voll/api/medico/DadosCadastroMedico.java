package med.voll.api.medico;

import med.voll.api.endereco.DadosEnderecoMedico;

public record DadosCadastroMedico(String nome, String email, String telefone, String crm, Especialidade especialidade, DadosEnderecoMedico endereco) {
}
