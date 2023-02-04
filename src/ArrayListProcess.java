import java.util.ArrayList;
import java.util.*;
public class ArrayListProcess {



        public static void main(String[] args) {


            ArrayList<Integer> al = new ArrayList<Integer>();

            // Add 10 elements
            System.out.println("adding 10 elemnts");
            al.add(19);
            al.add(87);
            al.add(89);
            al.add(817);
            al.add(65);
            al.add(45);
            al.add(10);
            al.add(32);
            al.add(43);
            al.add(21);
            System.out.println("elements after adding"+al);




            // Add an element at 6th position
            System.out.println("add element to the 6th position");
            al.add(5, 11);
            System.out.println(al);



            // Remove an element
            al.remove(7);
            System.out.println("array list after removing an element"+al);

            // Print sub-array from index 2 to 7
            System.out.println(al.subList(2, 7));

            // Clear the array list
            al.clear();

            System.out.println("Array List after clearing: " + al);
        }
    }


