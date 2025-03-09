/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author hp
 */
public class Enseignant {
    private int id;
    private String nom;
    private String prenom;
    private String matière;

     public Enseignant(int id, String nom, String prenom, String matière) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.matière = matière;
    }
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
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

    
    public String getMatière() {
        return matière;
    }

   
    public void setMatière(String matière) {
        this.matière = matière;
    }
    
    
}
