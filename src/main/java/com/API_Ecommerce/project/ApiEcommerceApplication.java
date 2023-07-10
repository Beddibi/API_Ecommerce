package com.API_Ecommerce.project;

import com.API_Ecommerce.project.dataacess.DAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;

@SpringBootApplication
public class ApiEcommerceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiEcommerceApplication.class, args);
		DAO db = new DAO();
		Connection cnx=  db.Connect_to_database("apiecommerce","postgres","123456789");
	}

}
