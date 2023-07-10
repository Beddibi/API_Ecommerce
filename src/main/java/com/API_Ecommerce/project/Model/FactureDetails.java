package com.API_Ecommerce.project.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "detailfacture")
public class FactureDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="iddetailfact")
    private Long IdDetails ;
    @Column(name ="idfacture")
    private Long IdFact ;
    @Column(name ="idproduit")
    private Long IdProduit;
    @Column(name ="qte")
    private int QteCommaner;

    public FactureDetails() {
    }

    public FactureDetails(Long idDetail, Long idFact, Long idProduit, int qteCommaner) {
        IdDetails=idDetail;
        IdFact = idFact;
        IdProduit = idProduit;
        QteCommaner = qteCommaner;
    }

    public Long getIdDetails() {
        return IdDetails;
    }

    public void setIdDetails(Long idDetails) {
        IdDetails = idDetails;
    }

    public Long getIdFact() {
        return IdFact;
    }

    public void setIdFact(Long idFact) {
        IdFact = idFact;
    }

    public Long getIdProduit() {
        return IdProduit;
    }

    public void setIdProduit(Long idProduit) {
        IdProduit = idProduit;
    }

    public int getQteCommaner() {
        return QteCommaner;
    }

    public void setQteCommaner(int qteCommaner) {
        QteCommaner = qteCommaner;
    }
}
