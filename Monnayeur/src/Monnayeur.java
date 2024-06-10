public class Monnayeur {

///création des attributs
    private Valeur UnCentime;
    private Valeur DeuxCentime;
    private Valeur CinqCentime;
    private Valeur DixCentime;
    private Valeur VingtCentime;
    private Valeur CinquanteCentime;
    private Valeur UnEuro;
    private Valeur DeuxEuro;
    private Valeur CinqEuro;
    private Valeur DixEuro;
    private Valeur VingtEuro;
    private Valeur CinquantEuro;


///méthode de remplissage par défaut presente dans la classe valeur
    public void MonnayeurParDefaut(int UnCentime, int DeuxCentime, int CinqCentime, int DixCentime,int VingtCentime, int CinquanteCentime,int UnEuro, int DeuxEuro, int CinqEuro, int DixEuro, int VingtEuro, int CinquanteEuro){

        this.UnCentime.AjouterDefaut(UnCentime);
        this.DeuxCentime.AjouterDefaut(DeuxCentime);
        this.CinqCentime.AjouterDefaut(CinqCentime);
        this.DixCentime.AjouterPiece(DixCentime);
        this.VingtCentime.AjouterDefaut(VingtCentime);
        this.CinquanteCentime.AjouterDefaut(CinquanteCentime);
        this.UnEuro.AjouterDefaut(UnEuro);
        this.DeuxEuro.AjouterDefaut(DeuxEuro);
        this.CinqEuro.AjouterDefaut(CinqEuro);
        this.DixEuro.AjouterDefaut(DixEuro);
        this.VingtEuro.AjouterDefaut(VingtEuro);
        this.CinquantEuro.AjouterDefaut(CinquanteEuro);
    }

///methode pour afficher la quantité de piece presentes dans le monnayeur ainsi que leurs noms
    public void AfficherQuantite() {
        System.out.println("Actuellement dans le monnayeur");
        System.out.println("Il y a " + UnCentime.getQuantite() + " piece de " + UnCentime.getName() + ".");
        System.out.println("Il y a " + DeuxCentime.getQuantite() + " piece de " + DeuxCentime.getName() + ".");
        System.out.println("Il y a " + CinqCentime.getQuantite() + " piece de " + CinqCentime.getName() + ".");
        System.out.println("Il y a " + DixCentime.getQuantite() + " piece de " + DixCentime.getName() + ".");
        System.out.println("Il y a " + VingtCentime.getQuantite() + " piece de " + VingtCentime.getName() + ".");
        System.out.println("Il y a " + CinquanteCentime.getQuantite() + " piece de " + CinquanteCentime.getName() + ".");
        System.out.println("Il y a " + UnEuro.getQuantite() + " piece de " + UnEuro.getName() + ".");
        System.out.println("Il y a " + DeuxEuro.getQuantite() + " piece de " + DeuxEuro.getName() + ".");
        System.out.println("Il y a " + CinqEuro.getQuantite() + " billet de " + CinqEuro.getName() + ".");
        System.out.println("Il y a " + DixEuro.getQuantite() + " billet de " + DixEuro.getName() + ".");
        System.out.println("Il y a " + VingtEuro.getQuantite() + " billet de " + VingtEuro.getName() + ".");
        System.out.println("Il y a " + CinquantEuro.getQuantite() + " billet de " + CinquantEuro.getName() + ".");
        System.out.println("Ce qui fait au total " + CalculeTotal() + " Euros !!" );
    }


///calcule de la somme total des pieces et billets présents dans le monnayeur
    public double CalculeTotal() {
        double total = 0.0;
        total += UnCentime.getQuantite() * UnCentime.getValeur();
        total += DeuxCentime.getQuantite() * DeuxCentime.getValeur();
        total += CinqCentime.getQuantite() * CinqCentime.getValeur();
        total += DixCentime.getQuantite() * DixCentime.getValeur();
        total += VingtCentime.getQuantite() * VingtCentime.getValeur();
        total += CinquanteCentime.getQuantite() * CinquanteCentime.getValeur();
        total += UnEuro.getQuantite() * UnEuro.getValeur();
        total += DeuxEuro.getQuantite() * DeuxEuro.getValeur();
        total += CinqEuro.getQuantite() * CinqEuro.getValeur();
        total += DixEuro.getQuantite() * DixEuro.getValeur();
        total += VingtEuro.getQuantite() * VingtEuro.getValeur();
        total += CinquantEuro.getQuantite() * CinquantEuro.getValeur();
        return total;
    }
///ajoute les piecees pour les calcules
    public void ajouteruncentime(int quantite) {
        UnCentime.AjouterPiece(quantite);
    }
    public void ajouterdeuxcentime(int quantite) {
        DeuxCentime.AjouterPiece(quantite);
    }
    public void ajoutercinqcentime(int quantite) {
        CinqCentime.AjouterPiece(quantite);
    }
    public void ajouterDixCentimes(int quantite) {
        DixCentime.AjouterPiece(quantite);
    }

    public void ajouterVingtCentimes(int quantite) {
        VingtCentime.AjouterPiece(quantite);
    }

    public void ajouterCinquanteCentimes(int quantite) { CinquanteCentime.AjouterPiece(quantite);
    }

    public void ajouterUnEuro(int quantite) {
        UnEuro.AjouterPiece(quantite);
    }

    public void ajouterDeuxEuros(int quantite) {
        DeuxEuro.AjouterPiece(quantite);
    }

    public void ajouterCinqEuros(int quantite) {
        CinqEuro.AjouterPiece(quantite);
    }

    public void ajouterDixEuros(int quantite) {
        DixEuro.AjouterPiece(quantite);
    }

    public void ajouterVingtEuros(int quantite) {
        VingtEuro.AjouterPiece(quantite);
    }

    public void ajouterCinquanteEuros(int quantite) {
        CinquantEuro.AjouterPiece(quantite);
    }






    ///retire les pieces pour les calcules
    public void retirerUnCentime(int quantite) {
        UnCentime.RetirerPiece(quantite);
    }

    public void retirerDeuxCentimes(int quantite) {
        DeuxCentime.RetirerPiece(quantite);
    }

    public void retirerCinqCentimes(int quantite) {
        CinqCentime.RetirerPiece(quantite);
    }

    public void retirerDixCentimes(int quantite) {
        DixCentime.RetirerPiece(quantite);
    }

    public void retirerVingtCentimes(int quantite) {
        VingtCentime.RetirerPiece(quantite);
    }

    public void retirerCinquanteCentimes(int quantite) {
        CinquanteCentime.RetirerPiece(quantite);
    }

    public void retirerUnEuro(int quantite) {
        UnEuro.RetirerPiece(quantite);
    }

    public void retirerDeuxEuros(int quantite) {
        DeuxEuro.RetirerPiece(quantite);
    }

    public void retirerCinqEuros(int quantite) {
        CinqEuro.RetirerPiece(quantite);
    }

    public void retirerDixEuros(int quantite) {
        DixEuro.RetirerPiece(quantite);
    }

    public void retirerVingtEuros(int quantite) {
        VingtEuro.RetirerPiece(quantite);
    }

    public void retirerCinquanteEuros(int quantite) {
        CinquantEuro.RetirerPiece(quantite);
    }




///getter de toutes les pieces et billets
    public Valeur getUnCentime() {
        return UnCentime;
    }

    public Valeur getDeuxCentime() {
        return DeuxCentime;
    }

    public Valeur getCinqCentime() {
        return CinqCentime;
    }

    public Valeur getDixCentime() {
        return DixCentime;
    }

    public Valeur getVingtCentime() {
        return VingtCentime;
    }

    public Valeur getCinquanteCentime() {
        return CinquanteCentime;
    }

    public Valeur getUnEuro() {
        return UnEuro;
    }

    public Valeur getDeuxEuro() {
        return DeuxEuro;
    }

    public Valeur getCinqEuro() {
        return CinqEuro;
    }

    public Valeur getDixEuro() {
        return DixEuro;
    }

    public Valeur getVingtEuro() {
        return VingtEuro;
    }

    public Valeur getCinquantEuro() {
        return CinquantEuro;
    }





    ///setter de toutes les pieces et billets
    public void setUnCentime(Valeur unCentime) {
        UnCentime = unCentime;
    }

    public void setDeuxCentime(Valeur deuxCentime) {
        DeuxCentime = deuxCentime;
    }

    public void setCinqCentime(Valeur cinqCentime) {
        CinqCentime = cinqCentime;
    }

    public void setDixCentime(Valeur dixCentime) {
        DixCentime = dixCentime;
    }

    public void setVingtCentime(Valeur vingtCentime) {
        VingtCentime = vingtCentime;
    }

    public void setCinquanteCentime(Valeur cinquanteCentime) {
        CinquanteCentime = cinquanteCentime;
    }

    public void setUnEuro(Valeur unEuro) {
        UnEuro = unEuro;
    }

    public void setDeuxEuro(Valeur deuxEuro) {
        DeuxEuro = deuxEuro;
    }

    public void setCinqEuro(Valeur cinqEuro) {
        CinqEuro = cinqEuro;
    }

    public void setDixEuro(Valeur dixEuro) {
        DixEuro = dixEuro;
    }

    public void setVingtEuro(Valeur vingtEuro) {
        VingtEuro = vingtEuro;
    }

    public void setCinquantEuro(Valeur cinquantEuro) {
        CinquantEuro = cinquantEuro;
    }



///création du Monnayeur et de la facon dont il va s'afficher
    public Monnayeur() {
        UnCentime = new Valeur(0, 0.01, "Un centime");
        DeuxCentime = new Valeur(0, 0.02,"Deux centimes");
        CinqCentime = new Valeur(0, 0.05," Cinq centimes");
        DixCentime = new Valeur(0, 0.10, "Dix centimes");
        VingtCentime = new Valeur(0, 0.20, "Vingt centimes");
        CinquanteCentime = new Valeur(0, 0.50, "Cinquantes centimes");
        UnEuro = new Valeur(0, 1, "Un euro");
        DeuxEuro= new Valeur(0,2, "Deux euros");
        CinqEuro = new Valeur(0, 5 , "Cinq euro");
        DixEuro = new Valeur(0, 10, "Dix euro");
        VingtEuro = new Valeur(0, 20, "Vingt euro");
        CinquantEuro = new Valeur(0, 50, "Cinquante euro");
    }
}