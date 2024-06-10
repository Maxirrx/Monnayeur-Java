/// permet de mettre les double avec seulement deux chiffres apres la virgule
import java.text.DecimalFormat;
///scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

///ceci initie le monnayeur et le recharge de 10 pieces ou billets de chaque
        Monnayeur monnayeur = new Monnayeur();
        monnayeur.MonnayeurParDefaut(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);

///import la fonction scanner et crée des variable importantes
        Scanner scanner = new Scanner(System.in);
        int run = 1;
        int permission = 1;
        double prixArticle = 0;

///commence le do while qui va permettre de ne jamais quitte le code
        do {

///demande de quel coté de la caisse vous voulez êtres
            System.out.println();
            System.out.println("----------------------------Êtes-vous :-------------------------------");
            System.out.println("--------------------------1. Un vendeur-------------------------------");
            System.out.println(" -------------------------2. Un client--------------------------------");
            System.out.println();
            int starter = scanner.nextInt();


///demande la tache a réaliser coté vendeur
            if (starter == 1) {
                System.out.println();
                System.out.println("--------------------Bienvenue coté Vendeur------------------------");
                System.out.println();
                System.out.println("---------------1. Voulez vous voir l'état du monnayeur------------");
                System.out.println( "---------------------2. Recharger le monnayeur-------------------");
                System.out.println("----------------3. Entrez le montant de l article: ---------------");
                int actionvendeur = scanner.nextInt();
                if (actionvendeur == 1) {
                    monnayeur.AfficherQuantite();

///ajoute vos pieces ou billet a chaques unités
                } else if (actionvendeur == 2) {
                    System.out.println("Combien de piece de 1 centimes voulez vous ajoutez");
                    int combien = scanner.nextInt();
                    monnayeur.ajouteruncentime(combien);
                    System.out.println("Combien de piece de 2 centimes voulez vous ajoutez");
                    int combien1 =scanner.nextInt();
                    monnayeur.ajouterdeuxcentime(combien1);
                    System.out.println("Combien de piece de 5 centimes voulez vous ajoutez");
                    int combien2 =scanner.nextInt();
                    monnayeur.ajoutercinqcentime(combien2);
                    System.out.println("Combien de piece de 10 centimes voulez vous ajoutez");
                    int combien3 =scanner.nextInt();
                    monnayeur.ajouterDixCentimes(combien3);
                    System.out.println("Combien de piece de 20 centimes voulez vous ajoutez");
                    int combien4 =scanner.nextInt();
                    monnayeur.ajouterVingtCentimes(combien4);
                    System.out.println("Combien de piece de 50 centimes voulez vous ajoutez");
                    int combien5 =scanner.nextInt();
                    monnayeur.ajouterCinquanteCentimes(combien5);
                    System.out.println("Combien de piece de 1 euro voulez vous ajoutez");
                    int combien6 =scanner.nextInt();
                    monnayeur.ajouterUnEuro(combien6);
                    System.out.println("Combien de piece de 2 euros voulez vous ajoutez");
                    int combien7 =scanner.nextInt();
                    monnayeur.ajouterDeuxEuros(combien7);
                    System.out.println("Combien de billet de 5 euros voulez vous ajoutez");
                    int combien8 =scanner.nextInt();
                    monnayeur.ajouterCinqEuros(combien8);
                    System.out.println("Combien de billet de 10 euros voulez vous ajoutez");
                    int combien9 =scanner.nextInt();
                    monnayeur.ajouterDixEuros(combien9);
                    System.out.println("Combien de billet de 20 euros voulez vous ajoutez");
                    int combien10 =scanner.nextInt();
                    monnayeur.ajouterVingtEuros(combien10);
                    System.out.println("Combien de billets de 50 euros voulez vous ajoutez");
                    int combien11 =scanner.nextInt();
                    monnayeur.ajouterCinquanteEuros(combien11);
                    System.out.println();
                    System.out.println("Vos pieces et billets ont bien été ajouté");


///demande le prix au client et le stock dans prixArticle
                } else if (actionvendeur == 3) {
                    System.out.println("Entrez le prix de l'article : ");
                    prixArticle = scanner.nextDouble();
                    System.out.println();
                    System.out.println();
                    System.out.println("Le prix de l'article est : " + prixArticle);
                    permission = 2;


///issu de secour au cas ou il choisi une autre option que proposé
                } else {
                    System.out.println("------------------------action impossible-------------------------");
                }

            } else if (starter == 2) {
                if(permission == 1) {
                    System.out.println("---------il faut d'abord que le commercant entre un prix !---------");
                }else {
                    double montantAPayer = prixArticle;
                    double sommetotalpaye = 0;
                    double montantfixe = montantAPayer;
                    while (sommetotalpaye < montantfixe) {
///attention le point n'est pas egal a la virgule !!!
                        System.out.println("------Entrez un par un le montant de vos pièces ou billets :------");
                        System.out.println();
                        double modedepayement = 0;
                        modedepayement = scanner.nextDouble();
                        if (modedepayement == 0.01) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajouteruncentime(1);


                        } else if (modedepayement == 0.02) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajouterdeuxcentime(1);


                        } else if (modedepayement == 0.05) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajoutercinqcentime(1);


                        } else if (modedepayement == 0.10) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajouterDixCentimes(1);


                        } else if (modedepayement == 0.20) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajouterVingtCentimes(1);


                        } else if (modedepayement == 0.50) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajouterCinquanteCentimes(1);

                        } else if (modedepayement == 1) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajouterUnEuro(1);

                        } else if (modedepayement == 2) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajouterDeuxEuros(1);

                        } else if (modedepayement == 5) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajouterCinqEuros(1);

                        } else if (modedepayement == 10) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajouterDixEuros(1);

                        } else if (modedepayement == 20) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajouterVingtEuros(1);

                        } else if (modedepayement == 50) {
                            sommetotalpaye += modedepayement;
                            montantAPayer -= modedepayement;
                            monnayeur.ajouterCinquanteEuros(1);
///issu si le billet n'existe pas
                        } else {
                            System.out.println();
                            System.out.println("----------------------essayer avec un billet valide -------------------");
                            System.out.println();
                        }

