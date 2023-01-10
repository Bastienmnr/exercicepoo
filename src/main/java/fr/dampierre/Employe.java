package fr.dampierre;



public class Employe {
  private String nom;
  private String prenom;
  private int age;
  private double salaire;

  Employe(String nom, String prenom, int age, double salaire) {
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    this.salaire = salaire;
  }

  public void augmentationSalaire(int pourcentage) {
    salaire = salaire + (salaire * (pourcentage / 100));
  }

  public void afficherInfo (){
    System.out.println(nom +" "+prenom+" ; "+ age+" ans ; "+salaire+ " € de salaire"); 

  }





}