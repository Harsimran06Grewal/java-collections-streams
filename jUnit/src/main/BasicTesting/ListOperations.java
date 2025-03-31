package BasicTesting;

import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
    }

    public static void addElement(List<Integer> list, int element){
        // Add the element to the list
        list.add(element);
    }

    public static void removeElement(List<Integer> list, int element){
        // Remove the element from the list
        list.remove(Integer.valueOf(element));
    }

    public static int getSize(List<Integer> list){
        // Return current size of list
        return list.size();
    }
}
