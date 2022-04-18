package com.zagor.stockmanager.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LigneCmdFournisseur extends AbstractEntity {
	
	@Column(name="article")
	private Article article;
	
	@Column(name="cmd_fournisseur")
    private CmdFournisseur cmdFournisseur;
	
	@Column(name="prix_unitaire")
    private BigDecimal prixUnitaire;
	
	@Column(name="quantite")
    private BigDecimal quantity;
}
