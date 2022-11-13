import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)throws IOException
    {
        File fin = new File("input.txt");
        FileReader fr = new FileReader(fin);
        BufferedReader reader = new BufferedReader(fr);
        FileWriter out=new FileWriter("output.txt");
        String line =reader.readLine();

        String []l=line.split("\\s");
        
        while (line!=null)
        {
            out.write(String.valueOf(Calculator.RPN_to_answer((Calculator.expresionToReverse_poland_notation(line)))));
            line = reader.readLine();
        }

       // Scanner scan=new Scanner(fin);
        //String expression = scan.next();

            //out.write(String.valueOf(Calculator.RPN_to_answer((Calculator.expresionToReverse_poland_notation(expression)))));


        out.close();
    }
}