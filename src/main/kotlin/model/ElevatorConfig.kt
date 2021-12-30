package model

import java.util.Scanner
import model.domain.Elevator
import util.RegexValidation

class ElevatorConfig {
    fun userInput(): String {
        val scanner = Scanner(System.`in`)
        return scanner.nextLine()
    }

    fun configureFloor(request: String): Int {
        var floorConfigIsIncomplete = true
        var numberOfFloorsInput: String

        do {
            println(request)
            numberOfFloorsInput = userInput()
            val validFloorsRegex = RegexValidation().elevatorConfigRegex(numberOfFloorsInput)
            if (!validFloorsRegex) {
                println("Please enter a number for floors.")
                continue
            } else {
                floorConfigIsIncomplete = false
            }
        } while (floorConfigIsIncomplete)
        return numberOfFloorsInput.toInt()
    }

    fun configureElevator(): Elevator {
        println("Welcome to your new elevator. Please take a moment to configure.")
        return Elevator(
            configureFloor("please enter the number of floors."))
    }
}
