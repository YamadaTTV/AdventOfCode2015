package day03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day03 {

    public static String readInput(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        return reader.readLine();
    }

    public static void part1() throws IOException {
        String input = readInput("input/day03.txt");
        Set<String> visitedHouses = new HashSet<>();
        char[] directions = input.toCharArray();
        int x = 0;
        int y = 0;
        visitedHouses.add(x + "," + y);
        for(char direction: directions){
            if(direction == '^'){
                y++;
                visitedHouses.add(x + "," + y);
            } else if(direction == 'v'){
                y--;
                visitedHouses.add(x + "," + y);
            } else if(direction == '>'){
                x++;
                visitedHouses.add(x + "," + y);
            } else if(direction == '<'){
                x--;
                visitedHouses.add(x + "," + y);
            }
        }
        System.out.println(visitedHouses.size());
    }

    public static void main(String[] args) throws IOException {
        part1();
    }
}
