public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this("Unknown", "Unknown", 0.0);
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Title: " + author);
        System.out.println("Title: " + price);
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void applyDiscount(double discount){
        if(discount >= 100.00 || discount <= 0.00 ){
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("Error discount! Please try again.");
            System.out.println("--------------------------------------------------------------------------------------------------");
        }
        else{
            updatePrice(price-(price*discount/100.00));
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("You're using discount " + discount + "% ,and now your book '" + title + "' is " + price + " baht.");
            System.out.println("--------------------------------------------------------------------------------------------------");
        }
    }
}
