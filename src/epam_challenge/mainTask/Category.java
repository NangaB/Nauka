package epam_challenge.mainTask;

import java.util.List;

public class Category {
    private final String name;
    private List<Integer> productsIds = List.of();
    private List<String> subCategoriesIds = List.of();

    public Category(String name) {
        this.name = name;
    }

    public void setProductsIds(List<Integer> productsIds) {
        this.productsIds = productsIds;
    }

    public List<String> getSubCategoriesIds() {
        return subCategoriesIds;
    }

    public void setSubCategoriesIds(List<String> subCategoriesIds) {
        this.subCategoriesIds = subCategoriesIds;
    }

    public List<Integer> getProductsIds() {
        return this.productsIds;
    }

    public String getName() {
        return this.name;
    }
}
