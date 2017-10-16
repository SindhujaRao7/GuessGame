import java.util.Random;// for random number

import java.util.Scanner;//for taking user input calling Scanner class

public class NumberGame//main class
{
    public static void main(String[] args)//main function
    {
        int randomNumber, flag = 1, i;//flag to check re-attempt or not
        int guess = 0;
        char choice;
        boolean haswonit=false;//to check if player has won or not
        randomNumber = (int) (Math.random() * 100) + 1;//generates a random number between 1-100//

        System.out.println("\nHello and welcome to the guess game!\t" +
                " I have randomly selected a number between 1-100\t You have 10 guesses to find that number!");
        //System.out.println("The random number is "+randomNumber); to test
        System.out.println("\nSo you ready? Y/N");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.next().charAt(0);
        while (true) {
            switch (choice) {
                case 'Y':
                    for (i = 10; i > 0; i--) {
                        if(i==10)
                        System.out.println("You have " + i + " guess(es) left! Start guessing");
                        else
                            System.out.println("You have " + i + " guess(es) left! Choose again");
                        //Scanner scanner = new Scanner(System.in);
                        guess = scanner.nextInt();//converts the user input into int
                        if (guess > randomNumber) {
                            System.out.println("The number is smaller than " + guess);
                        } else if (guess < randomNumber) {
                            System.out.println("The number is greater than " + guess);
                        } else {
                            System.out.println("That's correct, the number is " + guess + "!");
                            haswonit=true;

                            break;

                        }
                        flag = 0;
                    }

                    break;
                case 'N':
                    System.out.println("Okay bye!");
                    flag=1;
                    haswonit=false;
                    break;

            }

            if ((!haswonit)&&(flag==0)) {
                System.out.println("Sorry, you have run out of guesses. The random number was: " + randomNumber + " Play again? Y/N");
                choice = scanner.next().charAt(0);
            } else if(haswonit)           //
            {
            System.out.println("Do you want to play again? Y/N");
            choice = scanner.next().charAt(0);//only taking the first letter of user unit i.e. char
        }
        else
                break;
            }

        }
    }

