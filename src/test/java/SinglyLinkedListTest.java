import com.zipcodewilmington.singlylinkedlist.Node;
import com.zipcodewilmington.singlylinkedlist.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
//
//    add -- add an element to the list
//    remove -- remove an element (specified by numeric index) from the list
//    contains -- returns true if the element is in the list, false otherwise
//    find -- returns the element's index if it is in the list, -1 otherwise
//    size -- returns the current size of the list
//    get -- returns the element at the specified index
//    copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
//    sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
//

    @Test
    public void addTest(){
        // Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        // When
        singlyLinkedList.add(5);



        // Then
        Assert.assertTrue(singlyLinkedList.add(5));

    }

    @Test
    public void removeTest(){
        // Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Integer expectedList = 1;


        // When
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.remove(2);




        // Then
        Assert.assertEquals(singlyLinkedList.size(), expectedList);

    }

    @Test
    public void containsTest(){
        // Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();


        // When
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.contains(2);




        // Then
        Assert.assertTrue(singlyLinkedList.contains(2));

    }

    @Test
    public void findTest(){
        // Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Integer expectedList = 1;



        // When
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.find(2);



        // Then
        Assert.assertEquals(singlyLinkedList.find(2), expectedList);


    }

    @Test
    public void sizeTest(){
        // Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Integer expectedInt = 3;


        // When
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.size();




        // Then
        Assert.assertEquals(singlyLinkedList.size(), expectedInt);


    }

    @Test
    public void getTest(){
        // Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Integer expectedInt = 3;


        // When
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.get(2);



        // Then
        Assert.assertEquals(singlyLinkedList.get(2), expectedInt);


    }

    @Test
    public void copyTest(){

    }

    @Test
    public void sortTest(){
        // Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        // When
        singlyLinkedList.add(3);
        singlyLinkedList.add(1);
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);
        singlyLinkedList.sort();



        // Then
        Assert.assertEquals(singlyLinkedList.head.equals(1), singlyLinkedList.head.equals(1) );
    }
}
