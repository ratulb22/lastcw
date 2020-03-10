import java.io.*;

public class Main1 {


  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 



  public static void main(String[] args) throws Exception {
    FactoryDesign FactoryDesign = new FactoryDesign();

    System.out.print("Card (c) or Die (d) game? ");
    String ans=br.readLine();

    MainInterface Game = FactoryDesign.Game(ans);

    Game.initialiseGame();
    Game.mainGame();
    Game.declareGameWinner();

  }

} 