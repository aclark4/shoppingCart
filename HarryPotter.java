public class HarryPotter implements Product {
    private ProductCategory category = ProductCategory.Books;
    @Override
    public String getName() {
        return "Harry Potter and the Sorcerer's Stone";
    }

    @Override
    public double getPrice() {
        return 7.95;
    }

    @Override
    public ProductCategory getCategory() {
        return category;
    }
    
}
