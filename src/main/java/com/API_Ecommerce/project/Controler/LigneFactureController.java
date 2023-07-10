package com.API_Ecommerce.project.Controler;

import com.API_Ecommerce.project.Model.Facture;
import com.API_Ecommerce.project.Model.FactureDetails;
import com.API_Ecommerce.project.services.FactureDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detailsfacture")
public class LigneFactureController {
    final FactureDetailsService factureDetailsService;

    public LigneFactureController(FactureDetailsService factureDetailsService) {
        this.factureDetailsService = factureDetailsService;
    }
    @GetMapping
    public List<FactureDetails> findAllLigne(){
        return factureDetailsService.findAllLigneFacture();
    }
    @GetMapping("/{id}")
    public Optional<FactureDetails> findLigneById(@PathVariable("id") Long id){
        return factureDetailsService.findById(id);
    }
    @PostMapping("/add")
    public FactureDetails AddLigne(@RequestBody FactureDetails f){
        return factureDetailsService.AddFactureLigne(f);
    }
    @PutMapping
    public FactureDetails updateQTEArticle(@RequestBody FactureDetails f){

        return  factureDetailsService.UpdateFactureLigne(f);
    }
    @DeleteMapping("/{id}")
    public void deleteLigneById(@PathVariable("id") Long id){
        factureDetailsService.DeleteFactureLigne(id);
    }
}
