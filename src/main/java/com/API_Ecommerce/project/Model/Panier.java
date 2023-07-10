package com.API_Ecommerce.project.Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "panier")
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idpanier" )
    private Long IdPanier ;
    @Column(name ="idclient" )
    private Long IdClients;
    @Column(name ="datemodification" )
    private Date DateModification;

    public Panier() {
    }

    public Panier(Long idPanier, Long idClients, Date dateModification) {
        IdPanier = idPanier;
        IdClients = idClients;
        DateModification = dateModification;
    }

    public Long getIdPanier() {
        return IdPanier;
    }

    public void setIdPanier(Long idPanier) {
        IdPanier = idPanier;
    }

    public Long getIdClients() {
        return IdClients;
    }

    public void setIdClients(Long idClients) {
        IdClients = idClients;
    }

    public Date getDateModification() {
        return DateModification;
    }

    public void setDateModification(Date dateModification) {
        DateModification = dateModification;
    }
}
