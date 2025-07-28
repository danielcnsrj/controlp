package dev.danielcnsrj.controlp.pessoa;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PessoaServico {
    private PessoaRepository pessoaRepository;

    public PessoaServico(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public void cadastrarPessoa(Pessoa pessoa){
        pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listarPessoas(){
        return pessoaRepository.findAll();
    }
}
