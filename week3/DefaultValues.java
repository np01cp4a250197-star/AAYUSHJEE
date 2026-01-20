package week3;

public class DefaultValues {

    // Member variables (instance variables) for all 8 primitive types
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {

        // Create an object of the class
        DefaultValues obj = new DefaultValues();

        // Print default values of instance variables
        System.out.println("byte default value: " + obj.b);
        System.out.println("short default value: " + obj.s);
        System.out.println("int default value: " + obj.i);
        System.out.println("long default value: " + obj.l);
        System.out.println("float default value: " + obj.f);
        System.out.println("double default value: " + obj.d);
        System.out.println("char default value: '" + obj.c + "'");
        System.out.println("boolean default value: " + obj.bool);

        /*
         * This would NOT work for local variables because:
         * Local variables are not given default values by Java.
         * They must be initialized before use, otherwise the compiler
         * will give an error: "variable might not have been initialized".
         */
    }
}
