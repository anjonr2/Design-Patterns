Receivers are the actual smart home devices that perform the work.
As we can see from the concrete receiver class that they do not have any knowledge
about Command or the invoker


Each command wraps a specific receiver action. For simple on/off commands, undo
calls the inverse method. For commands that change state (like temperature), the 
command saves the previous state before executing so it can restore it during undo
