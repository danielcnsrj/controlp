package dev.danielcnsrj.controlp.pessoa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {
    private final PessoaServico pessoaServico;
    
    public PessoaController(PessoaServico pessoaServico){
        this.pessoaServico = pessoaServico;
    }

    @GetMapping("/novo")
    public String exibeFormularioDeCadastro() {
        return "pessoa/formulario";
    }

    @GetMapping
    public String listarPessoas(Model model) {
        model.addAttribute("pessoas", pessoaServico.listarPessoas());
        return "pessoa/pessoas";
    }

    @PostMapping
    public String cadastrarPessoa(DadosCadastroPessoa dados) {
        pessoaServico.cadastrarPessoa(Pessoa.from(dados));
        return "redirect:/pessoa";
    }
    
}
