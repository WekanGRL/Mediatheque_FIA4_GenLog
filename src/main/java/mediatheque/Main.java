package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Albert Camus", "L'étranger"));
        mediatheque.addItem( new CD(26, "The Wall"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));

        System.out.println(" Catalogue :");
        mediatheque.printCatalog();

        System.out.println("\n Livres :");
        mediatheque.printOnlyBooks();

        System.out.println("\n CDs :");
        mediatheque.printOnlyCDs();
    }
}
