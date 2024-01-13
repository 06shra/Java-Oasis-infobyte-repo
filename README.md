1)ATM interface
==========
### Project Overview:

The provided Java code represents a simple ATM (Automated Teller Machine) interface with basic functionalities such as viewing balance, withdrawing and depositing money, viewing a mini statement, and exiting the ATM. The system maintains account information and transactions using an ATM object and an implementation of an interface.

### Classes and Interfaces:

1. **AtmOperationImpl Class:**
   - Implements the `AtmOperationInterface` and provides the functionality for viewing balance, withdrawing money, depositing money, and viewing a mini statement.
   - Maintains a `ministmt` map to store transaction details.
   - Uses an instance of the `ATM` class to manage the account balance.

2. **ATM Class:**
   - Represents the ATM entity with attributes such as balance, deposited amount, and withdrawn amount.
   - Provides getters and setters for accessing and modifying these attributes.

3. **AtmOperationInterface Interface:**
   - Declares the methods for viewing balance, withdrawing money, depositing money, and viewing a mini statement.

4. **MainClass:**
   - The main class that acts as the entry point of the ATM program.
   - Prompts the user for ATM number and PIN, and upon successful verification, initiates an infinite loop for interacting with the ATM functionalities.
   - Utilizes an instance of `AtmOperationImpl` to perform ATM operations based on user input.

### User Interaction:

- The program interacts with the user through a menu-based system, allowing them to choose options by entering corresponding numbers.
- Options include viewing the available balance, withdrawing money, depositing money, viewing a mini statement, and exiting the ATM.

### Security:

- The program includes a basic security check by comparing the entered ATM number and PIN with predefined values (`atmnumber` and `atmpin`).
- If the credentials match, the user gains access to the ATM functionalities; otherwise, the program exits.

### Transactions and Statements:

- Successful transactions (withdrawals and deposits) are recorded in the `ministmt` map, which is then displayed when the user requests a mini statement.

### Note:

- The system assumes a predefined ATM number (`atmnumber`) and PIN (`atmpin`) for simplicity.
- The code does not include more advanced features such as user account management, transaction history persistence, or error handling. Additional enhancements could be implemented for a more realistic ATM system.

2) Online Reservation
===================
The provided Java code represents a simple console-based online seat reservation system. Here's a description of the project:

### Project Overview:

The project is an implementation of an online seat reservation system that allows users to view the seat map, reserve seats, cancel reservations, and exit the program. The system maintains the status of each seat using a boolean array.

### Classes and Methods:

1. **OnlineReservation Class:**
   - The main class of the program.
   - Contains a `main` method that serves as the entry point of the application.
   - Utilizes an infinite loop to continuously prompt the user for actions until the program is manually terminated.

2. **viewSeatMap Method:**
   - Displays the current seat map, indicating reserved seats with "X" and empty seats with seat numbers.
   - Iterates through the boolean array representing seat availability.

3. **reserveSeat Method:**
   - Allows users to reserve a seat by inputting the desired seat number.
   - Checks for the validity of the seat number and whether the seat is already reserved.
   - Updates the status of the selected seat if it's available.

4. **cancelReservation Method:**
   - Enables users to cancel a reservation by providing the seat number.
   - Validates the seat number and checks if the seat is currently reserved.
   - Cancels the reservation if the seat is reserved.

### Seat Representation:

- The seat availability is represented by a boolean array named `seats`, where each index corresponds to a seat number.
- If `seats[i]` is `true`, it indicates that the seat (i+1) is reserved; otherwise, it is available.

### User Interaction:

- The program interacts with the user through a menu-based system, allowing them to choose options by entering corresponding numbers.
- Options include viewing the seat map, reserving a seat, canceling a reservation, and exiting the program.

### Input Handling:

- User input is collected using the `Scanner` class, ensuring the program can receive input from the console.

### Flow Control:

- The program uses a switch statement to determine the action to be taken based on the user's input.
- Invalid options prompt a message to inform the user.

### Termination:

- The program can be terminated gracefully by choosing the "Exit" option (option 4).

### Note:

- The system assumes a total of 10 seats, and seat numbers range from 1 to 10.
- The code does not include error handling for scenarios such as non-integer input; additional validation could be implemented for robustness.
