import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*      Set up a generator for a random integer between 1 and 100 including those two numbers as well
        Set an int variable equal to that random number
        Make an if else loop with the nested statements to evaluate if the guess was too low or high
        We want to make a limited number of guesses only 10 guesses allowed. Using the method from the battleship game.
        If the 10 guesses are reached the program will completely restart.
        Give the user the option to quit out of the game which would end the loop. Using an if statement to exit out of the program. This would make them have to start the program over.
        No decimals only whole numbers
        
        print(random.randint())
        
        Welcome to the Hi-Low Guessing Game !
        Pick a number between 1 - 100 ____
        Your Pick was 25 
        You are to low
        Pick a number between 1-100 ____
        Your Pick was 91
        You are to high
        You have used all your guesses, do you want to play again? Y/N
        You selected N
        Thanks for playing Hi-Low 
        
*/   
System.out.println("Welcome to the Hi-Low Guessing Game");
Scanner input = new Scanner (System.in);
int guesses = 0;
while (guesses <= 10) {
    System.out.println("Pick a number between 1-100");
    guess = input.nextInt();
    }
}
}