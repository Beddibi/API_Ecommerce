package com.API_Ecommerce.project.services;


import com.API_Ecommerce.project.Model.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitService {
    List<Produit> findAllProduit();

    //List<Produit>getAllProductsWithCategory();
    Optional<Produit> findById(Long id);
    Produit AddProduit(Produit produit);
    Produit UpdateProduit(Produit produit);
    void  DeleteProduit(Long id);
}
