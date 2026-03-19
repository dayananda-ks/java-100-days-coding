import java.util.*;

public class RomanToInteger {

    public static void main(String[] args) {

        String s = "MCMXCIV";   // Input

        int result = romanToInt(s);

        System.out.println("Roman: " + s);
        System.out.println("Integer: " + result);
    }

    public static int romanToInt(String s) {

        int total = 0;

        for(int i = 0; i < s.length(); i++){

            int current = getValue(s.charAt(i));

            // Check next character
            if(i < s.length() - 1 && current < getValue(s.charAt(i + 1))){
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    public static int getValue(char c){

        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }

        return 0;
    }
}
