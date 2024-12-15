
fun main() {
    var computerChoice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissors? Enter your choice!")
    playerChoice = readln()

    val randomNumber = (1..3).random()

    // Assign computerChoice based on randomNumber
    when (randomNumber) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }

    println(computerChoice) // Move this outside the when block to make it reachable

    // Determine the winner (currently incomplete)
    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    // Print the result (add this to make sense of winner variable)
    if(winner == "Tie"){
        println("It's a tie")
    }else if(winner == "Player") {
        println("Player won!")
    }else {
       println("$winner won!")
    }

}
