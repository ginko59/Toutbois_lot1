package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlValue;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Contact {
	protected StringProperty enseigne;
	protected StringProperty siret;
	protected StringProperty civilite;
	protected StringProperty nom;
	protected StringProperty prenom ;
	protected StringProperty fonction;
	protected StringProperty email;
	protected StringProperty tel;
	protected IntegerProperty nbCommande;
	protected Adresse adresse = new Adresse();
	
	
	
	public String getEnseigne() {
		return enseigne.get();
	}
	
	public String getSiret() {
		return siret.get();
	}
	
	public String getCivilite() {
		return civilite.get();
	}
	
	public String getNom() {
		return nom.get();
	}
	
	public String getPrenom() {
		return prenom.get();
	}
	
	public String getFonction() {
		return fonction.get();
	}
	
	public String getEmail() {
		return email.get();
	}
	
	public String getTel() {
		return tel.get();
	}
	
	public Integer getNbCommande() {
		return nbCommande.get();
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	
	
	public void setEnseigne(String enseigne) {
		this.enseigne.set(enseigne);
	}
	public void setSiret(String siret) {
		this.siret.set(siret);
	}
	public void setCivilite(String civilite) {
		this.civilite.set(civilite);
	}
	public void setNom(String nom) {
		this.nom.set(nom);
	}
	public void setPrenom(String prenom) {
		this.prenom.set(prenom);
	}
	public void setFonction(String fonction) {
		this.fonction.set(fonction);
	}
	public void setEmail(String email) {
		this.email.set(email);
	}
	public void setTel(String tel) {
		this.tel.set(tel);
	}
	public void setNbCommande(Integer commande) {
		this.nbCommande.set(commande);
	}
	
	
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public StringProperty enseigneProperty(){
		return enseigne;
			}
	
	public StringProperty siretProperty(){
		return siret;
	}
	public StringProperty civiliteProperty(){
		return civilite;
	}
	public StringProperty nomProperty(){
		return nom;
	}
	public StringProperty prenomProperty(){
		return prenom;
	}
	public StringProperty fonctionProperty(){
		return fonction;
	}
	public StringProperty emailProperty(){
		return email;
	}
	
	public StringProperty telProperty(){
		return tel;
	}
	public IntegerProperty nbCommandeProperty() {
		return nbCommande;
	}
	
	
	public Contact(StringProperty enseigne, StringProperty siret, StringProperty civilite, StringProperty nom, StringProperty prenom, StringProperty fonction,
			StringProperty email, StringProperty tel, int nbCommande, Adresse adresse) {		
		this.enseigne = enseigne;
		this.siret = siret;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.email = email;
		this.tel = tel;
		this.adresse = adresse;
	}
	
	public Contact() {
		
		this.enseigne = new SimpleStringProperty("");
		this.siret = new SimpleStringProperty("");
		this.civilite = new SimpleStringProperty("");
		this.nom = new SimpleStringProperty("");
		this.prenom = new SimpleStringProperty("");
		this.fonction = new SimpleStringProperty("");
		this.email = new SimpleStringProperty("");
		this.tel = new SimpleStringProperty("");
		this.nbCommande = new SimpleIntegerProperty(0);
		//this.adresse = new Adresse();
		
		
	}
	
	
	
	
	

}
