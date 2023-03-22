package com.cnvt.bckend.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "convention")
public class Convention implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 

	@Column(name = "numConv")
	private double numero;
	
	@Column(name = "intituleConv")
	private String intitule;
		
	@Column(name = "typeConv")
	private String type;
	
	@Column(name = "secteur")
	private String secteur;
	
	@Column(name = "dateConseil")
	private Date date_conseil;

	
//	@Column(name = "montant")
//	private double montant;
//	
//	@Column(name = "dateVisa")
//	private Date date_visa;
//	
//	@Column(name = "duree")
//	private double duree;
//	
//	@Column(name = "maitriseOuvrage")
//	private String maitrise;
//	
//	@Column(name = "pdr")
//	private boolean pdr ;
//	
//	@Column(name = "service")
//	private String service;
//	
//	@Column(name = "partenaires")
//	private String partenaires;
	
	
	
	
	
	
	

	public Convention() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Convention(String intitule, String type, String secteur, Date date_conseil) {
		super();
		this.intitule = intitule;
		this.type = type;
		this.secteur = secteur;
		this.date_conseil = date_conseil;
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	public Date getDate_conseil() {
		return date_conseil;
	}

	public void setDate_conseil(Date date_conseil) {
		this.date_conseil = date_conseil;
	}
	
	
	
	
	
	
}
