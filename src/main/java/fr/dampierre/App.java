package fr.dampierre;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class App {

  public static void main(String[] args) {

    // Employe Bastien = new Employe("Monier", "Bastien", 20, 1000);
    // Employe Jean = new Employe("Jean", "Jean", 40, 1000);


    // Bastien.augmentationSalaire(0);
    // Jean.augmentationSalaire(20);


    // Bastien.afficherInfo();

  CompteBanquaire Compte1 = new CompteBanquaire("Bastien", 1000);

  Compte1.affichierInfo();

  Compte1.retraitBanque(1300);
  Compte1.affichierInfo();

  Compte1.depotBanque(500);
  Compte1.affichierInfo();

  Compte1.retraitBanque(1300);
  Compte1.affichierInfo();
 




  }
}