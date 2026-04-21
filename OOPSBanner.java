/**
 * OOPS Banner App - Use Case 4
 * @author Rajat Sonee
 * @version 1.0
 */
public class OOPSBanner {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        }
    }
}



