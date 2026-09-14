package com.springtest.spring_shop.resources;

import com.springtest.spring_shop.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Informa ao Spring que a classe lidará com requisições web
@RestController

// Define o "endereço" (endpoint) para esta classe
@RequestMapping(value = "/users")
public class UserResource {

    // Indica que o metodo deve responder a requisições HTTP GET
    @GetMapping

    // ResponseEntity é um objeto especial do Spring que representa a resposta HTTP
    public ResponseEntity<User> findAll(){
        // Usuario de teste
        User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
        // Esta linha constrói e envia a resposta de volta para quem fez a requisição:
        // .ok() gera automaticamente o código de status HTTP 200 (que significa "Sucesso").
        // .body(u) pega o objeto Java, converte para JSON, e o coloca na resposta.
        return ResponseEntity.ok().body(u);
    }
}
