import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() =
    runBlocking {
        //코루틴 #2
        launch {
            repeat(5) { i ->
                println("coroutine A, $i")
                delay(10L)
            }
        }
        //코루틴 #3
        launch {
            repeat(5) { i ->
                println("coroutine B, $i")
                delay(10L)
            }
        }
        //코루틴 #1
        println("Coroutine Outer")
    }

