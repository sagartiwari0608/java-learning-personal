import java.util.Scanner;

import notDefaultPackage.Variables;

class Helloworld {
    public static void main(String a[]) {
        int i = 3;
        Variables varObj = new Variables();
        System.out.println(("hello World ! ") + i);
        System.out.println(varObj.sentenseOrWord);
        Scanner s = new Scanner(System.in);
        int inputInt = s.nextInt();
        double inputDouble = s.nextDouble();
        String inputString = s.nextLine();
        System.out.println("String: " + inputString);
        System.out.println("Double: " + inputDouble);
        System.out.println("Int: " + inputInt);
        s.close();
    }
}