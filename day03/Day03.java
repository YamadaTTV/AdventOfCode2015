package day03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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

    public static void part2() throws IOException {
        String input = readInput("input/day03.txt");
        Set<String> visitedHouses = new HashSet<>();
        int santaX = 0;
        int santaY = 0;
        int roboX = 0;
        int roboY = 0;
        visitedHouses.add(santaX + "," + santaY);
        List<String> chunks = new ArrayList<>();
        for(int i = 0; i < input.length(); i += 2){
            if(i + 2 <= input.length()){
                chunks.add(input.substring(i, i+2));
            } else {
                chunks.add(input.substring(i));
            }
        }
        String[] santaAndRobo = chunks.toArray(new String[0]);
        for(String directions: santaAndRobo){
            for(int i = 0; i < directions.length(); i++){
                char c = directions.charAt(i);
                if(i % 2 == 0){ // Santa
                    if(c == '^'){
                        santaY++;
                        visitedHouses.add(santaX + "," + santaY);
                    } else if(c == 'v'){
                        santaY--;
                        visitedHouses.add(santaX + "," + santaY);
                    } else if(c == '>'){
                        santaX++;
                        visitedHouses.add(santaX + "," + santaY);
                    } else if(c == '<'){
                        santaX--;
                        visitedHouses.add(santaX + "," + santaY);
                    }
                } else {
                    if(c == '^'){
                        roboY++;
                        visitedHouses.add(roboX + "," + roboY);
                    } else if(c == 'v'){
                        roboY--;
                        visitedHouses.add(roboX + "," + roboY);
                    } else if(c == '>'){
                        roboX++;
                        visitedHouses.add(roboX + "," + roboY);
                    } else if(c == '<'){
                        roboX--;
                        visitedHouses.add(roboX + "," + roboY);
                    }
                }
            }
        }
        System.out.println(visitedHouses.size());
    }

    public static void main(String[] args) throws IOException {
        part1();
        part2();
    }
}
