package com.zagor.stockmanager.models;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends AbstractEntity {
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
    private String prenom;
	
	@Column(name="adresse")
    private Address address;
	
	@Column(name="date_de_naissance")
    private Instant dateDeNaissance;
	
	@Column(name="mot_de_passe")
    private String motDePasse;
	
	@Column(name="photo")
    private String photo;
    
    @Column(name="numero_tel")
    private int numerotel;
    
    @Column(name="company")
    private Company company;
    
    @Column(name="liste_role")
    private List<Role> roles;

}
