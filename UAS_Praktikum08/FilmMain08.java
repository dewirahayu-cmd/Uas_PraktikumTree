package UAS_Praktikum08;

public class FilmMain08 {

    public static void main(String[] args) {

        BinarySearchTreeFilm08 bst = new BinarySearchTreeFilm08();

        bst.add(new Film08("FL105", "Interstellar",  "Sci-Fi",    8.6));
        bst.add(new Film08("FL102", "Coco",          "Animation", 8.4));
        bst.add(new Film08("FL108", "Inception",     "Sci-Fi",    8.8));
        bst.add(new Film08("FL101", "Up",            "Animation", 8.3));
        bst.add(new Film08("FL104", "Parasite",      "Thriller",  8.5));
        bst.add(new Film08("FL107", "Spirited Away", "Fantasy",   8.6));

        // 1. Tampilkan seluruh data film - In-Order Traversal
        System.out.println("===========================================");
        System.out.println("  DATA FILM IN-ORDER TRAVERSAL");
        System.out.println("===========================================");
        bst.traverseInOrder(bst.root);

        // 2. Tampilkan seluruh data film - Pre-Order Traversal
        System.out.println("===========================================");
        System.out.println("  DATA FILM PRE-ORDER TRAVERSAL");
        System.out.println("===========================================");
        bst.traversePreOrder(bst.root);

        // 3. Pencarian FL104
        System.out.println("===========================================");
        System.out.println("  PENCARIAN FILM");
        System.out.println("===========================================");
        bst.find("FL104");

        // 4. Pencarian FL110
        bst.find("FL110");

        // 5. Jumlah seluruh film dalam tree
        System.out.println("===========================================");
        System.out.println("  JUMLAH FILM");
        System.out.println("===========================================");
        bst.tampilJumlahFilm(bst.root);

        // 6. Film dengan rating tertinggi
        System.out.println("===========================================");
        System.out.println("  FILM DENGAN RATING TERTINGGI");
        System.out.println("===========================================");
        bst.tampilRatingTertinggi(bst.root);
    }
}