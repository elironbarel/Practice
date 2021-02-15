package simple.test;

public class smartSwapping {

    public static void main(String args[]) {

        int numX = 3;
        int numY = -2;
        System.out.println("Pre-swapping state:");
        System.out.println("numX value: " + numX);
        System.out.println("numY value: " + numY);

        System.out.println("");

        numX = numX + numY;
        numY = numX - numY;
        numX = numX - numY;
        System.out.println("Post-swapping state:");
        System.out.println("numX value: " + numX);
        System.out.println("numY value: " + numY);
    }
}