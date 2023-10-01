public class Main {
    public static void main(String[] args) {
        TekYonluListeTapisi tyList = new TekYonluListeTapisi();
        tyList.basaEkle(10);
        tyList.sonaEkle(20);
        tyList.basaEkle(5);
        tyList.sonaEkle(30);
        tyList.basaEkle(3);
        tyList.sonaEkle(40);

        tyList.yazdir();

    }
}