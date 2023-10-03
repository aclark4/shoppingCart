public class Mascara implements Product{
    private ProductCategory category = ProductCategory.Cosmetics;
    @Override
    public String getName() {
        return "Mascara";
    }

    @Override
    public double getPrice() {
        return 30.00;
    }

    @Override
    public ProductCategory getCategory() {
        return category;
    }
    
}
