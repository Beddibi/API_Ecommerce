package com.API_Ecommerce.project.services.Impl;

import com.API_Ecommerce.project.Model.Categorie;
import com.API_Ecommerce.project.Repository.categoryReporetory;
import com.API_Ecommerce.project.services.CategorieService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieServiceImpl implements CategorieService {
    private final categoryReporetory Cat;

    public CategorieServiceImpl(categoryReporetory cat) {
        Cat = cat;
    }


    @Override
    public List<Categorie> findAllCategory() {
        return Cat.findAll();
    }

    @Override
    public Optional<Categorie> findById(Long id) {
        return Cat.findById(id);
    }

    @Override
    public Categorie AddCategorie(Categorie categorie) {
        return Cat.save(categorie);
    }

    @Override
    public Categorie UpdateCategory(Categorie categorie) {
        /*
        return Cat.save(categorie);*/
        Optional<Categorie> existingCategory = Cat.findById(categorie.getIdcategorie());
        if (existingCategory.isPresent()) {
            Categorie updatedCategory = existingCategory.get();
            updatedCategory.setNomcategorie(categorie.getNomcategorie()); // Mettez à jour les propriétés appropriées de la catégorie

            // Mettez à jour d'autres propriétés si nécessaire

            return Cat.save(updatedCategory);
        } else {
            // Gérez le cas où la catégorie n'existe pas
            // Vous pouvez lancer une exception ou retourner null, selon vos besoins
            return null;
        }
    }

    @Override
    public void DeleteCategory(Long id) {
        Cat.deleteById(id);

    }
}
