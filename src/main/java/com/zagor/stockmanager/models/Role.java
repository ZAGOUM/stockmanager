package com.zagor.stockmanager.models;

import javax.persistence.Column;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="role")
public class Role {
	
	@Column(name="utilisateur")
	private User utilisateur;
	
	@Column(name="nom")
    private String nom;

}
