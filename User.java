package printer;

// create a User thread.
public class User implements Runnable {
    Thread thrd;
    Printer pr;
    String userName;

    // construct a user thread, using its name.
    User(String name, Printer p) {
        thrd = new Thread(this, name);
        pr = p;
    }

    // create and run User's thread.
    public static User createAndStart(String name, Printer p) {
        User u = new User(name, p);

        u.thrd.start();
        return u;
    }

    // start a Thread.
    public void run() {
        System.out.println("Preparing " + thrd.getName());
        synchronized (pr) {

            // print the document.
            pr.printDocument(thrd.getName());
        }
    }
}
