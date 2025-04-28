package printer;

// A class for processing the information.
public class Processing {

    // process information.
    synchronized protected static void process() {
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(200);
            } catch (InterruptedException exc) {
                System.out.println("Processing thread has been interrupted.");
            }
        }
    }
}