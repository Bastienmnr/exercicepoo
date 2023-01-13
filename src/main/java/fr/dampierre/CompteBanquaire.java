package fr.dampierre;

public class CompteBanquaire {
    private String nomProprietaire;
    private int solde;

CompteBanquaire (String nomProprietaire,int solde) {
    this.nomProprietaire =nomProprietaire ;
    this.solde =solde;
}

public void depotBanque (int depot) {
 if (depot>0) {   solde = solde + depot ; } 
}

public void retraitBanque (int retrait ) {
    if (retrait <= solde) {
    solde = solde - retrait;}
    else System.out.println("ERREUR, il vous manque "+ (retrait-solde) +" euros pour effectuer ce retrait");
}

public void affichierInfo () {
    System.out.println("Nom du propriétaire: "+nomProprietaire+ ", solde total: "+solde
    +" euros");
}

}
