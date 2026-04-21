import java.io.*;

public class ReadConsole{
   public static void main(String args[]) throws IOException {
       InputStreamReader cin = new InputStreamReader(System.in);
       System.out.println("Enter characters, 'q' to quit.");
       char c;
       do{
         c = (char) cin.read();
         System.out.print(c);
       } while(c != 'q');
       cin.close();
       }
       }
