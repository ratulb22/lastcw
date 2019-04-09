import java.io.File;
import java.util.Scanner;
import java.io.FileWriter; 
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class test1 {
	public static void main(String[] args) {

	  String findWord = null;
      String filePath = null;

      if( args.length == 2 ){
        findWord = args[0];
        filePath = args[1];
        
      } else {
        System.out.println( "You need to supply 9 valid arguments" );
        System.exit(1);
      }
	  
	  try(FileWriter fw = new FileWriter("pb1.txt", true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter out = new PrintWriter(bw))
      {
      out.println(findWord);
    //more code
      out.println("more text");
    //more code
      } catch (IOException e) {
    //exception handling left as an exercise for the reader
}
	  
  
	}
}