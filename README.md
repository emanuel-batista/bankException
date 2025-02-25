# Java Bank Account Management

This project was developed with a focus on **exceptions in Java**, a concept I have just learned. The program simulates a simple banking system, allowing withdrawal and deposit operations, as well as implementing error control with custom exceptions.

## 📌 Features
- Create a bank account with number, holder, initial balance, and withdrawal limit.
- Perform withdrawals and deposits.
- Throw custom exceptions to handle errors such as:
  - **Insufficient balance** (`notEnoughBalanceException`)
  - **Exceeding withdrawal limit** (`exceededWithdrawLimitException`)
- Exception handling with user-friendly error messages.

## 🛠️ Technologies Used
- **Java** (version 8+)
- **Object-Oriented Programming**
- **Custom Exceptions**

## 🏗️ Project Structure
```
application/       -> Contains the main class `Main.java`
model/entities/    -> Contains the `Account.java` class
model/exceptions/  -> Contains the custom exceptions
```

## 🏃 How to Run
1. Clone this repository.
2. Compile the Java files.
3. Run the `Main.java` class.

## 🔥 Usage Example
```
Enter account data
Number: 1234
Holder: John Doe
Initial balance: 1000.0
Withdraw limit: 500.0

Enter amount for withdraw: 600.0
Withdraw error: The amount exceeds withdraw limit
```

## 📚 Learnings
This project was a great opportunity to practice **custom exceptions** and improve the understanding of **error handling** in Java.

---
📌 **Next steps:** Improve code structure, implement tests, and add new features such as transfers between accounts.

