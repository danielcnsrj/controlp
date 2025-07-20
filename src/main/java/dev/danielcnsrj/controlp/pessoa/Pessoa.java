package dev.danielcnsrj.controlp.pessoa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    private String cargo;
    private String codigo;
    private String nome;

    public static Pessoa from(DadosCadastroPessoa dados) {
        return new Pessoa(dados.cargo(), dados.codigo(), dados.nome());
    }
}
