package com.API_Ecommerce.project.services;

import com.API_Ecommerce.project.Model.Facture;

import java.util.List;
import java.util.Optional;

public interface FactureService {
    List<Facture> findAllFacture();
    Optional<Facture> findById(Long id);
    Facture AddFacture(Facture f);
    Facture UpdateFacture(Facture f);
    void  DeleteFacture(Long id);
}
