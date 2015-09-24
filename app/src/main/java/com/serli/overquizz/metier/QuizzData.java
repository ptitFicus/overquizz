package com.serli.overquizz.metier;

import java.io.Serializable;

public class QuizzData implements Serializable{
    private String name;
    private String type;
    private String designation;
    private String commune;
    private double latitude;
    private double longitude;
    private TimeInterval answer;
    private String description;
    private String historic;

    @Override
    public String toString() {
        return "QuizzData{" +
                "answer=" + answer +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", designation='" + designation + '\'' +
                ", commune='" + commune + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", description='" + description + '\'' +
                ", historic='" + historic + '\'' +
                '}';
    }

    public TimeInterval getAnswer() {
        return answer;
    }

    public String getCommune() {
        return commune;
    }

    public String getDescription() {
        return description;
    }

    public String getDesignation() {
        return designation;
    }

    public String getHistoric() {
        return historic;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public QuizzData(TimeInterval answer, String commune, String description, String designation, String historic, double latitude, double longitude, String name, String type) {

        this.answer = answer;
        this.commune = commune;
        this.description = description;
        this.designation = designation;
        this.historic = historic;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.type = type;
    }
}