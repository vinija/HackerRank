/**
 * Created by Vini on 10/1/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HashTablesRansomNote {

    public static void answer(String mag[], String note []){
        int counter = 0;
        List<String> magAsList = arrayToList(mag);

        for(int i = 0; i<note.length; i++){
            if(magAsList.contains(note[i])){
                counter++;
            }
        }

        if (counter == note.length){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    private static List<String> arrayToList(String [] arr) {
        List<String> result= new ArrayList<String>(arr.length);
        for (String i : arr) {
            result.add(i);
        }
        return result;
    }

    public static void mainHash(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();

        }

        answer(magazine, ransom);
    }
}