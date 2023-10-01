public class Main {
    public static void main(String[] args) {
        TekYonluListeTapisi tyList = new TekYonluListeTapisi();
        tyList.basaEkle(10);
        tyList.sonaEkle(20);
        tyList.basaEkle(5);
        tyList.sonaEkle(30);
        tyList.basaEkle(3);
        tyList.sonaEkle(40);

        //tyList.arayaEkle(4,25);
        //tyList.arayaEkle(0,1);
        //tyList.arayaEkle(8,50);

        //tyList.bastanSil();
       //tyList.sondanSil();

        tyList.aradanSil(3);
        tyList.yazdir();

    }
}