package day02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day02 {

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
        List<String> input = readInput("input/day02.txt");
        int length;
        int width;
        int height;
        int surfaceArea;
        int smallestSide = 0;
        int totalPaper = 0;
        for(int i = 0; i < input.size(); i++){
            String[] split = input.get(i).split("x");
            length = Integer.parseInt(split[0]);
            width = Integer.parseInt(split[1]);
            height = Integer.parseInt(split[2]);
            surfaceArea = 2 * length * width + 2 * width * height + 2 * height * length;
            int lw = length * width;
            int wh = width * height;
            int hl = height * length;
            if(lw <= wh && lw <= hl){
                smallestSide = lw;
            } else if(wh <= lw && wh <= hl){
                smallestSide = wh;
            } else {
                smallestSide = hl;
            }
            totalPaper += surfaceArea + smallestSide;
        }
        System.out.println(totalPaper);
    }

    public static void part2() throws IOException{
        List<String> input = readInput("input/day02.txt");
        int length;
        int width;
        int height;
        int bow;
        int ribbon;
        int totalRibbon = 0;
        for(int i = 0; i < input.size(); i++){
            String[] split = input.get(i).split("x");
            length = Integer.parseInt(split[0]);
            width = Integer.parseInt(split[1]);
            height = Integer.parseInt(split[2]);
            bow = length * width * height;
            int lw = length * width;
            int wh = width * height;
            int hl = height * length;
            if(lw <= wh && lw <= hl){
                ribbon = length + length + width + width;
            } else if(wh <= lw && wh <= hl){
                ribbon = width + width + height + height;
            } else {
                ribbon = height + height + length + length;
            }
            totalRibbon += bow + ribbon;
        }
        System.out.println(totalRibbon);
    }

    public static void main(String[] args) throws IOException {
        part1();
        part2();
    }
}
