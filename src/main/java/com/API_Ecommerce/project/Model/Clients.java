package com.API_Ecommerce.project.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idclient")
    private Long idclient ;
    @Column(name ="iduser")
    private Long UserID;
    @Column(name ="adresse")
    private String adress;
    @Column(name ="tel")
    private String telephone;

    public Clients() {
    }

    public Clients(Long idclient, Long userID, String adress, String telephone) {
        this.idclient = idclient;
       this.UserID = userID;
        this.adress = adress;
        this.telephone = telephone;
    }

    public Long getIdclient() {
        return idclient;
    }

    public void setIdclient(Long idclient) {
        this.idclient = idclient;
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
