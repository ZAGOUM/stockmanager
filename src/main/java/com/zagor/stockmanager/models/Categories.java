package com.zagor.stockmanager.models;

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
public class Categories extends AbstractEntity{
	
	@Column(name="code_category")
	private String codeCategory;
	
	@Column(name="designation")
	private String designation;

}
