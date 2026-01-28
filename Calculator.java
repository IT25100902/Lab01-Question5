public class Calculator {
    
    
    public int add(int a, int b) {
        return a + b;
    }
    
   
    public int multiply(int a, int b) {
        return a * b;
    }
    
    
    public int square(int a) {
        return a * a;
    }
}

 class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

       
        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int sum1 = calc.add(part1, part2);
        int result1 = calc.square(sum1);

        
        int sum2a = calc.add(4, 7);
        int square2a = calc.square(sum2a);

        int sum2b = calc.add(8, 3);
        int square2b = calc.square(sum2b);

        int result2 = calc.add(square2a, square2b);

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
    }
}



