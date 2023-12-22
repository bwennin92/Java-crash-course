package crashcourse.demo;

public class HelloWorld {
    public static void main(String[] args) {
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;

    System.out.println("The maximum value for an int = " + max);
    System.out.println("The minimum value for an int = " + min);

    byte maxByteValue = Byte.MAX_VALUE;
    byte minByteValue = Byte.MIN_VALUE;

    System.out.println("The maximum value for a byte = " + maxByteValue);
    System.out.println("The maximum value for a byte = " + minByteValue);

    long maxLongValue = Long.MAX_VALUE;
    long minLongValue = Long.MIN_VALUE;

    System.out.println("Long max value = " + maxLongValue);
    System.out.println("Long min value = " + minLongValue);

    long myNumber = 2147483648l;
 }
}