package com.API_Ecommerce.project.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "categorie")

public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="idcategorie" )
	private Long idcategorie ;
	@Column(name ="nomcategorie" )
	private String nomcategorie;

	public Categorie() {
	}

	public Categorie(Long idcategorie, String nomcategorie) {
		this.idcategorie = idcategorie;
		this.nomcategorie = nomcategorie;
	}

	public Long getIdcategorie() {
		return idcategorie;
	}

	public void setIdcategorie(Long idcategorie) {
		this.idcategorie = idcategorie;
	}

	public String getNomcategorie() {
		return nomcategorie;
	}

	public void setNomcategorie(String nomcategorie) {
		this.nomcategorie = nomcategorie;
	}
}
