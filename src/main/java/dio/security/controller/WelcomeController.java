package dio.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping //1ª rota - pagina principal
    public String welcome() {
        return "Welcome to My Spring Boot Web API";
    }
    @GetMapping("/users") //2ª rota - pag de usuarios
    public String users() {
        return "Authorized user";
    }
    @GetMapping("/managers") //3ª rota - pag de managers
    public String managers() {
        return "Authorized manager";
    }
}
