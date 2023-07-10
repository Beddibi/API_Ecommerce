package com.API_Ecommerce.project.services;

import com.API_Ecommerce.project.Model.Panier;

import java.util.List;
import java.util.Optional;

public interface PanierService {
    List<Panier> findAllPanier();
    Optional<Panier> findById(Long id);
    Panier AddPanier(Panier panier);
    Panier UpdatePanier(Panier panier);
    void  DeletePanier(Long id);
}
