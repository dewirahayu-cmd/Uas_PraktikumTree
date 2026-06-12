package UAS_Praktikum08;

public class FilmMain08 {

    public static void main(String[] args) {

        BinarySearchTreeFilm08 bst = new BinarySearchTreeFilm08();

        // masukkan data awal ke dalam tree via method add()
        bst.add(new Film08("FL105", "Interstellar",   "Sci-Fi",    8.6));
        bst.add(new Film08("FL102", "Coco",            "Animation", 8.4));
        bst.add(new Film08("FL108", "Inception",       "Sci-Fi",    8.8));
        bst.add(new Film08("FL101", "Up",              "Animation", 8.3));
        bst.add(new Film08("FL104", "Parasite",        "Thriller",  8.5));
        bst.add(new Film08("FL107", "Spirited Away",   "Fantasy",   8.6));

        // 1. tampilkan seluruh data film (In-Order Traversal)
        System.out.println("===========================================");
        System.out.println("  DATA FILM IN-ORDER TRAVERSAL             ");
        System.out.println("===========================================");
        bst.traverseInOrder(bst.root);

        // 2. tampilkan seluruh data film (Pre-Order Traversal)
        System.out.println("===========================================");
        System.out.println("  DATA FILM PRE-ORDER TRAVERSAL            ");
        System.out.println("===========================================");
        bst.traversePreOrder(bst.root);

        // 3. pencarian kode film FL104 (ada di tree)
        System.out.println("===========================================");
        System.out.println("  PENCARIAN FILM                           ");
        System.out.println("===========================================");
        boolean cari1 = bst.find("FL104");
        System.out.println("Pencarian FL104 : " + (cari1 ? "Ditemukan" : "Tidak ditemukan"));

        // 4.pPencarian kode film FL110 (tidak ada di tree)
        boolean cari2 = bst.find("FL110");
        System.out.println("Pencarian FL110 : " + (cari2 ? "Ditemukan" : "Tidak ditemukan"));

        // 5. tampilkan jumlah seluruh film dalam tree
        System.out.println("===========================================");
        System.out.println("  JUMLAH FILM                              ");
        System.out.println("===========================================");
        int jumlah = bst.hitungJumlahFilm(bst.root);
        System.out.println("Jumlah film dalam tree : " + jumlah);

        // 6. tampilkan film dengan rating tertinggi
        System.out.println("===========================================");
        System.out.println("  FILM DENGAN RATING TERTINGGI             ");
        System.out.println("===========================================");
        Film08 filmTerbaik = bst.cariRatingTertinggi(bst.root);
        if (filmTerbaik != null) {
            filmTerbaik.tampilInformasi();
        }
    }
}
