import java.util.List;
import java.util.OptionalDouble;

public class AverageOfList {
    public double calculate(List<Integer> a){
        OptionalDouble avg = a.stream().mapToInt(Integer::intValue).average();
        return avg.getAsDouble();
    }
}