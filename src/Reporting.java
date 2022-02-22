import java.util.*;

public class Reporting {
    public ArrayList<Branch> branchList = new ArrayList<>();
    public void addBranch(Branch branch) {branchList.add(branch); }

    



    @Override
    public String toString() {
        return "branchList=" + branchList;
    }
}
