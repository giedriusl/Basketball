
package exceptions;

/**
 *
 * @author giedr
 */
public class InputExc extends Exception {
    public InputExc() {}
    public InputExc(String message) { super(message); }
    public InputExc(Throwable cause) { super(cause); }
    public InputExc(String message, Throwable cause) { super(message, cause); }
}
