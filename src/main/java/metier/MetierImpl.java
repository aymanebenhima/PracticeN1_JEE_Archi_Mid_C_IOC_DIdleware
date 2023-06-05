package metier;

import dao.IDao;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier{

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        // Utiliser l'objet dao pour effectuer le calcul
        double data = dao.getData();
        double res = data++;
        System.out.println("Calcul effectué avec les données : " + data);
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
