// could you please give me back all improvements that you see and also if possible could you please give me back a hint and try that I improve it on my own, thanks!
import java.util.Scanner;

public class Prompter {
  // storing private variable which is instance of Jar. we passed in Jar object
  private Jar jar;
  // defining reference to our Jar already in instantiation
  public Prompter (Jar jar){
    this.jar=jar;
  }

  public String promptForItem(){
    Scanner scanner = new Scanner(System.in);    
    System.out.printf("ADMINISTRATOR SETUP %n");
    System.out.print("What type of item? : ");
    String items = scanner.nextLine();   
    return items;
  }
  
  public String promptForMaxAmount(String items){
    Scanner scanner = new Scanner(System.in); 
    System.out.printf("What is the maximum amount of %s? : ", items);
    String maxFillAmount = scanner.nextLine();
    return maxFillAmount;
  }
  
  public int callRandom(String maxFillAmount){
    int i = jar.random(maxFillAmount);
    return i;
  }
  
  public boolean promptAdministrator(String items, String maxFillAmount, int i){
    Scanner scanner = new Scanner(System.in);    
//    System.out.printf("ADMINISTRATOR SETUP %n");
//    System.out.print("What type of item? : ");
//    String items = scanner.nextLine();    
//    System.out.printf("What is the maximum amount of %s?: ", items);
//    String maxFillAmount=scanner.nextLine();

//    int i = jar.random(maxFillAmount);
    boolean isHit=false;
    boolean isAcceptable=false;
    
    do{    
    System.out.printf("How many are in the jar? Pick a number between 1 and %s%n", maxFillAmount);
    String guess=scanner.nextLine();        
//    System.out.printf("Item name is %s and max item number is %s and your guess is %s%n", items, maxFillAmount, guess); 
    try {
      isHit=jar.fill(maxFillAmount, guess, i);
      isAcceptable=true;
    } catch(IllegalArgumentException iae) {
      System.out.printf("%s. Please try again. %n",
                        iae.getMessage());
    }
      
    }while(!isAcceptable);
    return isHit;    
  }
}