package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] arg){
        DaoImpl2 dao=new DaoImpl2();

        /*
        Injection des dependances par instanciation static (new)
         */
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("Resultat="+metier.calcul());

    }

    }
