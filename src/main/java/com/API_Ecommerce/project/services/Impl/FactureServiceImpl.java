package com.API_Ecommerce.project.services.Impl;

import com.API_Ecommerce.project.Model.Categorie;
import com.API_Ecommerce.project.Model.Facture;
import com.API_Ecommerce.project.Repository.FactureReposetory;
import com.API_Ecommerce.project.services.FactureService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FactureServiceImpl implements FactureService {

    private final FactureReposetory factureReposetory;

    public FactureServiceImpl(FactureReposetory factureReposetory) {
        this.factureReposetory = factureReposetory;
    }

    @Override
    public List<Facture> findAllFacture() {
        return factureReposetory.findAll();
    }

    @Override
    public Optional<Facture> findById(Long id) {
        return factureReposetory.findById(id);
    }

    @Override
    public Facture AddFacture(Facture f) {
        return factureReposetory.save(f);
    }

    @Override
    public Facture UpdateFacture(Facture f) {
        Optional<Facture> existingFacture = factureReposetory.findById(f.getIdFact());
        if (existingFacture.isPresent()) {
            Facture updatedFacture = existingFacture.get();
            updatedFacture.setDateCommande(f.getDateCommande());
            updatedFacture.setTotale(f.getTotale());
            return factureReposetory.save(updatedFacture);
        } else {

            return null;
        }
    }

    @Override
    public void DeleteFacture(Long id) {
        factureReposetory.deleteById(id);

    }
}
