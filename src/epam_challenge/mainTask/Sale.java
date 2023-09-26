package epam_challenge.mainTask;

import java.util.UUID;

public class Sale {
    private final UUID id;
    private final int numberOfProductsSold;
    private final int productPrice;

    public Sale(int numberOfProductsSold, int productPrice) {
        this.id = UUID.randomUUID();
        this.numberOfProductsSold = numberOfProductsSold;
        this.productPrice = productPrice;
    }

    public int getProductPrice() {
        return this.productPrice;
    }

    public int getNumberOfProductsSold() {
        return this.numberOfProductsSold;
    }

    public UUID getId() {
        return id;
    }
}
