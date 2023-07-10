package com.API_Ecommerce.project.Repository;

import com.API_Ecommerce.project.Model.FactureDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneFactureReposetory extends JpaRepository<FactureDetails,Long> {
}
