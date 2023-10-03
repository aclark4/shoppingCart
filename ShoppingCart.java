public class ShoppingCart {
    Product[] cart;
    Product xbox = new Xbox();
    Product harryPotter = new HarryPotter();
    Product mascara = new Mascara();
    Product pizza = new Pizza();
    Product shirt = new Shirt(); 
    Product[] products = {harryPotter, mascara, pizza, shirt, xbox};

    public ShoppingCart() {
        this.cart = new Product[0]; //Sets this cart to have 0 products in it(but not null)
    }
    public void addProduct(Product p) {
        Product[] tempcart = new Product[cart.length +1];
        for(int i = 0;i<cart.length;i++) {
            tempcart[i] = cart[i];
        }
        tempcart[cart.length] = p; //Final item in cart is the parameter p(added)
        cart = tempcart;
    }
    public void printCart() {
        System.out.println("Your cart:");
        for(Product p : cart) {
            System.out.println(p.getCategory() +  " | " + p.getName() + " | $" + p.getPrice());
        }
    }
    public void removeProduct(Product p) {
        int indexOfArray = 0;
        Product[] tempcart = new Product[cart.length-1];
        for(int i = 0;i<cart.length;i++) {
            if(!cart[i].equals(p)) {
                tempcart[indexOfArray++] = cart[i];
            }
        }
        cart = tempcart;
    }
    public double calculateCart() {
        double sum = 0.0;
        for(Product p : cart) {
            sum += p.getPrice();
        }
        return sum;
    }
    public void printItemsAvailable() {
        for(int i =0;i<products.length;i++) {
            System.out.println("-----------------------");
            System.out.println("Name: " + products[i].getName());
            System.out.println("Price: $" + products[i].getPrice());
            System.out.println("Category: " + products[i].getCategory());
            System.out.println("-----------------------");
        }
    }
    public void checkOut() {
        double shipping;
        System.out.println("Checking out...");
        if(cart.length > 3) {
            shipping = 8.99;
        }
        else{
            shipping = 4.99;
        }
        double totalCost = this.calculateCart()*1.053 + shipping;
        System.out.println("---------------------");
        System.out.printf("Total Cost: $%.2f\n",totalCost);
        
    }

    public String toString() {
        return "Your cart has $" + calculateCart() + " worth of items in it";
    }

}
