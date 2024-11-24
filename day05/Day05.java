package day05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day05 {

    public static List<String> readInput(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        List<String> res = new ArrayList<>();
        String line = reader.readLine();
        while(line != null){
            res.add(line);
            line = reader.readLine();
        }
        return res;
    }

    public static void part1() throws IOException {
        List<String> input = readInput("input/day05.txt");
        int nice = 0;
        for(String string: input){
            int vowels = 0;
            boolean doubleLetters = false;
            boolean naughty = false;
            for(int i = 0; i < string.length()-1; i++){
                char c = string.charAt(i);
                if(c == string.charAt(i+1)){
                    doubleLetters = true;
                }
                if((c == 'a' && string.charAt(i+1) == 'b') || (c == 'c' && string.charAt(i+1) == 'd') || (c == 'p' && string.charAt(i+1) == 'q') || (c == 'x' && string.charAt(i+1) == 'y')){
                    naughty = true;
                }
            }
            for(int i = 0; i < string.length(); i++){
                char c = string.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowels++;
                }
            }
            if(vowels >= 3 && doubleLetters && !naughty){
                nice++;
            }
        }
        System.out.println(nice);
    }

    public static void main(String[] args) throws IOException {
        part1();
    }
}
