import java.util.ArrayList;

public class Branch {
    String branchName;

    ArrayList<Sale> saleList = new ArrayList<>();
    public void addSale(Sale sale) {saleList.add(sale); }


    public Branch(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String toString() {
        return "branchName='" + branchName + '\'' +
                ", saleList=" + saleList;
    }
}


