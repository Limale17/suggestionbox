package com.codeinfini.suggestionbox.model;

//import java.time.LocalDate;

public class Etudiant {
	private Long id;
	private String prenom;
	private String nom;
	private String adresse;
	private String telephone;
	private String sexe;
	private String email;
	//LocalDate dateNaissance;
	private String dateNaissance;
	private String lieuNaissance;
	private String filiere;
	private String niveau;
	private String nationalite;
	
	public Etudiant() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSexe() {
		return sexe;
	}



	public void setSexe(String sexe) {
		this.sexe = sexe;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDateNaissance() {
		return dateNaissance;
	}



	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	public String getLieuNaissance() {
		return lieuNaissance;
	}



	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}



	public String getFiliere() {
		return filiere;
	}



	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}



	public String getNiveau() {
		return niveau;
	}



	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}



	public String getNationalite() {
		return nationalite;
	}



	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}



	@Override
	public String toString() {
		return "Etudiant [prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + ", telephone=" + telephone
				+ ", sexe=" + sexe + ", email=" + email + ", dateNaissance=" + dateNaissance + ", lieuNaissance="
				+ lieuNaissance + ", filiere=" + filiere + ", niveau=" + niveau + ", nationalite=" + nationalite + "]";
	}

	
}
