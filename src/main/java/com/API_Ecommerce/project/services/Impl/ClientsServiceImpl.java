package com.API_Ecommerce.project.services.Impl;

import com.API_Ecommerce.project.Model.Clients;
import com.API_Ecommerce.project.Model.user;
import com.API_Ecommerce.project.Repository.ClientReposetory;
import com.API_Ecommerce.project.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClientsServiceImpl implements ClientService {
    private final ClientReposetory cls;

    public ClientsServiceImpl(ClientReposetory clientReposetory) {
        this.cls = clientReposetory;
    }

    @Override
    public List<Clients> findAllClients() {
        return cls.findAll();
    }

    @Override
    public Optional<Clients> findById(Long id) {
        return  cls.findById(id);
    }

    @Override
    public Clients AddClient(Clients C) {
        return cls.save(C);
    }

    @Override
    public Clients UpdateClients(Clients C) {
        Optional<Clients> existingUser = cls.findById(C.getIdclient());
        if (existingUser.isPresent()) {
            Clients updatedClient = existingUser.get();
            updatedClient.setAdress(C.getAdress());
            updatedClient.setTelephone(C.getTelephone());
            return cls.save(updatedClient);
        } else {

            return null;
        }
    }

    @Override
    public void DeleteClients(Long id) {
        cls.deleteById(id);

    }
}
