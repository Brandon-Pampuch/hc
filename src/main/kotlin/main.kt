import controller.ControlPanel
import model.ElevatorConfig

fun main(args: Array<String>) {
    val elevator = ElevatorConfig().configureElevator()
    ControlPanel(elevator).chooseFloor()
}
