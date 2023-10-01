public class Main {
    public static void main(String[] args) {

        Sinif A= new Sinif();  //bellekte dugum olusturma
        Sinif B= new Sinif();
        Sinif C= new Sinif();

        A.sayi = 11;  //dugumlere degerleri atandi
        B.sayi = 22;
        C.sayi = 33;

        A.next=B;   //dugumleri birbirine bagladik (travers islemi)
        B.next=C;
        C.next=null;

        Sinif temp=A;

        while (temp!=null)  //dugumlerde dolastik
        {
            System.out.println(temp.sayi);
            temp=temp.next;
        }

    }
}