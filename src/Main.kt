fun main() {
    do {
        println("Please enter the number of your selection:")
        println("1. Coke")
        println("2. Diet Coke")
        println("3. Sprite")
        println("4. Dr. Pepper")
        println("5. Exit")

        val userInput = readLine()

        val choice = userInput?.toIntOrNull() ?: -1

        when (choice) {
            1 -> println("You have selected:\n1. Coke")
            2 -> println("You have selected:\n2. Diet Coke")
            3 -> println("You have selected:\n3. Sprite")
            4 -> println("You have selected:\n4. Dr. Pepper")
            5 -> {
                println("Goodbye for now!")
                return
            }
            else -> println("Invalid entry, try again")
        }
    } while (true)
}