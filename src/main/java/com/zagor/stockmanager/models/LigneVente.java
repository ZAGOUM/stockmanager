package com.zagor.stockmanager.models;

import java.math.BigDecimal;

import javax.persistence.Column;

public class LigneVente extends AbstractEntity {
	
	@Column(name="vente")
	private Vente vente;
	
	@Column(name="prix_unitaire")
    private BigDecimal prixUnitaire;
    
	@Column(name="quantite")
    private BigDecimal quantity;

}
