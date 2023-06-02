package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresStatique {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        metier.setDao(dao);
        System.out.println("Resultat de l'instanciation statique est: " + metier.calcul());
    }
}
