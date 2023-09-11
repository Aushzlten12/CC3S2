package org.example;

public class StringCalculator {
    public static int Add(String input){
        if(input.isEmpty()) {
            return 0;
        } else {
            int numbers[] = new int[2];
            int sum=0;
            for(int i = 0;i<2;i++){
                numbers[i] =Integer.parseInt(input.split(",")[i]);
                sum += numbers[i];
            }
            return sum;
        }
    }
}
