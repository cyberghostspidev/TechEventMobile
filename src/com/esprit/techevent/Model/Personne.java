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
public class Personne {

    private int idPersonne;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String profession;
    private String avatar;
    private int idUtilisateur;

    public Personne() {
    }

    public Personne(String nom, String prenom, Date dateNaissance, String profession, String avatar, int idUtilisateur) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.profession = profession;
        this.avatar = avatar;
        this.idUtilisateur = idUtilisateur;
    }

    public Personne(int idPersonne, String nom, String prenom, Date dateNaissance, String profession, String avatar, int idUtilisateur) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.profession = profession;
        this.avatar = avatar;
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
}
