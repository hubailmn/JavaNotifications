import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FitnessStreamLab {

    public static void main(String[] args) {

        List<String> workouts = List.of("Run", "Swim", "Bike", "Walk", "Yoga");
        int[] steps = {4500, 8200, 12000, 3000, 15000, 9800, 7600};

        System.out.println("Workouts: ");
        workouts.forEach(str -> System.out.println(" - " + str));

        System.out.println();

        var sum = IntStream.of(steps).sum();
        var max = IntStream.of(steps).max().orElse(0);
        var min = IntStream.of(steps).min().orElse(0);
        var avg = IntStream.of(steps).average().orElse(0);

        var statistic = IntStream.of(steps).summaryStatistics();

        System.out.println("Steps Sum: " + sum);
        System.out.println("Steps max: " + max);
        System.out.println("Steps min: " + min);
        System.out.println("Steps avg: " + avg);

        System.out.println("Steps statistic: " + statistic);
        System.out.println();

        String stepString = IntStream.range(0, steps.length)
                .mapToObj(i -> "Day " + (i + 1) + " " + steps[i])
                .collect(Collectors.joining(", "));

        System.out.println(stepString);
        System.out.println();

        int activeDaysSum = IntStream.of(steps)
                .filter(step -> step > 8000)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Active Steps Days Sum: " + activeDaysSum);
        System.out.println();

        workouts.stream()
                .filter(str -> str.compareTo("R") > 0)
                .sorted().map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
