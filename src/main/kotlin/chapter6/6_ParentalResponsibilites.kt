package chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val request = launch {
        repeat(3) { i ->
            launch {
                delay((i+1)*200L)
                println("Coroutine $i is done")
            }
        }
        println("request : I'm done and I don't explicitly join my children that are still active")
    }
    request.join()
    println("Now processing of the request is complete")
}