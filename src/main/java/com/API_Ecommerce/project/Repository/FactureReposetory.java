package com.API_Ecommerce.project.Repository;

import com.API_Ecommerce.project.Model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureReposetory extends JpaRepository<Facture,Long> {
}
