package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        // not summer
        if(!summer && (temperature >= 25 && temperature <= 35)){
            return true;
        } else if(!summer && (temperature < 25 || temperature > 35)) {
            return false;
        } else if(summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else if(summer && (temperature < 25 || temperature > 45)) {
            return false;
        }
        return false;
    }
}
