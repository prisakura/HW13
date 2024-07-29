public class ArithmeticCalculator {
   private double first,second;

    public ArithmeticCalculator(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public void calculate(Operation operation){
        if (operation == Operation.ADD)
            System.out.println(first+second);
        else if (operation == Operation.SUBTRACT)
            System.out.println(first-second);
        else if (operation == Operation.MULTIPLY)
            System.out.println(first*second);

    }
}
