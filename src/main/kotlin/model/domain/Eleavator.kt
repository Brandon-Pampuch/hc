package model.domain

import io.konform.validation.Invalid
import io.konform.validation.Validation
import io.konform.validation.jsonschema.maximum

data class Elevator(
    val floors: Int = 0

) { init {
    Validation<Elevator> {
        Elevator::floors required {
            maximum(161)
        }
    }.validateAndThrowOnFailure(this)
}

private fun <T> Validation<T>.validateAndThrowOnFailure(value: T) {
    val result = validate(value)
    if (result is Invalid<T>) {
        throw IllegalArgumentException(result.errors.toString() + "No building currently has this number of floors. " +
                "The tallest building in the world is the Burj Khalifa in Dubai with 161.")
            }
        }
    }
