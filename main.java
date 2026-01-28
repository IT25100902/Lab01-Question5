class Main {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("=== Calculator Results ===\n");
        
        System.out.println("Expression 1: (3 + 4 + 5 + 7)²");
        int sum1 = calc.add(3, 4);
        sum1 = calc.add(sum1, 5);
        sum1 = calc.add(sum1, 7);
        int result1 = calc.square(sum1);
        System.out.println("Result: " + result1 + "\n");
        
        System.out.println("Expression 2: (4 + 7)² + (8 + 3)²");
        int sum2a = calc.add(4, 7);
        int square2a = calc.square(sum2a);
        
        int sum2b = calc.add(8, 3);
        int square2b = calc.square(sum2b);
        
        int result2 = calc.add(square2a, square2b);
        System.out.println("Result: " + result2);
    }
}
