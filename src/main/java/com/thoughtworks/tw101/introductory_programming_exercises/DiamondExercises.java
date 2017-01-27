package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {


    private static void drawLine(int spaces, int asterisks){
        for (int s = 0; s < spaces; s++){
            System.out.print(' ');
        }
        for (int a = 0; a < asterisks; a++){
            System.out.print('*');
        }
        System.out.println();
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        // spaces per line: n * 2 - 1
        for (int i = 1; i <= n; i++){
            drawLine(n - i, i * 2 - 1);
        }
    }


    private static void drawAnIsoscelesTriangleWithLeftPad(int n) {
        // spaces per line: n * 2 - 1
        for (int i = 1; i <= n; i++){
            drawLine(n - i + 1, i * 2 - 1);
        }
    }


    private static void drawAnInvertedIsoscelesTriangleWithLeftPad(int n){
        for (int i = n; i > 0; i--){
            // as all bottoms require left-side single space padding
            drawLine(n - i + 1, i * 2 - 1);
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawAnInvertedIsoscelesTriangleWithLeftPad(n - 1);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawAnIsoscelesTriangleWithLeftPad(n - 1);
        System.out.println("Larissa");
        drawAnInvertedIsoscelesTriangleWithLeftPad(n - 1);
    }


    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

}
