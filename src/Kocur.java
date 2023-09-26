import java.util.ArrayList;
import java.util.List;

public class Kocur extends Zwierz { //UData

    String kocur;
    List<Kot> kotList = new ArrayList<>();

    public String getKocur() {
        return kocur;
    }

    public void setKocur(String kocur) {
        this.kocur = kocur;
    }

    public List<Kot> getKotList() {
        return kotList;
    }

    public void setKotList(List<Kot> kotList) {
        this.kotList = kotList;
    }
}


