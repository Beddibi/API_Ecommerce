package com.API_Ecommerce.project.services.Impl;

import com.API_Ecommerce.project.Model.FactureDetails;
import com.API_Ecommerce.project.Model.Panier;
import com.API_Ecommerce.project.Repository.PanierReporsetory;
import com.API_Ecommerce.project.services.PanierService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PanierServiceImpl implements PanierService {

    private final PanierReporsetory panierReporsetory;

    public PanierServiceImpl(PanierReporsetory panierReporsetory) {
        this.panierReporsetory = panierReporsetory;
    }

    @Override
    public List<Panier> findAllPanier() {
        return panierReporsetory.findAll();
    }

    @Override
    public Optional<Panier> findById(Long id) {
        return panierReporsetory.findById(id);
    }

    @Override
    public Panier AddPanier(Panier panier) {
        return panierReporsetory.save(panier);
    }
    @Override
    public Panier UpdatePanier(Panier panier) {
        Optional<Panier> existingPanier = panierReporsetory.findById(panier.getIdPanier());
        if (existingPanier.isPresent()) {
            Panier updatedPanier = existingPanier.get();
            updatedPanier.setDateModification(panier.getDateModification());
            return panierReporsetory.save(panier);
        } else {

            return null;
        }
    }
    @Override
    public void DeletePanier(Long id) {
        panierReporsetory.deleteById(id);

    }
}
