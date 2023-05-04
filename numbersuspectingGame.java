import java.util.Random;
import java.util.Scanner;
public class numbersuspectingGame {
  public static void main(String[] args) {
    Random Random_number= new Random();
    int correct_guess=Random_number.nextInt(100);
    int trials=0;
    Scanner read=new Scanner(System.in);
    System.out.println("Suspect a number between 1 to 100, You will have 10 trials!" );
    System.out.println("ALL THE VERY BEST");
    
    int suspect;
    int i=0;
    boolean win=false;
    while(win==false) {
      suspect=read.nextInt();
      trials++;
    
    if(suspect==correct_guess) {
      win=true;
    }
    else if(i>8){
      System.out.println("You loose! the right answer was: "+correct_guess);
      return;
    }
    else if(suspect<correct_guess){
      i++;
      System.out.println("Yor suspect is lower than the right suspect! trials left: "+(10-i));
      
      
      
    }
    else if(suspect>correct_guess) {
      i++;
      System.out.println("Your suspect Is Higher Than THe Right suspect! trials left: "+(10-i));
      
    }
    
    
  }
    System.out.println("You Carried The Day!");
    System.out.println("Then number was "+correct_guess);
    System.out.println("You used "+trials+" trials to suspect the right number");
    System.out.println("Your score is "+((11-trials)*10)+" out of 100");
    
}
}