package com.API_Ecommerce.project.services.Impl;

import com.API_Ecommerce.project.Model.Categorie;
import com.API_Ecommerce.project.Model.Produit;
import com.API_Ecommerce.project.Repository.ProduitReporsetory;
import com.API_Ecommerce.project.services.ProduitService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImpl implements ProduitService{
    private final ProduitReporsetory prod;

    public ProduitServiceImpl(ProduitReporsetory prod) {
        this.prod = prod;
    }
    @Override
    public List<Produit> findAllProduit() {
        return prod.findAll();
    }

   /* public List<Produit> getAllProductsWithCategory() {
        return prod.findAllWithCategory();
    }*/

    @Override
    public Optional<Produit> findById(Long id) {
        return prod.findById(id);
    }

    @Override
    public Produit AddProduit(Produit produit) {
        return prod.save(produit);
    }

    @Override
    public Produit UpdateProduit(Produit produit) {

        Optional<Produit> existingProduit = prod.findById(produit.getIdproduit());
        if (existingProduit.isPresent()) {

            Produit updatedProduit = existingProduit.get();
            updatedProduit.setNomProduit(produit.getNomProduit());
            updatedProduit.setReferences(produit.getReferences());
            updatedProduit.setDescription(produit.getDescription());
            updatedProduit.setCategoryId(produit.getCategoryId());
            updatedProduit.setPrix(produit.getPrix());




            return prod.save(updatedProduit);
        } else {
            // Gérez le cas où la catégorie n'existe pas
            // Vous pouvez lancer une exception ou retourner null, selon vos besoins
            return null;
        }
    }

    @Override
    public void DeleteProduit(Long id) {
        prod.deleteById(id);

    }
}
