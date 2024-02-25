package Presentation;

import DAO.DaoImpl;
import DAO.IDao;
import metier.IMetier;
import metier.MetierImpl;



public class Presentation {
    public static void main(String[] args) {

        IDao dao = new DaoImpl();
        IMetier metier = new MetierImpl(dao);
        metier.calcul();

    }

    }
