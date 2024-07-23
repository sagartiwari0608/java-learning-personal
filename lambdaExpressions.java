public class lambdaExpressions {
    // we create one functional interface which has exactly one abstract function.
    interface FuncInter1 {
        int operation(int a, int b); // this operation method can be defined in the class that implements it
                                     // or if no class implements it then we can use annonymous functions expressions
                                     // called ad lambda expressions.
    }

    // sayMessage() is implemented using lambda expressions
    // above
    interface FuncInter2 {
        void sayMessage(String message);
    }

    // Performs FuncInter1's operation on 'a' and 'b'
    private int operate(int a, int b, FuncInter1 fobj) {
        return fobj.operation(a, b);
    }

    public static void main(String args[]) {
        // lambda expression for addition for two parameters
        // data type for x and y is optional.
        // This expression implements 'FuncInter1' interface
        FuncInter1 add = (int x, int y) -> x + y;

        // lambda expression multiplication for two
        // parameters This expression also implements
        // 'FuncInter1' interface
        FuncInter1 multiply = (int x, int y) -> x * y;

        // Creating an object of Test to call operate using
        // different implementations using lambda
        // Expressions
        Test tobj = new Test();

        // Add two numbers using lambda expression
        System.out.println("Addition is "
                + tobj.operate(6, 3, add));

        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is "
                + tobj.operate(6, 3, multiply));

        // lambda expression for single parameter
        // This expression implements 'FuncInter2' interface
        FuncInter2 fobj = message -> System.out.println("Hello " + message);
        fobj.sayMessage("Geek");
    }
}
