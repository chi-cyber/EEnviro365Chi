package com.enviro.assessment.grad001.chinweachugo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "Eco-Tracker")
public class EcoTracker implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fileName;
    private String location;
    private String wastManagement;
    private String recycling;
    private String floodRisk;

    public EcoTracker() {
    }

    public EcoTracker(String location, String wastManagement, String recycling, String floodRisk) {
        this.location = location;
        this.wastManagement = wastManagement;
        this.recycling = recycling;
        this.floodRisk = floodRisk;
    }


    public int getFileName() {
        return fileName;
    }

    public String getLocation() {
        return location;
    }

    public String getWastManagement() {
        return wastManagement;
    }

    public String getRecycling() {
        return recycling;
    }

    public String getFloodRisk() {
        return floodRisk;
    }

    public void setFileName(int fileName) {
        this.fileName = fileName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setWastManagement(String wastManagement) {
        this.wastManagement = wastManagement;
    }

    public void setRecycling(String recycling) {
        this.recycling = recycling;
    }

    public void setFloodRisk(String floodRisk) {
        this.floodRisk = floodRisk;
    }

    @Override
    public String toString() {
        return "EcoTracker{" +
                "fileName=" + fileName +
                ", location='" + location + '\'' +
                ", wastManagement='" + wastManagement + '\'' +
                ", recycling='" + recycling + '\'' +
                ", floodRisk='" + floodRisk + '\'' +
                '}';
    }
}
