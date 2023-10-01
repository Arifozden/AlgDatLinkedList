public class TekYonluListeTapisi {
    Node head=null;
    Node tail;

    void basaEkle(int x){
        Node eleman = new Node();
        eleman.data=x;

        if(head==null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste yapisi olusturuldu, ilk eleman eklendi");
        } else {
            eleman.next=head;
            head=eleman;
            System.out.println("basa eleman eklendi");
        }
    }

    void sonaEkle(int x){
        Node eleman = new Node();
        eleman.data=x;

        if(head==null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste yapisi olusturuldu, ilk eleman eklendi");
        } else {
            eleman.next=null;
            tail.next=eleman;
            tail=eleman;
            System.out.println("sona eleman eklendi");
        }
    }

    void arayaEkle(int indeks, int x){
        Node eleman=new Node();
        eleman.data=x;

        if(head==null&&indeks==0){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste yapisi olsutu, ilk eleman eklendi");
        } else if (head!=null&&indeks==0) {
            eleman.next=head;
            head=eleman;
            System.out.println(indeks+ " . indekse "+x+" eklendi");
        }else{
            int n=0;
            Node temp=head;
            Node temp2=head;

            while (temp.next!=null){
                n++;
                temp2=temp;
                temp=temp.next;
            }
            if(n==indeks){
                temp2.next=eleman;
                eleman.next=temp;
                System.out.println("eleman eklendi");
                }
            else {
                temp=head;
                temp2=head;
                int i=0;
                while (i!=indeks){
                    temp2=temp;
                    temp=temp.next;
                    i++;
                }
                temp2.next=eleman;
                eleman.next=temp;
                System.out.println(indeks+". indekse "+x+" eklendi");
            }
        }
    }

    void bastanSil(){
        if(head==null){
            System.out.println("liste bos, silinecek eleman yok");
        } else if (head.next==null) {
            head=null;
            tail=null;
            System.out.println("listede kalan son eleman da silindi");
        }
        else {
            head=head.next;
            System.out.println("bastaki eleman silindi");
        }
    }

    void sondanSil(){
        if(head==null){
            System.out.println("liste bos, silinecek eleman yok");
        } else if (head.next==null) {
            head=null;
            tail=null;
            System.out.println("listede kalan son eleman da silindi");
        }
        else {
            Node temp=head;
            Node temp2=head;
            while (temp.next!=null){
                temp2=temp;
                temp=temp.next;
            }
            temp2.next=null;
            tail=temp2;
            System.out.println("sondan eleman silindi");
        }
    }

    void aradanSil(int indeks){
        if(head==null){
            System.out.println("liste bos, silinecek eleman yok");
        } else if (head.next==null&&indeks==0) {
            head=null;
            tail=null;
            System.out.println("listede kalan son eleman da silindi");
        } else if (head.next!=null&&indeks==0) {
            head=head.next;
            System.out.println("bastaki eleman silindi");
        }
        else {
            int i=0;
            Node temp=head;
            Node temp2=head;
            while (temp!=null){
                i++;
                temp2=temp;
                temp=temp.next;
            }
            if (i == indeks) {
                temp2.next=null;
                tail=temp2;
                System.out.println("listedeki son siradaki eleman silindi");
            }
            else {
                temp=head;
                temp2=head;
                int j=0;
                while (j!=indeks){
                    temp2=temp;
                    temp=temp.next;
                    j++;
                }
                temp2.next=temp.next;
                System.out.println(indeks+". eleman silindi ");
            }
        }
    }

    void yazdir(){
        if(head==null){
            System.out.println("Liste bos");
        }else {
            Node temp=head;
            System.out.print("bas->");
            while (temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.print("son.");
        }
    }
}