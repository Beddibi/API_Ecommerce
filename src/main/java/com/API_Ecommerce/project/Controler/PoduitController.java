package com.API_Ecommerce.project.Controler;

import com.API_Ecommerce.project.Model.Produit;
import com.API_Ecommerce.project.services.ProduitService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Poduit")
public class PoduitController {
    private final ProduitService produitService;

    public PoduitController(ProduitService produitService) {
        this.produitService = produitService;
    }


    @GetMapping
    public List<Produit> findAllProduit(){
        return produitService.findAllProduit();
    }

    @GetMapping("/{id}")
    public Optional<Produit> findProduitById(@PathVariable("id") Long id){
        return produitService.findById(id);
    }
    @PostMapping("/addproduit")
    public  Produit AddProduit(@RequestBody Produit produit){
        return produitService.AddProduit(produit);
    }
    @PutMapping
    public Produit updateProduit(@RequestBody Produit produit){
        return  produitService.UpdateProduit(produit);
    }
    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable("id") Long id){
        produitService.DeleteProduit(id);
    }
}
