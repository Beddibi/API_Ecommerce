package com.API_Ecommerce.project.Controler;

import com.API_Ecommerce.project.Model.Categorie;
import com.API_Ecommerce.project.services.CategorieService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Category")
public class CategoryController {
    private final CategorieService categorieService;

    public CategoryController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
    @GetMapping
    public List<Categorie> findAllCategory(){
        return categorieService.findAllCategory();
    }
    @GetMapping("/{id}")
    public Optional<Categorie> findCategoryById(@PathVariable("id") Long id){
        return categorieService.findById(id);
    }
    @PostMapping
    public  Categorie AddCategory(@RequestBody Categorie categorie){
        return categorieService.AddCategorie(categorie);
    }
    @PutMapping
    public Categorie updateCategory(@RequestBody Categorie categorie){
        return  categorieService.UpdateCategory(categorie);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") Long id){
        categorieService.DeleteCategory(id);
    }
}
