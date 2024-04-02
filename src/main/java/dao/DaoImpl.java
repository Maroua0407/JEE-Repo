package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        Double temp=Math.random()*40;
        return temp;
    }
}
