package com.example.demo;
//Дан двумерный массив, содержащий отрицательные и положительные числа.
//Выведете на экран номера тех ячеек массива, которые содержат отрицательные числа
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegativeNumbers {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //The rows` quantity for array will be an input from user
        System.out.println("Please, enter how many rows you would like to have in you future Matrix");
        int Rows = Integer.parseInt(READER.readLine());
        //The columns` quantity for array will be an input from user
        System.out.println("Please, enter how many columns you would like to have in you future Matrix");
        int Columns = Integer.parseInt(READER.readLine());
        //2 dim matrix created
        int[][] Matrix = new int[Rows][Columns];
        matrixFill(Matrix);
        matrixDisplay(Matrix);
        //function to find nd display negatives in the array
        int counter = 0; // counter which will be changed, once match in if statement found it will grow +1
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                if (Matrix[i][j] < 0 ) {
                    counter = counter + 1;
                    System.out.print("(" + i + ", " + j + "): Arrays cage, has value " + Matrix[i][j] + "; ");
                }
                System.out.println();
            }
        }
        //printing out Negatives number detected quantity
        System.out.println("Negatives detected: " + counter);
    }
    //Method to fill the initial matrix from user`s input
    public static void matrixFill (int[][] Matrix) throws IOException {
        for (int i = 0; i < Matrix.length; i++) {
            System.out.println("Please, enter to the Matrix " + i + " Row element: ");
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.println("Please, enter to the Matrix " + j + " Column element: ");
                Matrix[i][j] = Integer.parseInt(READER.readLine());
            }
        }
    }
    //Method to display the matrix by 2 for construction
    public static void matrixDisplay (int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + "\t");//Used tabulate to have better User experience
            }
            System.out.println();
        }
    }
}