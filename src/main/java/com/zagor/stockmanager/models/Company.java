package com.zagor.stockmanager.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="company")
public class Company extends AbstractEntity {
	
	@Column(name="code")
	private String code;
	
	@Column(name="nom")
    private String nom;
	
	@Column(name="address")
    private Address address;
	
	@Column(name="description")
    private String description;
	
	@Column(name="code_fiscal")
    private String codeFiscal;
	
	@Column(name="site_web")
    private String siteWeb;
	
	@Column(name="numero")
    private String numero;
	
	@Column(name="mail")
    private String mail;
	
	@Column(name="photo")
    private String photo;
	
	@Column(name="liste_user")
    private List<User> utilisateur;

}
