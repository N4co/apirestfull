package com.teste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UsuarioController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        request.setAttribute("nome", "Mundo");
        return "hello";
    }
}
