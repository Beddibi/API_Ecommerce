package com.API_Ecommerce.project.services;

import com.API_Ecommerce.project.Model.Categorie;

import java.util.List;
import java.util.Optional;

public interface CategorieService {
    List<Categorie>findAllCategory();
    Optional<Categorie> findById(Long id);
    Categorie AddCategorie(Categorie categorie);
    Categorie UpdateCategory(Categorie categorie);
    void  DeleteCategory(Long id);
}
