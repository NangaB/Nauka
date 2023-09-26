import java.util.ArrayList;
import java.util.List;

public class Pies extends Zwierz{ //Ec7Layer

    String co;

    public Pies(double grubość) {
        super(grubość);
    }

    public Pies() {
    }

    public Pies(double grubość, String co) {
        super(grubość);
        this.co = co;
    }
}
