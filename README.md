# Printer-Simulation
This project is a multithreaded printer simulation where multiple users (threads) attempt to print documents using a shared printer resource. It demonstrates thread synchronization, wait()/notify() usage, and safe resource sharing in Java.
# 📄 ReadMe.md

# Printer Simulation

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

📋 Project Flow
Step 1: Users (threads) are created and started.

Step 2: Each user prepares its document (simulated with a delay).

Step 3: Threads synchronize access to the shared printer.

Step 4: If the printer is busy, a thread will wait.

Step 5: Once the printer is available, the thread prints its document.

Step 6: After printing, the next waiting thread is notified.

🛠 Technical Details
Thread synchronization is handled using synchronized blocks and methods.

wait() is called if the printer is already busy.

notify() wakes up the next waiting thread after a print job finishes.

Join mechanism ensures that the Main thread waits until all documents are printed.

⚡ Key Features
Proper use of Java's concurrency control (synchronized, wait(), notify()).

Clear separation of thread preparation and printer access.

Simulated realistic printing delays.

Safe shared resource usage among multiple threads.

⚠ Important Notes
No real files are uploaded —
This project simulates file uploads and printing by printing messages and delay dots . in the console.
You do not need to manually place any actual document files inside the printer folder.

💡 Why is this a good GitHub project?
Shows real-world thread synchronization skills.

Demonstrates ability to manage a shared resource safely.

Well-organized, clean code with small, focused classes.

Professional level of multithreading understanding.

🔥 Project Status
✅ Code finished and stable.
✅ Suitable for adding to your GitHub portfolio.
✅ Demonstrates clear mastery of Java basics + concurrency.


