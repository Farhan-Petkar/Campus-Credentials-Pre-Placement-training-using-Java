//Main Agenda:
//Here I cleared my staic and non-static Funda
package practiceofall;

//Here I made another class to enhance my understanding about this static and non-static Funda.
class NonMain1{
    //2 non-static variables
    int i1 = 5;
    int j1 = 5;

    //2 static variables
    static int i2 = 5;
    static int j2 = 5;

    void sumNonStatic(){
        System.out.println("The sum of i and j = "+(i1+j1));
    }

    static void sumStatic(){
        System.out.println("The sum of i and j = "+(i2+j2));
    }
}

public class Main1{
    //2 non-static variables
    int i1 = 5;
    int j1 = 5;

    //2 static variables
    static int i2 = 5;
    static int j2 = 5;

    void sumNonStatic(){
        System.out.println("The sum of i and j = "+(i1+j1));
    }

    static void sumStatic(){
        System.out.println("The sum of i and j = "+(i2+j2));
    }

    public static void main(String[] args) {
        //First let's try all for Object.
        //Let's see if object is able to call or is able to support static aswell as non-static or not.
        // Main1 a = new Main1();
        // System.out.println(a.i1);
        // System.out.println(a.i2);
        // System.out.println(a.j1);
        // System.out.println(a.j2);
        // a.sumNonStatic();
        // a.sumStatic();

        // System.out.println(Main1.i2);
        // System.out.println(Main1.j2);

        // Main1.sumStatic();


        // NonMain1 b = new NonMain1();
        // System.out.println(b.i1);
        // System.out.println(b.i2);
        // System.out.println(b.j1);
        // System.out.println(b.j2);
        // b.sumNonStatic();
        // b.sumStatic();

        // System.out.println(NonMain1.i2);
        // System.out.println(NonMain1.j2);
        // NonMain1.sumStatic();

        new NonMain1().sumNonStatic();
    }
}