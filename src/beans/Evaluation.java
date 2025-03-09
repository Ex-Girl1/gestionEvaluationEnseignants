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
public class Evaluation {
    private int id;
    private Enseignant enseignant;
    private Etudiant etudiant;
    private int note;
    private String commentaire;

    public Evaluation(int id, Enseignant enseignant, Etudiant etudiant, int note, String commentaire) {
        this.id = id;
        this.enseignant = enseignant;
        this.etudiant = etudiant;
        this.note = note;
        this.commentaire = commentaire;
    }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public Enseignant getEnseignant() {
        return enseignant;
    }

   
    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    
    public Etudiant getEtudiant() {
        return etudiant;
    }

    /**
     * @param etudiant the etudiant to set
     */
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    
    public int getNote() {
        return note;
    }

    
    public void setNote(int note) {
        this.note = note;
    }

  
    public String getCommentaire() {
        return commentaire;
    }

   
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    
}
