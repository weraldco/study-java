public class Main {

    private static  void comparePrice(Book book1, Book book2) {
        float book1Price = book1.getPrice();
        float book2Price = book2.getPrice();

        if(book1Price < book2Price) {
            System.out.println(book1.getTitle() + " costs less than " + book2.getTitle());
        } else if (book1Price == book2Price) {
            System.out.println(book1.getTitle() + " costs as much as " + book2.getTitle());
        } else {
            System.out.println(book1.getTitle() + " cost more than " + book2.getTitle()) ;
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book();

        book1.setTitle("Atomic Habits");
        book1.setAuthor("James Clear");
        book1.setPrice(30.00f);

        Book book2 = new Book();
        book2.setTitle("Sample Book");
        book2.setAuthor("Sample Author");
        book2.setPrice(20.00f);

        System.out.println("The first book is ");
        System.out.println(book1);
        System.out.println("The second book is ");
        System.out.println(book2);
        comparePrice(book1,book2);
    }
}