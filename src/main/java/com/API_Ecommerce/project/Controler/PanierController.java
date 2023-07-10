package com.API_Ecommerce.project.Controler;

import com.API_Ecommerce.project.Model.Panier;
import com.API_Ecommerce.project.services.PanierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/panier")
public class PanierController {
    final PanierService panierService;

    public PanierController(PanierService panierService) {
        this.panierService = panierService;
    }
    @GetMapping
    public List<Panier> findAllLigne(){
        return panierService.findAllPanier();
    }
    @GetMapping("/{id}")
    public Optional<Panier> findPanierById(@PathVariable("id") Long id){
        return panierService.findById(id);
    }
    @PostMapping("/add")
    public Panier AddLigne(@RequestBody Panier panier){
        return panierService.AddPanier(panier);
    }
    @PutMapping
    public Panier updateQTEArticle(@RequestBody Panier panier){

        return  panierService.UpdatePanier(panier);
    }
    @DeleteMapping("/{id}")
    public void deletePanierById(@PathVariable("id") Long id){
        panierService.DeletePanier(id);
    }
}
