public class Pizza implements Product {
    private ProductCategory category = ProductCategory.Food;
    @Override
    public String getName() {
        return "Pizza";
    }

    @Override
    public double getPrice() {
        return 12.97;
    }

    @Override
    public ProductCategory getCategory() {
        return category;
    }
    
}
