package com.API_Ecommerce.project.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idfact")
    private Long IdFact ;
    @Column(name ="idclient")
    private Long IdClient;
    @Column(name ="datecommande")
    private Date DateCommande;
    @Column(name ="total")
    private Double Totale;

    public Facture() {
    }

    public Facture(Long idFact, Long idClient, Date dateCommande, Double totale) {
        IdFact = idFact;
        IdClient = idClient;
        DateCommande = dateCommande;
        Totale = totale;
    }

    public Long getIdFact() {
        return IdFact;
    }

    public void setIdFact(Long idFact) {
        IdFact = idFact;
    }

    public Long getIdClient() {
        return IdClient;
    }

    public void setIdClient(Long idClient) {
        IdClient = idClient;
    }

    public Date getDateCommande() {
        return DateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        DateCommande = dateCommande;
    }

    public Double getTotale() {
        return Totale;
    }

    public void setTotale(Double totale) {
        Totale = totale;
    }
}
