package com.shorya.rockpaperandscisssor

fun main(){
    var stopGame = 1
    while(stopGame==1){
        var computerChoice = ""
        println("Rock Paper and Scissors? Enter")
        val playerChoice=readln().lowercase()
        val randomNumber = (1..3).random()
        when (randomNumber){
            1 -> {
                computerChoice = "rock"
            }
            2 -> {
                computerChoice = "paper"
            }
            3 -> {
                computerChoice = "scissor"
            }
        }
        println(computerChoice)
        val winner = when{
            playerChoice == computerChoice -> "Tie"
            playerChoice == "rock" && computerChoice == "scissor" -> "Player"
            playerChoice == "paper" && computerChoice == "rock" -> "Player"
            playerChoice == "scissor" && computerChoice == "paper" -> "Player"
            playerChoice == "scissor" && computerChoice == "rock" -> "Computer"
            playerChoice == "rock" && computerChoice == "paper" -> "Computer"
            playerChoice == "paper" && computerChoice == "scissor" -> "Computer"
            else
                -> "Invalid Input"
        }
        if(winner == "Tie"){
            println("Match Tie")
        }else{
            println("~~|$winner wins|~~")
        }
        println("PRESS 1 to Continue..")
        println("PRESS 0 to Exit Game")
        stopGame=readln().toInt()
    }
}
