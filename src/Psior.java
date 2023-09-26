import java.util.ArrayList;
import java.util.List;

public class Psior extends Zwierz{

    String psior;
    List<Pies> piesList = new ArrayList<>();

    public Psior(double grubość, String psior, List<Pies> piesList) {
        super(grubość);
        this.psior = psior;
        this.piesList = piesList;
    }

    public Psior(double grubość) {
        super(grubość);
    }

    public Psior() {
    }

    public String getPsior() {
        return psior;
    }

    public void setPsior(String psior) {
        this.psior = psior;
    }

    public List<Pies> getPiesList() {
        return piesList;
    }

    public void setPiesList(List<Pies> piesList) {
        this.piesList = piesList;
    }

}
