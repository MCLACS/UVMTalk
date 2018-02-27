import java.util.*;

// HEADS UP -- STUDENTS LOVE THIS GRADER!!

public class BestScoreGrader implements IGrader
{    
    @Override
    public double calculateGrade(List<Double> grades)
    {
        Collections.sort(grades);
        return grades.get(grades.size()-1);
    }
}