import java.util.ArrayList;

public class Branch {
    ArrayList<Sale> saleList = new ArrayList<>();

    public boolean addSale(Sale sale) { return saleList.add(sale); }

    @Override
    public String toString() {
        return "Branch{" +
                ", saleList=" + saleList +
                '}';
    }
}


