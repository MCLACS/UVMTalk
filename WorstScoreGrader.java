import java.util.*;

public class WorstScoreGrader implements IGrader
{    
    @Override
    public double calculateGrade(List<Double> grades)
    {
        Collections.sort(grades);
        return grades.get(0);
    }
}