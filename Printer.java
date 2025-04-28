package printer;

// create a printer class
public class Printer {
    boolean isBusy;

    // print the document
    synchronized void printDocument(String name) {
        Processing.process();
        System.out.println("Printing " + name);
        isBusy = true;
        try {
            while (!isBusy) {
                System.out.println("Waiting for " + name + " to start downloading");
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Waiting process has been interrupted.");
        }

        isBusy = false;
        notify();
    }

}
