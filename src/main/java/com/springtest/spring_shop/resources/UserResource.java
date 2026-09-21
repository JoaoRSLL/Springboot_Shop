package com.springtest.spring_shop.resources;

import com.springtest.spring_shop.entities.User;
import com.springtest.spring_shop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Informa ao Spring que a classe lidará com requisições web
@RestController

// Define o "endereço" (endpoint) para esta classe
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;
    // Indica que o metodo deve responder a requisições HTTP GET
    @GetMapping

    // ResponseEntity é um objeto especial do Spring que representa a resposta HTTP
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        // Esta linha constrói e envia a resposta de volta para quem fez a requisição:
        // .ok() gera automaticamente o código de status HTTP 200 (que significa "Sucesso").
        // .body(u) pega o objeto Java, converte para JSON, e o coloca na resposta.
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok(obj);
    }
}
