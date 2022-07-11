import kotlinx.coroutines.*

fun main() = runBlocking {
    val result = withTimeoutOrNull(1300L) {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
        "Done"
    }
    println("Result is $result") // exception 을 날리지 않고 null 을 출력
}