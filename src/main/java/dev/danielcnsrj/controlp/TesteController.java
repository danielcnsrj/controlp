package dev.danielcnsrj.controlp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {
    
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("mensagem","Mensagem vinda do controller.");
        return "index"; // arquivo em templates/index.html
    }
}
