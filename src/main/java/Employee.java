package main.java;

/**
 * Représente un employé dans une entreprise.
 * Un employé est caractérisé par son nom, un identifiant unique et sa position.
 */
public class Employee {

    /**
     * Le nom de l'employé.
     */
    private String nom;

    /**
     * L'identifiant unique de l'employé.
     */
    private int id;

    /**
     * La position ou le poste occupé par l'employé dans l'entreprise.
     */
    private String position;

    /**
     * Initialise un nouvel employé avec un nom, un identifiant et une position donnés.
     *
     * @param nom      Le nom de l'employé.
     * @param id       L'identifiant unique de l'employé.
     * @param position La position de l'employé.
     */
    public Employee(String nom, int id, String position) {
        this.nom = nom;
        this.id = id;
        this.position = position;
    }

    /**
     * Retourne le nom de l'employé.
     *
     * @return Le nom de l'employé.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne l'identifiant unique de l'employé.
     *
     * @return L'identifiant unique de l'employé.
     */
    public int getId() {
        return id;
    }

    /**
     * Retourne la position de l'employé dans l'entreprise.
     *
     * @return La position de l'employé.
     */
    public String getPosition() {
        return position;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'employé.
     *
     * @return Une chaîne contenant les informations sur l'employé : nom, identifiant et position.
     */
    @Override
    public String toString() {
        return "Nom : " + getNom()
                + "\nID : " + getId()
                + "\nPosition : " + getPosition();
    }
}