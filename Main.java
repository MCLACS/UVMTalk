import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String args[]) throws Exception
    {
        IGrader grader = getGrader();
        
        Scanner in = new Scanner(new File("grades.txt"));
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            String tokens[] = line.split(",");
            ArrayList<Double> grades = new ArrayList<Double>();
            for (int i = 1; i < tokens.length; i++)
            {
                grades.add(Double.parseDouble(tokens[i]));
            }
            double finalGrade = grader.calculateGrade(grades);
            System.out.printf("%s -> %.2f%n", tokens[0], finalGrade);
        }
    }
    
    private static IGrader getGrader()
    {
        return new BestScoreGrader();
    }
}