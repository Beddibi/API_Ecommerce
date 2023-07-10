package com.API_Ecommerce.project.services.Impl;

import com.API_Ecommerce.project.Model.Categorie;
import com.API_Ecommerce.project.Model.Facture;
import com.API_Ecommerce.project.Model.FactureDetails;
import com.API_Ecommerce.project.Repository.LigneFactureReposetory;
import com.API_Ecommerce.project.services.FactureDetailsService;
import com.API_Ecommerce.project.services.FactureService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LigneFactureImpl implements FactureDetailsService {
    private final LigneFactureReposetory lg;

    public LigneFactureImpl(LigneFactureReposetory lg) {
        this.lg = lg;
    }


    @Override
    public List<FactureDetails> findAllLigneFacture() {
        return lg.findAll();
    }

    @Override
    public Optional<FactureDetails> findById(Long id) {
        return lg.findById(id);
    }

    @Override
    public FactureDetails AddFactureLigne(FactureDetails factureDetails) {
        return lg.save(factureDetails);
    }

    @Override
    public FactureDetails UpdateFactureLigne(FactureDetails factureDetails) {
        Optional<FactureDetails> existingLigne = lg.findById(factureDetails.getIdDetails());
        if (existingLigne.isPresent()) {
            FactureDetails updatedLigne = existingLigne.get();
            updatedLigne.setQteCommaner(factureDetails.getQteCommaner());
            return lg.save(updatedLigne);
        } else {
            // Gérez le cas où la catégorie n'existe pas
            // Vous pouvez lancer une exception ou retourner null, selon vos besoins
            return null;
        }
    }

    @Override
    public void DeleteFactureLigne(Long id) {
        lg.deleteById(id);

    }
}
