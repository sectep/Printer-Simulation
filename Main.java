package printer;

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();

        // create a user interface
        User[] users = {
                User.createAndStart("File1", p),
                User.createAndStart("File2", p),
                User.createAndStart("File3", p),

        };

        // examine the interface.
        for (User user : users) {
            try {
                user.thrd.join();
                System.out.println(user.thrd.getName() + " finished downloading.");
            } catch (InterruptedException exc) {
                System.out.println("Main termination process has been interrupted.");
            }
        }
    }
}
