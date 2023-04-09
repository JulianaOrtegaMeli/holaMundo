package udemy.meli.holaMundo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String inicio (){
        return "Hola mundo";
    }
}
