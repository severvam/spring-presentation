package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client create4financeUser() {
        var client = createClient();
        return clientRepository.insert(client);
    }

    public Client createUser() {
        var client = createClient();
        return clientRepository.save(client);
    }

    private Client createClient() {
        var client = new Client();
        Integer randomNumber = new Random(System.currentTimeMillis()).nextInt();
        client.setUserId(randomNumber.toString());
        client.setEmail(String.format("%d@%d.com", randomNumber, randomNumber));
        client.setPassword(randomNumber.toString());
        return client;
    }

    public Iterable<Client> findClientByEmailContains(String email) {
        return clientRepository.findClientByEmailContains(email);
    }

    public Iterable<Client> findByUserId(String userId) {
        return clientRepository.findClientsByUserId("%" + userId + "%");
    }

}
