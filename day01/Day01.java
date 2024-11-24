package day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day01 {


    public static String readInput(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        return reader.readLine();
    }

    public static void part1() throws IOException {
        int floor = 0;
        String input = readInput("input/day01.txt");
        char[] characters = input.toCharArray();
        for(char c: characters) {
            if(c == '('){
                floor++;
            } else if(c == ')'){
                floor--;
            }
        }
        System.out.println(floor);
    }

    public static void main(String[] args) throws IOException {
        part1();
    }
}
