// could you please give me back all improvements that you see and also if possible could you please give me back a hint and try that I improve it on my own, thanks!
import java.util.ArrayList;

public class GuessingGame {
  // static means it is class method
    public static void main(String[] args) {

      Jar jar = new Jar();  
      
      Prompter prompter = new Prompter(jar);
      String x = prompter.promptForItem();
      String y = prompter.promptForMaxAmount(x);
      int xxx = prompter.callRandom(y);
      while(!jar.checkHit()){
        prompter.promptAdministrator(x, y, xxx);
      }
      
    }
}
