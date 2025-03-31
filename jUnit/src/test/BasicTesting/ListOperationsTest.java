package BasicTesting;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListOperationsTest {

    // Test case to verify that elements are added correctly to the list.
    @Test
    public void addElement() {
        // Create an empty list
        List<Integer> list = new ArrayList<>();

        // Add elements to the list using the method under test
        ListOperations.addElement(list,10);
        ListOperations.addElement(list,20);
        ListOperations.addElement(list,30);

        // Check if the size of the list is updated correctly
        assertEquals(3, list.size());

        // Verify that the added elements exist in the list
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
        assertTrue(list.contains(30));
    }

    // Test case to verify that an element is removed correctly from the list.
    @Test
    void removeElement() {
        // Create a list and add elements
       List<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(20);
       list.add(30);

        // Remove an element using the method under test
       ListOperations.removeElement(list,20);

        // Check if the size of the list is updated correctly
       assertEquals(2, list.size());

        // Verify that the removed element is no longer in the list
       assertFalse(list.contains(20));
    }

    // Test case to verify that the correct size of the list is returned.
    @Test
    void getSize() {
        // Create a list and add elements
       List<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(20);

        // Verify that the size returned by the method matches the actual size
       assertEquals(2, ListOperations.getSize(list));
    }
}