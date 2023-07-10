package com.API_Ecommerce.project.Repository;

import com.API_Ecommerce.project.Model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientReposetory extends JpaRepository<Clients,Long> {
}
