package fr.dampierre;

public class App {

  public static void main(String[] args) {

    Employe Bastien = new Employe("Monier", "Bastien", 20, 1000);
    Employe Jean = new Employe("Jean", "Jean", 40, 1000);


    Bastien.augmentationSalaire(0);
    Jean.augmentationSalaire(20);


    Bastien.afficherInfo();

   

  }
}