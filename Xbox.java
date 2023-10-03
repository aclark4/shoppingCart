public class Xbox implements Product {
    private ProductCategory category = ProductCategory.Electronics;

    @Override
    public String getName() {
        return "Xbox";
    }

    @Override
    public double getPrice() {
       return 299.99;
    }

    @Override
    public ProductCategory getCategory() {
        return category;
    }
    
}
