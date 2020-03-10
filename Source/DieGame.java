import java.io.*;
import java.util.*;

public class DieGame implements MainInterface {


    public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static RandomInterface r=new LinearCongruentialGenerator();
    public static HashSet<Integer> numbersRolled=new HashSet<Integer>();

    public void initialiseGame() {


    }

    public void mainGame() {
      // The main game:

      // Let the user roll the die twice
      for (int i=0; i<2; i++) {
        System.out.println("Hit <RETURN> to roll the die");
        try {br.readLine();}
        catch (IOException e){System.out.println(e);}
        int dieRoll=(int)(r.next() * 6) + 1;

        System.out.println("You rolled " + dieRoll);
        numbersRolled.add(new Integer(dieRoll));
      }

      // Display the numbers rolled
      System.out.println("Numbers rolled: " + numbersRolled);
  }

    public void declareGameWinner() {

       if (numbersRolled.contains(new Integer(1))) {
        System.out.println("You won!");
      }
      else System.out.println("You lost!");
  }
    }

