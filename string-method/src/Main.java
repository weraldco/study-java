public class Main {
    public static void main(String[] args) {
        String name = "Werald Opolento";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf('d');
        int lastIndex = name.lastIndexOf('o');

        System.out.printf("\nLength of name: %d",length);
        System.out.printf("\nLetter at charAt(0): %c",letter);
        System.out.printf("\nIndex of 'd': %d", index);
        System.out.printf("\nLast Index of 'o': %d", lastIndex);
        System.out.printf("\n %s", name.toUpperCase());

        System.out.printf("\n %s", name.trim());
        System.out.printf("\n %b", name.contains("W"));

        System.out.printf("\n %b", name.equals("Werald Opolento"));
        System.out.printf("\n %b", name.equalsIgnoreCase("werald opolento"));
    }
}
