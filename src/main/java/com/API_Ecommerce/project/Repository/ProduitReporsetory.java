package com.API_Ecommerce.project.Repository;


import com.API_Ecommerce.project.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitReporsetory extends JpaRepository<Produit,Long> {
    /*@Query("SELECT p FROM produit p JOIN FETCH p.categorie")
    List<Produit> findAllWithCategory();*/
}
