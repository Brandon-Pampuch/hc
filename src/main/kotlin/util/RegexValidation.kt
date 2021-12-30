package util

class RegexValidation {

    fun elevatorCommandRegex(input: String): Boolean {
        val regex = Regex(pattern = "^[0-9]*\$|^off\$", options = setOf(RegexOption.IGNORE_CASE))
        return regex.matches(input) && input != ""
    }

    fun elevatorConfigRegex(input: String): Boolean {
        val regex = Regex(pattern = "^[0-9]*\$", options = setOf(RegexOption.IGNORE_CASE))
        return regex.matches(input) && input != ""
    }
}
