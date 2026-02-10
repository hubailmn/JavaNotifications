import java.util.stream.IntStream;

public class StudentScore {

    public static void main(String[] args) {

        int[] scores = {95, 82, 67, 50, 73, 88, 45};

        IntStream.of(scores)
                .mapToObj(score -> score >= 60 ? "PASS" : "FAIL")
                .filter(status -> status.equals("PASS"))
                .forEach(result -> System.out.println("Result: " + result));

    }
}
