
import java.util.*;

public class Main{
    public static void main(String[] args) {
        boolean start = true;
        while (start) {
            Random random = new Random();
            Scanner sc = new Scanner(System.in);
            int random_number = random.nextInt(100);
            System.out.println("Enter a number to have the number of attempts to guess the number correctly : ");
            int chance = sc.nextInt();
            for (int i = 1; i <= chance; i++) {
                System.out.print("your "+ i +"st choice : ");
                int guessnumber = sc.nextInt();
                if (guessnumber == random_number) {
                    System.out.println("your number is correct.");
                    if(i == 1){
                        System.out.println("Your Grade is :A");
                        System.out.println("your are completely Awesome!");
                    }
                    else if(i == 2 || i == 3  ){
                        System.out.println("Your Grade is : B");
                        System.out.println("Super , it's a better score!");
                    } else if (i==4 || i==5 || i==6 || i==7 || i==8 || i==9 || i==10) {
                        System.out.println("Your Grade is : C");
                        System.out.println("Good score but try to get little better score");
                    }
                    else{
                        System.out.println("Your grade is : D");
                        System.out.println("Correct answer but get a better score");
                    }
                    break;
                }
                else if (guessnumber != random_number) {
                    if (guessnumber < random_number) {
                        for (int j = 1; j <= 10; j++) {
                            if (j <= 5 && guessnumber + j == random_number) {
                                System.out.print("your number is very close to the random number but ");
                                break;
                            } else if (j > 5 && guessnumber + j == random_number) {
                                System.out.print("your number is little close to the random number but ");
                                break;
                            }
                        }
                        if (guessnumber < random_number) {
                            System.out.println("your number is lesser than the random number");
                        }
                    } else if (guessnumber > random_number) {
                        for (int k = 1; k <= 10; k++) {
                            if (k <= 5 && guessnumber - k == random_number) {
                                System.out.print("your number is very close to the random number but ");
                            } else if (k < 5 && guessnumber - k == random_number) {
                                System.out.print("your number is little close to the random number but ");
                            }
                        }
                        if (guessnumber > random_number) {
                            System.out.println("your number is greater than the random number");
                        }
                    }
                }

            }
            System.out.println("press 1 to start again or 0 to exit the game.");
            int response = sc.nextInt();
            if (response == 1) {
                start = true;
            }
            else {
                System.out.println("Thank You, Welcome again.");
                start = false;
            }
        }

    }
}