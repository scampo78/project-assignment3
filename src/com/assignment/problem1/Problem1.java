package com.assignment.problem1;
import java.util.Scanner;
import java.util.Random;

public class Problem1 {

    public static void main(String[] args) {


        boolean reset = true;

        while(true) {

            DifficultyLevel();
            NewQuestion();
        }
    }

    public static void NewQuestion() {

        Scanner scnr = new Scanner(System.in);
        Random SecureRandom = new Random();

        double correct = 0.0;
        double incorrect = 0.0;
        double percentageCorrect;

        for (int i = 0; i < 10; ++i) {

            int num1 = SecureRandom.nextInt(10);
            int num2 = SecureRandom.nextInt(10);

            System.out.println("How much is " + num1 + " times " + num2 + "?");

            int answer = scnr.nextInt();

            if (answer == num1 * num2) {

                int statements = SecureRandom.nextInt(4) + 1;

                switch (statements) {

                    case 1:
                        System.out.println("Very good!");
                        break;

                    case 2:
                        System.out.println("Excellent!");
                        break;

                    case 3:
                        System.out.println("Nice work!");
                        break;

                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }
                ++correct;
            } else if (answer != num1 * num2) {

                int statements = SecureRandom.nextInt(4) + 1;

                switch (statements) {

                    case 1:
                        System.out.println("No. Please try again.");
                        break;

                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;

                    case 3:
                        System.out.println("Don't give up!");
                        break;

                    case 4:
                        System.out.println("No. Keep trying.");
                        break;
                }
                ++incorrect;
            }
        }
        System.out.println("Number of questions answered correctly: " + correct);
        System.out.println("Number of questions answered correctly: " + incorrect);
        percentageCorrect = (correct / 10.0) * 100;
        System.out.println("Percentage of questions answered correctly " + percentageCorrect + "%");

        if (percentageCorrect <= 75.0) {
            System.out.println("Please ask your teacher for extra help.");
        }
        else if (percentageCorrect >= 75.0) {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
        }
    public static int DifficultyLevel(){

        Scanner scnr = new Scanner(System.in);
        Random SecureRandom = new Random();

        int levelSelect;

        System.out.println("Choose difficulty by typing 1, 2, 3, or 4");
        levelSelect = scnr.nextInt();

        switch(levelSelect){

            case 1:

                int num1 = SecureRandom.nextInt(10);
                int num2 = SecureRandom.nextInt(10);
                break;

            case 2:

                num1 = SecureRandom.nextInt(90) + 10;
                num2 = SecureRandom.nextInt(90) + 10;
                break;

            case 3:

                num1 = SecureRandom.nextInt(900) + 100;
                num2 = SecureRandom.nextInt(900) + 100;
                break;

            case 4:
                num1 = SecureRandom.nextInt(9000) + 1000;
                num2 = SecureRandom.nextInt(9000) + 1000;
                break;
        }
        return levelSelect;
    }

}

