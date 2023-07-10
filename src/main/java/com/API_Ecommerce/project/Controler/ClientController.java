package com.API_Ecommerce.project.Controler;

import com.API_Ecommerce.project.Model.Clients;
import com.API_Ecommerce.project.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Clients> findAllClients() {
        return clientService.findAllClients();
    }

    @GetMapping("/{id}")
    public Optional<Clients> findById(Long id) {
        return clientService.findById(id);
    }
    @PostMapping("/add")
    public Clients AddClient(Clients C) {
        return clientService.AddClient(C);
    }
    @PutMapping
    public Clients UpdateClients(Clients C) {
        return clientService.UpdateClients(C);
    }
    @DeleteMapping("/{id}")
    public void DeleteClients(Long id) {
        clientService.DeleteClients(id);
    }
}
