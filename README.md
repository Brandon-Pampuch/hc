### How to run tests and elevator

The directions should prompt you in the terminal once the app has begun.


1. Build application : `./gradlew build` from root directory (will also run tests).
2. Run application: navigate to Main.kt and play with green triangle next to Main function signature.
3. To run tests individually navigate to `src/test/kotlin` choose a test and press play on the test function.

You can also simply run `./gradlew test` in the project root directory.

How long did you spend on this?

I spent about four or five hours. I can't stand code that breaks on faulty input. 
With the input values coming from the input stream validation and testing was a little tricky.
What, if anything, would you change if you had more time to spend on it?

A million things, but the top three would be:
1. A building class with floors that had methods for up and down floor arrows and have that class inherit from elevator.
2. A ton of testing for invalid input values and possible error scenarios. 
3. More fields to the `Elevator` DTO such as max weight and max persons.
