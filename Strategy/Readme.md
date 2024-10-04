# Strategy Pattern Overview
The Strategy pattern is a behavioral design pattern that enables selecting an algorithm at runtime by injecting the algorithm into the client.

### Key Components:
1. **Strategy Interface**: Defines a family of algorithms.
2. **Concrete Strategies**: Implementations of the strategy interface, each encapsulating a specific algorithm.
3. **Context (Client)**: Maintains a reference to a strategy interface and uses it to execute the algorithm.

### Dynamic Selection:
- The Strategy pattern allows the algorithm to be selected at runtime, making the system flexible and extensible.
- Algorithms can be interchanged without modifying the client.

### Relationship:
The Strategy pattern establishes a **one-to-one relationship** so the client must have only one strategy at a time.

### Strategy Pattern vs State Pattern

Consider an **IVR (Interactive Voice Response)** system handling customer calls. The system should be able to handle customers based on the type of day:

- **Work Days**
- **Holidays**

To implement this, you can use the **State Pattern**:

- **Holiday**: The IVR responds with, "Calls can be taken only on working days between 9 am and 5 pm."
- **Work Days**: The IVR connects the customer to a customer care executive.

The process of connecting a customer to a support executive can be implemented using the **Strategy Pattern**. The strategy for choosing an executive can be based on algorithms such as:

- **Round Robin**
- **Least Recently Used**
- **Other priority-based algorithms**

### Summary
- The **State Pattern** decides **"when"** to perform an action (e.g., handle calls differently based on holidays or workdays).
- The **Strategy Pattern** decides **"how"** to perform an action (e.g., which executive to connect based on different algorithms).