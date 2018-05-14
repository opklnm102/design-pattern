/**
 * Heavy objects are expensive to create.
 */
public class Heavy {

    /**
     * Constructor
     */
    public Heavy() {
        System.out.println("Creating Heavy ...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception caught.");
        }
        System.out.println("... Heavy created");
    }
}
