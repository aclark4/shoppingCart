public class OnlineShoppingApp {
    static Product xbox = new Xbox();
    static Product harryPotter = new HarryPotter();
    static Product mascara = new Mascara();
    static Product pizza = new Pizza();
    static Product shirt = new Shirt(); 
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.checkOut();
    }
}
