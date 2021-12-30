package model.domain
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName

internal class ElevatorTest {

    @Test
    @DisplayName("test valid elevator Class")
    fun testElevatorClass() {
        val testElevator: Elevator = Elevator(10)
        Assertions.assertEquals(Elevator(10).floors, testElevator.floors)
        }
    }
