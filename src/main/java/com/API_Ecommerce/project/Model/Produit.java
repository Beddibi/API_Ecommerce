package com.API_Ecommerce.project.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idproduit" )
    private Long idproduit ;
    @ManyToOne
    @JoinColumn(name = "idcategorie")
    private Categorie CategoryId;
    @Column(name ="description" )
    private String Description;
    @Column(name ="nom_produit" )
    private String NomProduit;
    @Column(name ="prix" )
    private double Prix;
    @Column(name ="reference" )
    private String References;
    @Column(name ="imagepath" )
    private String Imagepath;


    public Produit() {
    }

    public Produit(Long idproduit, Categorie categoryId, String references, String description, double prix, String nomProduit,String imagepath) {
        this.idproduit = idproduit;
        CategoryId = categoryId;
        References = references;
        Description = description;
        Prix = prix;
        NomProduit = nomProduit;
        Imagepath = imagepath;
    }

    public Long getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(Long idproduit) {
        this.idproduit = idproduit;
    }

    public Categorie getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Categorie categoryId) {
        CategoryId = categoryId;
    }

    public String getReferences() {
        return References;
    }

    public void setReferences(String references) {
        References = references;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double prix) {
        Prix = prix;
    }

    public String getNomProduit() {
        return NomProduit;
    }

    public void setNomProduit(String nomProduit) {
        NomProduit = nomProduit;
    }
}
