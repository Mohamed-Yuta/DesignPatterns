# Observer Pattern Overview

### Definition:
The Observer pattern is a behavioral design pattern that enables an object (the *Observable*) to notify multiple dependent objects (the *observers*) about changes in its state.

### Key Components:
1. **Observable**: Maintains a list of observers and notifies them of state changes.
2. **Observer**: An object that receives updates from the Observable when changes occur.

### Notification Models:
- **Push Model**: The Observable sends the new state directly to the observers. it's like observable saying, "Hi, Something has changed, here is the new changes."
- **Pull Model**: The Observable notifies the observers of a change, and the observers request the updated state. it's like observable saying, "Hi, something has changed, you can request the new changes if you want."

### Relationship:
The Observer pattern establishes a **one-to-many relationship** where one Observable updates many observers whenever a state change occurs.