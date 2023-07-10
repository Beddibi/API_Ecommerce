package com.API_Ecommerce.project.Controler;

import com.API_Ecommerce.project.Model.Facture;

import com.API_Ecommerce.project.services.FactureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/facture")
public class FactureController {
    private final FactureService fact;

    public FactureController(FactureService fact) {
        this.fact = fact;
    }
    @GetMapping
    public List<Facture> findAllFacture(){
        return fact.findAllFacture();
    }
    @GetMapping("/{id}")
    public Optional<Facture> findFactureById(@PathVariable("id") Long id){
        return fact.findById(id);
    }
    @PostMapping("/add")
    public  Facture AddFacture(@RequestBody Facture f){
        return fact.AddFacture(f);
    }
    @PutMapping
    public Facture updateFacture(@RequestBody Facture f){

        return  fact.UpdateFacture(f);
    }
    @DeleteMapping("/{id}")
    public void deleteFacture(@PathVariable("id") Long id){
        fact.DeleteFacture(id);
    }
}
