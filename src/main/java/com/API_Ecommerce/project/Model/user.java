package com.API_Ecommerce.project.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="iduser" )
    private Long iduser ;
    @Column(name ="nom" )
    private String Nom;
    @Column(name ="prenom" )
    private String Prenom;
    @Column(name ="email" )
    private String Email;
    @Column(name ="motdepasse" )
    private String Password;
    @Column(name ="isadmin" )
    private Boolean IsAdmin;

    public user() {
    }

    public user(Long iduser, String nom, String prenom, String email, String password, Boolean isAdmin) {
        this.iduser = iduser;
        Nom = nom;
        Prenom = prenom;
        Email = email;
        Password = password;
        IsAdmin = isAdmin;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Boolean getAdmin() {
        return IsAdmin;
    }

    public void setAdmin(Boolean admin) {
        IsAdmin = admin;
    }
}
