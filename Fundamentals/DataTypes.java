package Fundamentals;
public class DataTypes{
    public static void main(String[] args){
        // Data Types
        String name = "Sarah";
        int age = 21;
        char character = 'A';
        boolean isPassed = true;
        double grade = 3.00;
        float reward = 10.000f;

        System.out.println ("name:" + name);
        System.out.println ("age:" + age);
        System.out.println ("passed:" + isPassed);
        System.out.println ("grade:" + grade);
        System.out.println ("reward" + reward);
        System.out.println ("character:" + character);
        System.out.println ();

        //operators
        int a = 10;
        int b = 100;
        int i = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println (a % b); // modulus; used to check even and odd
        System.out.println();

        //Rlational Operator
        System.out.println(a < b); //less than
        System.out.println(a > b); //greter than
        System.out.println(a <= b);
        System.out.println(a >= b); 
        System.out.println(a == b); //equal to
        System.out.println(a != b); //not equal
        System.out.println();

        //logical operators
        System.out.println(age >= 18 && isPassed); //&& → both must be true
        System.out.println(age < 18 || isPassed); //|| → at least one true
        System.out.println(!isPassed); //! → reverse value
        
        //ASSIGNEMENT OPERATORS
        age += 4;
        System.out.println(age);
        a -= 15;
        System.out.println(a);
        a *= 100;
        System.out.println(a);
        b /= 10;
        System.out.println(b);
        System.out.println();
        
        //Increment & decrement\
        System.out.println(i++);
        System.out.println(i);
        System.out.println(--i);


        //if else statement
        if (age >= 21){
            System.out.println("Tigulang");
        }
        else {
            System.out.println("Bata");
        }

        //if-else multiple condition
        if (grade <= 1.25) {
            System.out.println("Excellent");
        } 
        else if (grade <= 3.00) {
            System.out.println("Passed");
        } 
        else {
            System.out.println("Failed");
        }


   }
}
