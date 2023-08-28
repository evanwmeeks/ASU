import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LineWriter
{

      public static void writeAll(String[] lines, String filename) throws FileNotFoundException
{
   PrintWriter out = new PrintWriter(filename);
   for (String line : lines)
      {
         try{
            out.println(line.toUpperCase());
            }
         catch(Exception e){
            out.close();
            throw e;}
}

   }
}