import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        // StringBuilder is a class in the Java API that provides a mutable sequence of characters. It is used for dynamic string manipulation, such as building strings from many smaller strings or appending new characters to an existing string.
        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
        
    }
}
