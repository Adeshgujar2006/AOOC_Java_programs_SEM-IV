// Writing a Java program to arrange 10 names in alphabetical order
import java.util.Arrays;
public class Arrange_exp_02 {
    public static void main(String[] args) {
        String[] names = {"Adesh","Bhavesh","Shivam","Prathamesh","Bhushan","Harshal","Vahid","Rushi","Sanket","Parth"};
        
        Arrays.sort(names);
        
        System.out.println("Names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}