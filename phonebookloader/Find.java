import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Find {
    public static void main( String[] args ) {

      // Process command line arguments
      String findWord = null;
      String filePath = null;

      if( args.length == 2 ){
        findWord = args[0];
        filePath = args[1];
      } else {
        System.out.println( "You need to supply 2 valid arguments" );
        System.exit(1);
      }

      // Find and print all matching lines in the file
      //try {
        //File fileIn = new File( filePath );
        //Scanner in = new Scanner( fileIn );

        //String filename= "pb1.txt";
        //FileWriter fw = new FileWriter(filename,true); //the true will append the new data
        //fw.write("add a line\n");//appends the string to the file
        //fw.close();
        //in.close();
      //}

      try(FileWriter fw = new FileWriter("pb1.txt", true);
          BufferedWriter bw = new BufferedWriter(fw);
          PrintWriter out = new PrintWriter(bw))
      {
          out.println();
          //more code
          out.println("more text");
          //more code
      } catch (IOException e) {
    //exception handling left as an exercise for the reader
      }


      catch( FileNotFoundException ex ) {
        System.out.println( "File not found" );
      }

    }
}