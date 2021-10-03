package Java.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionBinarySearch {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(6);
        myList.add(8);
        myList.add(11);
        myList.add(13);
        myList.add(22);
        myList.add(223);

        // array must be sorted before performing binary search
        int key = 22;
        int ind = Collections.binarySearch(myList ,key); //return the index of element if found , or return -1

        if(ind != -1){
            System.out.println(key + " found");
        }
        else{
            System.out.println(key + " not found");
        }

    }
}
