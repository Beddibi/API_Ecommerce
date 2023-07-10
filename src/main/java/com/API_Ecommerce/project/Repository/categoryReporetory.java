package com.API_Ecommerce.project.Repository;

import com.API_Ecommerce.project.Model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryReporetory extends JpaRepository<Categorie, Long>{

}
