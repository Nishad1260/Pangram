import java.io.*;
import java.util.*;

class Main {
    public static void main(String arg[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int index = 0;
        int flag = 1;
        boolean[] value = new boolean[26];
        String s;
        System.out.print("Enter a Sentence :");
        s = sc.nextLine();
        
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                index = s.charAt(i) - 'A';
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                index = s.charAt(i) - 'a';
            }
            value[index] = true;
        }
        
        for(int i = 0;i<= 25;i++) {
            if (value[i] == false) 
                flag = 0;
            
        }
        if(flag == 1)
            System.out.println("The Sentence is a Pangram..!!!!");
        else 
            System.out.println("The Sentence is not Pangram..!!!!");
    }
}
