import java.util.Vector;

    public class VectorProcess {
        public static void main(String[] args) {
// create a vector
            Vector<Integer> vec = new Vector<>(5);
// add elements to the vector
            vec.add(10);
            vec.add(20);
            vec.add(30);
            vec.add(40);
            vec.add(50);
            System.out.println("Elements in the vector: " + vec);
// add an element at the 3rd position
            vec.add(2, 90);
            System.out.println("Elements in the vector after adding at 3rd position: " + vec);
// check if a given value is present in the vector
            int value = 4;
            if (vec.contains(value)) {
                System.out.println(value + " is present in the vector");
            } else {
                System.out.println(value + " is not present in the vector");
            }
// printing the  elements at 4th and 8th positions
            System.out.println("Element at 4th position: " + vec.get(3));
            System.out.println("Element at 8th position: " + vec.get(7));
// remove the 4th element
            vec.remove(3);
             System.out.println("Elements in the vector after removing 4th element: " + vec);
        }
    }

