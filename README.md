📝 Java Notes App (CLI-Based File I/O)
📌 Task 4: Java File I/O – Notes App
A simple command-line based Java application that allows users to write and view notes using basic file input/output. It demonstrates how to persist data using FileWriter and BufferedReader.

📂 Project Structure
JavaNotesApp/
├── notes.txt             # File where notes are stored (auto-created)
├── NotesApp.java         # Main Java file with logic
└── README.md             # This file
💻 Technologies Used
FileWriter, FileReader, BufferedReader


🚀 Features
Add a new note

View all saved notes

Save notes to a text file (notes.txt)

Read notes from the file

CLI-based interaction

Input validation

📋 Menu Options
1) Write Note
2) View Notes
3) Exit


✅ Sample Output
Welcome to App...!!

1) Write Note
2) View Notes
3) Exit
Enter your Choice: 1
Enter your note: Complete Java File I/O Task
Note saved successfully!

1) Write Note
2) View Notes
3) Exit
Enter your Choice: 2

--- Saved Notes ---
- Complete Java File I/O Task
  
🛠️ How to Run
Save the file as NotesApp.java

Compile the program:
javac NotesApp.java
Run the program:
java com.NotesApp.java.NotesApp
