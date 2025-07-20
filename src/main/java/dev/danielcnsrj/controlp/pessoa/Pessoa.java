package dev.danielcnsrj.controlp.pessoa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    String cargo;
    String codigo;
    String nome;

    public static Pessoa from(DadosCadastroPessoa dados) {
        return new Pessoa(dados.cargo(), dados.codigo(), dados.nome());
    }
}
