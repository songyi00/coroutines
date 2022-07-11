//package chapter5
//
//import kotlin.coroutines.Continuation
//import kotlin.coroutines.CoroutineContext
//import kotlin.coroutines.EmptyCoroutineContext
//
//class MyContinuation(override val context: CoroutineContext = EmptyCoroutineContext)
//    : Continuation<String> {
//        val label = 0
//        val result = ""
//    override fun resumeWith(result: Result<String>) {
//        this.result = result.getOrThrow()
//        println("Continuation.resume ")
//        }
//    }
//fun main() {
//    println("[in] main")
//    myCoroutine(MyContinuation())
//    println("\n[out] main")
//
//    fun myCoroutine(cont : MyContinuation()){
//        when(cont)
//    }
//}