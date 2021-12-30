package controller
import java.util.Scanner
import model.domain.Elevator
import util.RegexValidation

class ControlPanel(elevator: Elevator) {

    private val myElevator = elevator
    private val power = true
    private var currentFloor = "0"

    fun chooseFloor() {

        fun userInput(): String {
            val scanner = Scanner(System.`in`)
            return scanner.nextLine()
        }

            while (power) {
            println("please enter your destination floor number or \"off\" to shut down the elevator.")

                val elevatorCommand = userInput()

                if (currentFloor == elevatorCommand) {
                    println("that is the floor we are on!")
                    continue
                }

                val validInput = RegexValidation().elevatorCommandRegex(elevatorCommand)
                if (!validInput) {
                    println("Not a proper input. Try again.")
                    continue
                }

            if (elevatorCommand == "off") {
                println("elevator has been shut down.")
                break
            }

            if (elevatorCommand.toInt() > myElevator.floors) {
                println(
                    "this elevator does not go to that floor."
                )
                continue
            } else {
                println("welcome to floor: ${elevatorCommand.toInt()}")
                currentFloor = elevatorCommand
            }
            }
        }
}
