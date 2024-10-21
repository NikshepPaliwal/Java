import java.util.ArrayList;
import java.util.List;

// Pair class to hold the id and value
class Pair{
    int id , value;
    Pair(int id , int value){
        this.id = id;
        this.value = value;
    }
}
public class reverseStar {
    public static void main(String[] args) {
        // Create a list of Pair objects
        List<Pair> pair = new ArrayList<>();
    
        pair.add(new Pair(2,3));
        pair.add(new Pair(5,7));
        pair.add(new Pair(2,8));
        pair.add(new Pair(5,3));
        pair.add(new Pair(4,3));
        pair.add(new Pair(7,3));
        pair.add(new Pair(4,3));
        pair.add(new Pair(5,3));

        int searchId = 2;

        List<Integer> values = fatcheByID(pair,searchId);
        System.out.println(values);
        
    }

    public static List<Integer> fatcheByID(List<Pair> pair , int id){
        List<Integer> values = new ArrayList<>();
        for(Pair pairs : pair){
            if(pairs.id == id){
                values.add(pairs.value);
            }
        }
        return values;
    }

   
}

//{ id, value} = [{2, 3},{5,7},{2,8},{5,8},{4,6},{7,6},{4,7},{5,4}]