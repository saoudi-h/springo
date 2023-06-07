package com.saoudi.springo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Etudiants")
public class Student {

    @Id
    private String id;
    private String nom;
    private String prenom;
    private String date_naissance;
    private Notes notes;
    private Adresse adresse;
    private String filiere;

    // Constructeurs, getters et setters

    public Student() {
    }

    public Student(String nom, String prenom, String date_naissance, Notes notes, Adresse adresse, String filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.notes = notes;
        this.adresse = adresse;
        this.filiere = filiere;
    }

    // Classe interne pour les notes
    public static class Notes {
        private int math;
        private int info;

        public int getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
        }

        public int getInfo() {
            return info;
        }

        public void setInfo(int info) {
            this.info = info;
        }

        public int getPhilo() {
            return philo;
        }

        public void setPhilo(int philo) {
            this.philo = philo;
        }

        private int philo;

        // Constructeurs, getters et setters

        public Notes() {
        }

        public Notes(int math, int info, int philo) {
            this.math = math;
            this.info = info;
            this.philo = philo;
        }
    }

    // Classe interne pour l'adresse
    public static class Adresse {
        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        private double longitude;
        private double latitude;

        // Constructeurs, getters et setters

        public Adresse() {
        }

        public Adresse(double longitude, double latitude) {
            this.longitude = longitude;
            this.latitude = latitude;
        }
    }

    // Getters et setters pour les champs

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}