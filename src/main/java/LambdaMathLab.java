public class LambdaMathLab {

    public static int applyOperation(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }

    public static void main(String[] args) {

        int addResult = applyOperation(10, 5, (a, b) -> a + b);
        int subResult = applyOperation(10, 5, (a, b) -> a - b);
        int mulResult = applyOperation(10, 5, (a, b) -> a * b);

        System.out.println("Addition: " + addResult);
        System.out.println("Subtraction: " + subResult);
        System.out.println("Multiplication: " + mulResult);
    }
}
