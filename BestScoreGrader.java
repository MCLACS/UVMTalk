import java.util.*;

public class BestScoreGrader implements IGrader
{    
    @Override
    public double calculateGrade(List<Double> grades)
    {
        Collections.sort(grades);
        return grades.get(grades.size()-1);
    }
}