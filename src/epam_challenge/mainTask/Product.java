package epam_challenge.mainTask;

import java.util.List;
import java.util.UUID;

public class Product {
    private final int id;
    private List<UUID> salesIds = List.of();
    private final List<String> categoriesIds;

    public Product(int id, List<String> categoriesIds) {
        this.id = id;
        this.categoriesIds = categoriesIds;
    }

    public void setSales(List<Sale> sales) {
//        this.salesIds = sales;  repair!!!
    }

    public List<UUID> getSalesIds() {
        return this.salesIds;
    }

    public int getId() {
        return this.id;
    }

    public List<String> getCategoriesIds() {
        return this.categoriesIds;
    }
}
