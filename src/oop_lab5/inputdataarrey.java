package oop_lab5;

public class inputdataarrey {
    //1.input Data from user
//2.find summation of data in array
//3.find average value of data in array
//4.fild maximum value of data in array
//5.find minimum valule of data in array

import java.util.Scanner;

    public class InputDataToArray {
        private static final int MAX = 10;
        public static void main(String[] args){
            int num[] = new int[MAX];
            num = inputData(num);
            ShowData(num);
            summation(num);


        }//main

        private static void summation(int[] num) {
            int total = 0;
            for (int i=0;i<num.length;i++){
                total += num[i];
            }
            System.out.println("\nThe summstion of "+"value in array is: "+total);
            System.out.println("the average value "+"in array is: "+total/MAX);
        }

        private static void ShowData(int[] num) {
            System.out.println("Data in array: ");
            for (int Val: num)
                System.out.println(Val+" ");
        }

        private static int[] inputData(int []num) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Plaese enter data to array: ");
            for (int i=0;i<num.length;i++){
                System.out.print("num["+i+"]: ");
                num[i] = scanner.nextInt();
            }
            return num;
        }

    }//class
