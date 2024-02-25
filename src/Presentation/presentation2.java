package Presentation;

import DAO.IDao;
import metier.IMetier;


import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;


public class presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("config.txt"));
        String daoClassName=scan.nextLine();
        Class dao1 = Class.forName(daoClassName);
        IDao dao = (IDao) dao1.newInstance();
        System.out.println(dao.getDate());

        String metierClassName=scan.nextLine();
        Class metier1 = Class.forName(metierClassName);
        IMetier metier = (IMetier) metier1.newInstance();
        Method method = metier.getClass().getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println(metier.calcul());



    }
}
