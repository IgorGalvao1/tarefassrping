package tarefasspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String home(@RequestParam("nome") String nome, Model model) {
        model.addAttribute("mensagem", "Olá " + nome);
        return "WEB-INF/home.jsp";
    }
}
