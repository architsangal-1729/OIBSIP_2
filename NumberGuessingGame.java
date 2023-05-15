import java.util.*;
public class numberGuessinggame {
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        String play = "yes";
	        int round = 0, TotalScore = 0, TotalTries = 0;
			    System.out.println();
	        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 tries.");
	        while(play.equals("yes"))
	        {
	            ++round;
	            int guess, i, k = 5, tries = 0, score = 5;
	            Random rand = new Random();
	            int number = rand.nextInt(100);
	            for(i=0;i<k;i++)
	            {
					        System.out.println();
	                System.out.print("Guess the number : ");
	                guess = sc.nextInt();
	                if(number == guess)
	                {
	                    tries++;
						          System.out.println();
	                    System.out.println("Congratulations, You won!! ");
	                    result(tries,score);
	                    TotalTries += tries;
	                    TotalScore += score;
						          System.out.println();
	                    System.out.print("Play again? yes or no : ");
	                    play = sc.next().toLowerCase();
	                    break;
	                }
	                else if(number > guess && i!=k-1)
	                {
						          System.out.println();
	                    System.out.println("The number is greater than " + guess);
	                    tries++;
	                    score--;
	                }
	                else
	                {
						          System.out.println();
	                    System.out.println("The number is less than "+guess); 
	                    tries++;
	                    score--;
	                }                      
	            }
	            if(i==k)
	            {
					        System.out.println();
	                System.out.println("You have exhausted 5 tries.");
					        System.out.println();
	                System.out.println("The number to be guessed was "+number);
	                TotalTries += tries;
	                TotalScore += score;
	                result(tries,score);
					        System.out.println();
	                System.out.print("Play again? yes or no : ");
	                play = sc.next().toLowerCase();
	            }
	        }
			    System.out.println();
	        System.out.println("Your overall scorecard is :");
			    System.out.println();
	        System.out.println("You played "+round+ " rounds");
			    System.out.println("You tried "+TotalTries+" times in total");
			    System.out.println("Your final score is "+TotalScore);
	    }
	    static void result(int tries, int score)
	    {
			    System.out.println();
	        System.out.println("you tried "+tries+" times");
	        System.out.println("your score is "+score);
	    }
	}
