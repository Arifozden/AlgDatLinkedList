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