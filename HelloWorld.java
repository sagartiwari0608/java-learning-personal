
// public class HelloWorld {
//     int number = 1;
//     char character = 'a';
//     long numberButLong = 1234567890;
//     float decimalNumbers = 2.5f;
//     double decimalNumbersextended = 2.1234567896576545678;

//     public static void main(String[] args) {
//         System.out.println("hello world");
//     }

//     public void printableMethod() {
//         System.out.println(number + character + numberButLong + decimalNumbers + decimalNumbersextended);
//     }
// }

// class HelloVariableUser {
//     HelloWorld Obj = new HelloWorld()
//     this.Obj.printableMethod();
// }

// This method won't work because of the way java works. so we will learn a correct implementation below. 
// Reason: reason is quite simple that java only executes one main method and nothing else. it will definetly execute everything that is written in that main method block.
// Hence if we look at above code now helloworldvariableUser is not being called anywhere hence this is totally invalid. 
// lets look at a proper way.

public class HelloWorld {

    public static void main(String[] args) {
        int number = 1;
        char character = 'a';
        long numberButLong = 1234567890;
        float decimalNumbers = 2.5f; // now here the thing with java is that it has int as default number type but
                                     // double as default decimal typw so we need to add an 'f' in the end of number
                                     // to specify that this is going to be a float. now the reason to do that will
                                     // be to save some space as double takes up more space. but java has prioritized
                                     // it due to more precision.
        double decimalNumbersextended = 2.1234567896576545678;
        System.out.println("hello world"); // here this x is just a hint that where this value is going. means that the
                                           // function where this value will be assigned.
        HelloVariableUser objHelloVariableUser = new HelloVariableUser();
        objHelloVariableUser.printableMethod(number, character, numberButLong, decimalNumbers, decimalNumbersextended);
        // just like here we have this inlay hint this hint will help us to correctly
        // place items so that we dont mess up the order.
    }

}

class HelloVariableUser {

    HelloVariableUser() {
        // this is constructor this is mostly used to initialise the variables that will
        // be used in this class.
        // and you would have noticed one thing that there will be one .class file
        // generated for all the classes that we write.
        // it doesn't matter if we write all classes in one file or all classes in
        // separate files it will be like that always .class files will be generated
        // automatically for all the classes.

    }

    public void printableMethod(int number, char character, long numberButLong, float decimalNumbers,
            double decimalNumbersextended) {

        System.out.println(number);
        System.out.println(character);
        System.out.println(numberButLong);
        System.out.println(decimalNumbers);
        System.out.println(decimalNumbersextended);
    }
}