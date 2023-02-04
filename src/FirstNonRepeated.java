
import java.util.*;
public class FirstNonRepeated {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        for(char x:str.toCharArray())
        {
            if(str.indexOf(x)==str.lastIndexOf(x))
                System.out.println(x);
        }
    }
}
