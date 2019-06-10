/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.techevent.Model;

import java.util.Date;

/**
 *
 * @author Yacine Ben Ouirane
 */
public class Evenement {

    private int idEvenement;
    private String nom;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private String affiche;
    private int nbMaxParticipant;
    private String observation;
    private boolean validite;
    private boolean cloture;
    private int idCategorie;
    private int idLocalisation;

    public Evenement() {
    }

    public Evenement(int idEvenement, String nom, String description, Date dateDebut, Date dateFin, String affiche, int nbMaxParticipant, String observation, boolean validite, boolean cloture, int idCategorie, int idLocalisation) {
        this.idEvenement = idEvenement;
        this.nom = nom;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.affiche = affiche;
        this.nbMaxParticipant = nbMaxParticipant;
        this.observation = observation;
        this.validite = validite;
        this.cloture = cloture;
        this.idCategorie = idCategorie;
        this.idLocalisation = idLocalisation;
    }

    public Evenement(String nom, String description, Date dateDebut, Date dateFin, String affiche, int nbMaxParticipant, String observation, boolean validite, boolean cloture, int idCategorie, int idLocalisation) {
        this.nom = nom;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.affiche = affiche;
        this.nbMaxParticipant = nbMaxParticipant;
        this.observation = observation;
        this.validite = validite;
        this.cloture = cloture;
        this.idCategorie = idCategorie;
        this.idLocalisation = idLocalisation;
    }

    public int getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getAffiche() {
        return affiche;
    }

    public void setAffiche(String affiche) {
        this.affiche = affiche;
    }

    public int getNbMaxParticipant() {
        return nbMaxParticipant;
    }

    public void setNbMaxParticipant(int nbMaxParticipant) {
        this.nbMaxParticipant = nbMaxParticipant;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public boolean isValidite() {
        return validite;
    }

    public void setValidite(boolean validite) {
        this.validite = validite;
    }

    public boolean isCloture() {
        return cloture;
    }

    public void setCloture(boolean cloture) {
        this.cloture = cloture;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public int getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(int idLocalisation) {
        this.idLocalisation = idLocalisation;
    }

}
