/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.techevent.Model;

/**
 *
 * @author Yacine Ben Ouirane
 */
public class Localisation {

    private int idLocalisation;
    private String descriptionPlace;
    private double latitude;
    private double longitude;
    private int capacite;

    public Localisation() {
    }

    public Localisation(String descriptionPlace, double latitude, double longitude, int capacite) {
        this.descriptionPlace = descriptionPlace;
        this.latitude = latitude;
        this.longitude = longitude;
        this.capacite = capacite;
    }

    public Localisation(int idLocalisation, String descriptionPlace, double latitude, double longitude, int capacite) {
        this.idLocalisation = idLocalisation;
        this.descriptionPlace = descriptionPlace;
        this.latitude = latitude;
        this.longitude = longitude;
        this.capacite = capacite;
    }

    public int getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(int idLocalisation) {
        this.idLocalisation = idLocalisation;
    }

    public String getDescriptionPlace() {
        return descriptionPlace;
    }

    public void setDescriptionPlace(String descriptionPlace) {
        this.descriptionPlace = descriptionPlace;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

}
