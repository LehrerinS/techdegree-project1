// could you please give me back all improvements that you see and also if possible could you please give me back a hint and try that I improve it on my own, thanks!
import java.util.Random;

public class Jar {      
      private String name;
      private String maxNum;
      int hits;
      int tries=0;
      
  // I could in constructor give maxNum value from argument and then it means that when I instantiate object of Jar I pass in maxNum value
  // then it would come from main as "treehouse"
      public Jar(){}
  
      public int random(String mMaxItemsAllowed){
        Random random = new Random();
        int maxItemsAllowed = Integer.parseInt(mMaxItemsAllowed);
        int someNumber = random.nextInt(maxItemsAllowed);
        System.out.printf("The random number is %d.%n", someNumber);
        return someNumber;
      }
  
      public boolean fill(String mMaxItemsAllowed, String mSomeNumber, int someNumber) {
        boolean isHit=false;      
        if (Integer.parseInt(mSomeNumber)>Integer.parseInt(mMaxItemsAllowed)){
          throw new IllegalArgumentException("Your guess must be less than " + mMaxItemsAllowed);
        }
            if(someNumber==Integer.parseInt(mSomeNumber)) {
              isHit=true;
              hits =1;
              tries++;
//              System.out.printf("isHit is %s and real guess is %s%n", isHit, someNumber);
              System.out.printf("You guessed correctly. You got it in %s attempts(s). %n", tries);
            }else if(Integer.parseInt(mSomeNumber)>someNumber){
              isHit=false;
              tries++;
//              System.out.printf("isHit is %s and real guess is %s, your guess is too high %n", isHit, someNumber);
              System.out.printf("Your guess is too high %n");
            }
            else{
              isHit=false;
              tries++;
//            System.out.printf("isHit is %s and real guess is %s, your guess is too low %n", isHit, someNumber);
              System.out.printf("Your guess is too low %n");
            }              
        return isHit;
      }
  
      public boolean checkHit(){
        if(hits==1){
         return true;
        }
        else
          return false;
      }
  
//  public int maxNumber(){
//  return maxNum;
//  }

}