///regarde si il a besoin de rendre la monais ou non (la formule DecimalFormat permet en réalité limité le nombre de decimal apres la virgule
                        if (montantAPayer >= 0) {
                            DecimalFormat df = new DecimalFormat("#.##");
                            System.out.println("--------------------Il manque : " + df.format(montantAPayer) + " euro--------------");
                            System.out.println();
                        } else if (montantAPayer < 0) {
                            DecimalFormat df = new DecimalFormat("#.##");
                            System.out.println("----------Il y a " + df.format(-montantAPayer) + " euro de trop---------");
                            System.out.println();
                        }
                    }

///debut des calculs de quoi rendre et pour combien d'argent
                    if (sommetotalpaye > montantfixe) {
                        montantfixe -= sommetotalpaye;
                        DecimalFormat df = new DecimalFormat("#.##");
                        System.out.println("---------------------tenez " + df.format(-montantAPayer) + " euro---------------------");
                        System.out.println();
                        while (montantAPayer * 100 < 0) {

                            if (-montantAPayer >= 50) {
                                monnayeur.retirerVingtEuros(1);
                                montantAPayer += 5000;

                            } else if (-montantAPayer >= 20) {
                                monnayeur.retirerVingtEuros(1);
                                montantAPayer += 2000;

                            } else if (-montantAPayer >= 10) {
                                monnayeur.retirerDixEuros(1);
                                montantAPayer += 1000;

                            } else if (-montantAPayer >= 5) {
                                monnayeur.retirerCinqEuros(1);
                                montantAPayer += 500;

                            } else if (-montantAPayer >= 2) {
                                monnayeur.retirerDeuxEuros(1);
                                montantAPayer += 200;

                            } else if (-montantAPayer >= 1) {
                                monnayeur.retirerUnEuro(1);
                                montantAPayer += 100;

                            } else if (-montantAPayer >= 0.5) {
                                monnayeur.retirerCinquanteCentimes(1);
                                montantAPayer += 50;

                            } else if (-montantAPayer >= 0.20) {
                                monnayeur.retirerVingtCentimes(1);
                                montantAPayer += 20;

                            } else if (-montantAPayer >= 0.10) {
                                monnayeur.retirerDixCentimes(1);
                                montantAPayer += 10;

                            } else if (-montantAPayer >= 0.05) {
                                monnayeur.retirerCinqCentimes(1);
                                montantAPayer += 5;

                            } else if (-montantAPayer >= 0.02) {
                                monnayeur.retirerDeuxCentimes(1);
                                montantAPayer += 2;

                            } else if (-montantAPayer >= 0.01) {
                                monnayeur.retirerUnCentime(1);
                                montantAPayer += 1;

                            }
                        }

///marque un politesse et souhaite une bonne jouornée ;)
                        System.out.println("--------------------c'est tout bon, bonne journée !----------------");
                        System.out.println();
                        System.out.println();
                    }
                }
            }
///fin du do while
        }while (run == 1);
    }
}