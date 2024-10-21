import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.addFirst("Nikshep");
        ll.addFirst("is");
        ll.addFirst("This");
        ll.addLast("Paliwal");
        System.out.println(ll);
        System.out.println(ll.size());

        for(int i =0; i<ll.size(); i++){
            System.out.print(ll.get(i)+" -> ");
        }
   
    }



    







}
