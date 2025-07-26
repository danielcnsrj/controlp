package dev.danielcnsrj.controlp.pessoa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PessoaServico {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public List<Pessoa> listarPessoas(){
        return pessoas;
    }
}
