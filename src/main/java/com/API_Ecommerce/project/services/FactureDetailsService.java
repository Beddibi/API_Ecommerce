package com.API_Ecommerce.project.services;

import com.API_Ecommerce.project.Model.FactureDetails;

import java.util.List;
import java.util.Optional;

public interface FactureDetailsService {
    List<FactureDetails> findAllLigneFacture();
    Optional<FactureDetails> findById(Long id);
    FactureDetails AddFactureLigne(FactureDetails factureDetails);
    FactureDetails UpdateFactureLigne(FactureDetails factureDetails);
    void  DeleteFactureLigne(Long id);
}
