# Java-Project

# 🏦 Banking System Project

_A simple, structured Java application for managing bank accounts, transactions and reports._

## 🔧 Project Status
**In Progress ⚡** – Core features implemented (account management, deposit, withdraw, report generation).  
GUI and advanced features are under development.

## ✨ Why this project?

- 🧠 Ideal for practicing **OOP concepts**, **exception handling**, and **GUI event handling**  
- 💡 Modular design—with separate classes for accounts, database, GUI, handlers, and reports  
- 📊 Demonstrates a full flow: account creation → deposit/withdraw → reporting  

---

## 📂 Project Structure Currently:
src/accounts/
│
├── Account.java # Core account class (number, holder, balance, transfer)
├── AccountDatabase.java # Manages collection of accounts & basic operations
├── SavingsAccount.java # (Optional extension) Savings account subclass
├── InsufficientFundsException.java # Custom exception for invalid withdrawals
├── ReportGenerator.java # Console‑based reporting of account + system summary
├── EventHandlers.java # GUI event handlers (deposit, withdraw, balance check)
└── BankingSystemGUI.java # Swing-based GUI for interactive operations

Compiled `.class` files are located in:
out/accounts/

 1.**Compile all Java files** to the output folder:
   ```bash
   cd C:\CS2053_JAVA\Java‑Project
   javac -d out src/accounts/*.java

2. Run the report generator (console version):

java -cp out accounts.ReportGenerator

3. Run the GUI version (when BankingSystemGUI.java is implemented):

java -cp out accounts.BankingSystemGUI

💰 Notes & Features

Balances displayed in Rs. (Indian Rupees) for clarity

Transaction operations (deposit, withdraw, transfer) handle invalid inputs & insufficient funds via InsufficientFundsException

Database class is thread‑safe in core account operations

GUI provides interactive access to the key operations

🤝 Contributing

Fork this repository, implement features or fixes, and open a Pull Request.
Please follow Java naming conventions, maintain clean code, and include relevant comments.

📜 License

This project is for educational and demonstration purposes.
Feel free to modify or extend it for your own learning journey.

🎉 Acknowledgements

Project designed by Nayana M in partnership with Sneha Biswas

Built using Java SE and Swing

Thanks to the broader open‑source community for inspiration and learning