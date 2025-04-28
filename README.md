# Printer-Simulation

This project is a **multithreaded printer simulation** where multiple users (threads) attempt to print documents using a shared printer resource.  
It demonstrates **thread synchronization**, **`wait()`/`notify()` usage**, and **safe resource sharing** in Java.

---

## 📂 Project Structure

- `Printer.java` — handles printing logic and synchronizes access to the printer.
- `User.java` — represents a user that requests printing through a separate thread.
- `Processing.java` — simulates the document preparation and printing delay.
- `Main.java` — creates users, starts threads, and ensures all printing operations complete.

---

## 🚀 How to Run

1. Create a folder named `printer` in your project directory.
2. Place the following files into the `printer` folder:
   - `Main.java`
   - `Printer.java`
   - `User.java`
   - `Processing.java`
3. Ensure that each file has the `package printer;` declaration at the top.
4. Compile and run the `Main.java` file.

```bash
javac printer/*.java
java printer.Main
```

## Example Output

```
Preparing File3
Preparing File1
Preparing File2
...Printing File3
...Printing File2
...Printing File1
File1 finished downloading.
File2 finished downloading.
File3 finished downloading.
``` 


