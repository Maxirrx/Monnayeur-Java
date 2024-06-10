public class Valeur {

///crée le squellette des pieces qui seront de type valeur. Avec Quantité, Valeur et name
        private int Quantite;
        private double Valeur;
        private  String name;

///getter et setter
        public int getQuantite() {
            return Quantite;
        }
        public void setQuantite(int quantite) {
            Quantite = quantite;
        }
        public double getValeur() {
        return Valeur;
    }
        public void setValeur(double valeur) {
        Valeur = valeur;
    }
        public String getName() {
        return name;
    }
        public void setName(String name) {
        this.name = name;
    }

///ajout par défaut du monnayeur (méthode pas obligatoire apres reflexion)
    public  void AjouterDefaut(int Defaut){
        this.Quantite += Defaut;
    }

///methode d'ajout de piece dans le monnayeur pour la parite vendeur et client
    public  void AjouterPiece(int Ajout){
        this.Quantite += Ajout;
    }

///methode pour retirer des pieces partie client
    public  void RetirerPiece(int Retire){
        this.Quantite -= Retire;
    }


///constructeur
    public Valeur(int quantite, double valeur, String name) {
        Quantite = quantite;
        Valeur = valeur;
        this.name = name;
    }
}
