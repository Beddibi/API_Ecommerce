package com.API_Ecommerce.project.Repository;

import com.API_Ecommerce.project.Model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReporsetory  extends JpaRepository<user,Long> {

}
