package model

import io.mockk.every
import io.mockk.spyk
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName

internal class ElevatorConfigTest {

    @Test
    @DisplayName("test valid floor input")
    fun testConfigureFloorValidInput() {
        val service = spyk<ElevatorConfig>()

        every { service.userInput() } returns "10"

        // when checking mocked user input
        val mockedUserInput = service.userInput()

        // then
        assertEquals("10", mockedUserInput)

        // when checking choose floor given mocked user input
        val configureFloor = service.configureFloor("any request string")

        // then
        assertEquals(10, configureFloor)
    }
    @Test
    @DisplayName("test invalid floor input")
    fun testConfigureFloorInvalidInput() {
        val service = spyk<ElevatorConfig>()

        every { service.userInput() } returns "999"

        // when checking mocked user input
        val mockedUserInput = service.userInput()

        // then
        assertEquals("999", mockedUserInput)

        // when checking choose floor given mocked user input
        val configureFloor = service.configureFloor("any request string")

        // then
        assertEquals(999, configureFloor)
    }
}
