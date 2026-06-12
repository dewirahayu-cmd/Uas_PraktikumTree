package UAS_Praktikum08;

public class Film08 {
    String kodeFilm;
    String judul;
    String genre;
    double rating;

    public Film08(String kodeFilm, String judul, String genre, double rating) {
        this.kodeFilm = kodeFilm;
        this.judul = judul;
        this.genre = genre;
        this.rating = rating;
    }

    public void tampilInformasi() {
        System.out.println("Kode Film : " + kodeFilm);
        System.out.println("Judul     : " + judul);
        System.out.println("Genre     : " + genre);
        System.out.println("Rating    : " + rating);
        System.out.println("-----------------------------");
    }
}