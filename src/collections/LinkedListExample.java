package collections;
import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {

        List<String> colleges = new ArrayList<>();
        //Add elements
        colleges.add("Harvard University");
        colleges.add("Stanford University");
        colleges.add("MIT");

        System.out.println("Initial LinkedList: " + colleges);

        // Get element at index 1
        String collegeAtIndex1 = colleges.get(1);
        System.out.println("College at index 1 " +collegeAtIndex1);
        //Update
        colleges.set(2, "Oxford University");
        System.out.println("After Update: "+ colleges);

        colleges.remove(0);
        System.out.println("After Removing index 0: " + colleges);

        //Iterate using Iterator
        System.out.println("\n Iteration using Iterator: ");
        Iterator<String> iterator = colleges.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Iterate using for-each
        System.out.println("\n Iteration using For-each: ");
        for(String college : colleges){
            System.out.println(college);
        }

        //Iterate using for loop
        for (int i = 0; i < colleges.size(); i++) {
            System.out.println("Index " + i + ": "+colleges.get(i));
        }

    }
}
