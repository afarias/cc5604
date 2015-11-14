import javax.ejb.Stateless;

/**
 * This class implements a Stateless Session Bean component with a Non-Interface Local View.
 * This kind of components can be only consumed by clients being executed in the same Virtual Machine.
 *
 * @author Andrés Farías
 */
@Stateless
public class CalculatorNILV {

    /**
     * This method is responsible for adding two numbers.
     *
     * @param a The first operand.
     * @param b The second operand.
     *
     * @return The result of adding a + b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * This method is responsible for subtracting two numbers.
     *
     * @param a The first operand
     * @param b The second operand
     *
     * @return The result of subtract b to a.
     */
    public double subtract(double a, double b) {
        return a - b;
    }
}
