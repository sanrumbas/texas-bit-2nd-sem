package collections;

import java.util.ArrayList;

public class ArrraListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Texas");
        arrayList.add("College");
        arrayList.add("Chabahil");

        arrayList.get(0);

        arrayList.remove("College");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for(String array: arrayList){
            System.out.println(array);
        }
    }
}
