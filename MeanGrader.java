import java.util.*;

public class MeanGrader implements IGrader
{    
    @Override
    public double calculateGrade(List<Double> grades)
    {
        double sum = 0;
        for (double g : grades)
        {
            sum = sum + g;
        }
        return sum/grades.size();
    }
}