package com.zagor.stockmanager.models;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MvmtStck extends AbstractEntity {
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="date_mvt")
    private Instant datemvt;
	
	@Column(name="quantite")
    private BigDecimal quantity;
	
	@Column(name="article")
    private Article article;
    

}
