# Ex28_ViewModelsAndStateFlow
Lecture 02 - Development of Graphical User Interfaces (GUI)

A TextView displays the number of likes, which can be increased/decreased by using the provided Buttons.
- A ViewModel holds the mutable number of likes (MutableStateFlow) and an immutable backing property (Flow) exposes this data to the UI.
- Flow.map() is used to transform the Int value into a String value to easily display the information on the screen.