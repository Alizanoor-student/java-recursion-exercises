import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample {
    public static void main(String[] args) {
        //Defining ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<String>list2= new ArrayList<>();
        //ArrayList<Boolean>list3= new ArrayList<>();
        //Add Elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //Get elements
        int element= list.get(0);
        System.out.println(element);
        //To add elements in between
        list.add(1,1);
        System.out.println(list);
        //Set elements
        list.set(0,5);
        System.out.println(list);
        //Delete element
        list.remove(3);
        System.out.println(list);
        //Return size
        int size= list.size();
        System.out.println(size);
        //Loops
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        //Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
