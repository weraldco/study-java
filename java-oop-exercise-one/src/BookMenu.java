import java.util.Scanner;

public class BookMenu {

    private static Book comparePrice (int firstIndex, int secondIndex, Book[] books) {
            // Get the book base on index
            // Compare them both
            // Result will be the expensive book
            if (books[firstIndex].getPrice() > books[secondIndex].getPrice()) {
                return books[firstIndex];
            } else {
                return books[secondIndex];
            }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        int bkIdx = 0;
        while(true) {
            try {
                System.out.println("[1] to view list of books\n[2] to add books \n[3] To compare Prices of two books \nand any key to exit.");
                System.out.println("Choose option: ");
                int userAction = Integer.parseInt(scanner.nextLine());
                    if(userAction == 1) {
                        for(int i =0; i < books.length;i++) {
                            if(books[i] != null) {
                                System.out.println(books[i]);
                            }
                        }
                    } else if (userAction == 2) {
                        if(books[9] != null) {
                            System.out.println("10 Books are already store, cannot add more.");
                            continue;
                        }
                        System.out.println("Book Title: ");
                        String bookTitle = scanner.nextLine();
                        System.out.println("Book Author: ");
                        String bookAuthor = scanner.nextLine();
                        System.out.println("Book Price: ");
                        float bookPrice = Float.parseFloat(scanner.nextLine());

                        Book newBook = new Book();
                        newBook.setTitle(bookTitle);
                        newBook.setAuthor(bookAuthor);
                        newBook.setPrice(bookPrice);
                        for (int i = 0; i < books.length; i++) {
                            if( books[i] == null) {
                                bkIdx = i;
                                break;
                            }
                        }
                        books[bkIdx] = newBook;

                        System.out.println("New book added in " + bkIdx + " with the title " + bookTitle );
                    } else if (userAction == 3) {
                        try {
                            // Ask for the index of first book
                            System.out.print("Index of first book: ");
                            int firstBook = Integer.parseInt(scanner.nextLine());
                            // Ask for the index of second book
                            System.out.print("Index of second book: ");
                            int secondBook = Integer.parseInt(scanner.nextLine());

                            // Get the book base on index
                            // Compare them both
                            // Result will be the expensive book
                            System.out.println("Expensive One: \n" + comparePrice(firstBook, secondBook,books));

                        } catch (NullPointerException npe) {
                            System.out.println(npe.getMessage());
                        }
                    } else {
                        break;
                    }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }


        }

    }
}
