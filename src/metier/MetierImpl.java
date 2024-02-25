package metier;

import DAO.IDao;

import java.util.Date;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public long calcul() {
        Date date = dao.getDate();

        System.out.println("Calcul effectué avec succès !");
        return 0;
    }
}
