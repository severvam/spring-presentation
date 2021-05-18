package com.example.demo;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/client", produces = APPLICATION_JSON_VALUE)
public class ClientResource {

    private final ClientService clientService;

    @GetMapping("/all")
    public Iterable<Client> all() {
        return clientService.findAll();
    }

    @GetMapping("/generate-new")
    public Client generate() {
        return clientService.createUser();
    }

    @GetMapping("/generate-4finance")
    public Client generate4finance() {
        return clientService.create4financeUser();
    }

    @GetMapping("/find/{email}")
    public Iterable<Client> findByEmail(@PathVariable String email) {
        return clientService.findClientByEmailContains(email);
    }

    @GetMapping("/by-user-id/{userId}")
    public Iterable<Client> findByUserId(@PathVariable String userId) {
        return clientService.findByUserId(userId);
    }

}
