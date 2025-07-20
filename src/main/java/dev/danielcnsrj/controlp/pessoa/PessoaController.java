package dev.danielcnsrj.controlp.pessoa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

    @GetMapping
    public String exibeFormularioDeCadastro() {
        return "pessoa/formulario";
    }

    @PostMapping
    public String cadastrarPessoa(DadosCadastroPessoa dados) {
        System.out.println(dados);
        return "pessoa/pessoas";
    }
    
}
