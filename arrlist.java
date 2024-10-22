import java.util.ArrayList;

public class arrlist {
    
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        for(int i=0; i<10;i++){
            arrayList.add(i*10);
        }
        System.out.println(arrayList);

    }
}
