package dev.danielcnsrj.controlp.pessoa;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {
    private final PessoaServico pessoaServico;
    
    public PessoaController(PessoaServico pessoaServico){
        this.pessoaServico = pessoaServico;
    }

    @GetMapping("/form")
    public String exibeFormularioDeCadastro(Integer id, Model model) {
        if (id != null){
            Pessoa pessoa = pessoaServico.buscarPessoaPelo(id);
            model.addAttribute("pessoa", pessoa);
        }
        return "pessoa/formulario";
    }

    @GetMapping
    public String listarPessoas(Model model) {
        model.addAttribute("pessoas", pessoaServico.listarPessoas());
        return "pessoa/pessoas";
    }

    @PostMapping
    @Transactional
    public String cadastrarPessoa(DadosCadastroPessoa dados) {
        pessoaServico.cadastrarPessoa(Pessoa.from(dados));
        return "redirect:/pessoa";
    }

    @DeleteMapping
    @Transactional
    public String excluirPessoa(Integer id){
        pessoaServico.excluirPessoa(id);
        return "redirect:/pessoa";
    }

    @PutMapping
    @Transactional
    public String editarPessoa(DadosEdicaoPessoa dados){
        pessoaServico.alterarPessoa(dados);
        return "redirect:/pessoa";
    }
}
