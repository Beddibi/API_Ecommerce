package com.API_Ecommerce.project.services;

import com.API_Ecommerce.project.Model.Clients;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Clients> findAllClients();
    Optional<Clients> findById(Long id);
    Clients AddClient(Clients C);
    Clients UpdateClients(Clients C);
    void  DeleteClients(Long id);
}
