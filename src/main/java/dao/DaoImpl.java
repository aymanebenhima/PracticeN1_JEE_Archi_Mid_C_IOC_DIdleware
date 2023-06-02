package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        // Implémentation de la méthode getData
        System.out.println("Données provenant de la base de données");
        double data = 2023;
        return data;
    }
}
