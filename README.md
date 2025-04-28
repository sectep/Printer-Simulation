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

## 📋 Project Flow

```mermaid
flowchart TD
    A[Start Main Class] --> B[Create Printer Instance]
    B --> C[Create User Threads]
    C --> D[Start Each User Thread]
    D --> E[User Thread Prepares File]
    E --> F[User Thread Requests Printer Access]
    F --> G{Is Printer Busy?}
    G -- No --> H[Print the Document]
    G -- Yes --> I[Wait Until Printer Is Free]
    I --> H
    H --> J[Notify Waiting Threads]
    J --> K[User Thread Completes]
    K --> L[Main Thread Waits with Join()]
    L --> M[All Documents Printed]
    M --> N[End Program]
```

## Example Output

```
Preparing File3
Preparing File1
Preparing File2
...Prinring File3
...Prinring File2
...Prinring File1
File1 finished downloading.
File2 finished downloading.
File3 finished downloading.
``` 


