package com.ismo.crjj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Produit {

	@Id
	@GeneratedValue
	private int code;
	
	@Column
	private String libelle;
	
	@Column
	private String Famille;
	
	@Column
	private double prixachat;
	
	@Column
	private double prixvente;

	public Produit() {

	}

	public Produit(int code, String libelle, String famille, double prixachat, double prixvente) {
		super();
		this.code = code;
		this.libelle = libelle;
		Famille = famille;
		this.prixachat = prixachat;
		this.prixvente = prixvente;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getFamille() {
		return Famille;
	}

	public void setFamille(String famille) {
		Famille = famille;
	}

	public double getPrixachat() {
		return prixachat;
	}

	public void setPrixachat(double prixachat) {
		this.prixachat = prixachat;
	}

	public double getPrixvente() {
		return prixvente;
	}

	public void setPrixvente(double prixvente) {
		this.prixvente = prixvente;
	}

}
