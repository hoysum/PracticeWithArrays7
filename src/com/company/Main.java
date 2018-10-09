package com.company;
//7. Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
public class Main {

    public static void main(String[] args) {
	// write your code here
        int []number = {1,2,3,4,5,6,7,8,9,10};

        for(int i=number.length-1; i>=0;  i--){
            System.out.println(number[i]);
        }
    }
}
