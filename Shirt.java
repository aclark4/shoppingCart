public class Shirt implements Product  {
    private ProductCategory category = ProductCategory.Clothing;
    @Override
    public String getName() {
        return "Shirt";
    }

    @Override
    public double getPrice() {
        return 19.99;
    }

    @Override
    public ProductCategory getCategory() {
        return category;
    }
    
}
