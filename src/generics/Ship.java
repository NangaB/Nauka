package generics;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Mariner> mariners;

    public Ship(List mariners) {
        this.mariners = new ArrayList<>();
    }

    public void add(Mariner mariner){
        mariners.add(mariner);
    }


}
