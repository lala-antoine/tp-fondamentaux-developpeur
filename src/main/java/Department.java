package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un département dans une entreprise.
 * Un département est caractérisé par un nom et une liste d'employés.
 */
public class Department {

    /**
     * Le nom du département.
     */
    private String name;

    /**
     * La liste des employés appartenant à ce département.
     */
    private List<Employee> employees;

    /**
     * Initialise un nouveau département avec un nom donné.
     *
     * @param name Le nom du département.
     * @throws IllegalArgumentException si le nom est nul ou vide.
     */
    public Department(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du département ne peut pas être vide.");
        }
        this.name = name;
        this.employees = new ArrayList<>(); // Initialisation de la liste des employés
    }

    /**
     * Ajoute un employé à la liste des employés du département.
     *
     * @param employee L'employé à ajouter. Si {@code null}, l'employé n'est pas ajouté.
     */
    public void addEmployee(Employee employee) {
        if (employee != null) {
            employees.add(employee);
        }
    }

    /**
     * Retire un employé de la liste des employés du département.
     *
     * @param employee L'employé à retirer.
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    /**
     * Retourne une copie de la liste des employés du département.
     *
     * @return Une liste immuable contenant les employés du département.
     */
    public List<Employee> listEmployees() {
        return new ArrayList<>(employees);
    }

    /**
     * Retourne le nom du département.
     *
     * @return Le nom du département.
     */
    public String getName() {
        return name;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du département.
     *
     * @return Une chaîne contenant le nom du département, le nombre d'employés et la liste des employés.
     */
    @Override
    public String toString() {
        StringBuilder departement = new StringBuilder("Nom du département : " + getName()
                + "\nNombre d'employés : " + listEmployees().size()
                + "\nListe des employés : \n");
        for (Employee employee : listEmployees()) {
            departement.append(employee.toString()).append("\n");
        }
        return departement.toString();
    }
}