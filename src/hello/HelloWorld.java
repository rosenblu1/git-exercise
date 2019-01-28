/**
 * 
 */
package hello;
import java.io.PrintWriter;
/**
 * @author rosenblu1
 *
 */
public class HelloWorld {
  public static void main (String[] args) {
 
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println ("Hello, GitHub!");
    pen.flush();
  } // main(String[])
}
