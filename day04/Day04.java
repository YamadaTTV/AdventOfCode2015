package day04;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Day04 {

    public static void part1() throws NoSuchAlgorithmException {
        String secretKey = "bgvyzdsv";
        int number = 1;
        MessageDigest md = MessageDigest.getInstance("MD5");
        while(true){
            String input = secretKey + number;
            byte[] hash = md.digest(input.getBytes());
            StringBuilder hexadecimalString = new StringBuilder();
            for(byte b: hash){
                String hexadecimal = Integer.toHexString(0xFF & b);
                if(hexadecimal.length() == 1){
                    hexadecimalString.append("0");
                }
                hexadecimalString.append(hexadecimal);
            }
            if(hexadecimalString.toString().startsWith("00000")){
                System.out.println(number);
                break;
            }
            number++;
        }
    }

    public static void part2() throws NoSuchAlgorithmException {
        String secretKey = "bgvyzdsv";
        int number = 1;
        MessageDigest md = MessageDigest.getInstance("MD5");
        while(true){
            String input = secretKey + number;
            byte[] hash = md.digest(input.getBytes());
            StringBuilder hexadecimalString = new StringBuilder();
            for(byte b: hash){
                String hexadecimal = Integer.toHexString(0xFF & b);
                if(hexadecimal.length() == 1){
                    hexadecimalString.append("0");
                }
                hexadecimalString.append(hexadecimal);
            }
            if(hexadecimalString.toString().startsWith("000000")){
                System.out.println(number);
                break;
            }
            number++;
        }
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        part1();
        part2();
    }
}
