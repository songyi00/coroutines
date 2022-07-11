package chapter6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    // 부모 코루틴: runBlocking
    // 자식 코루틴 4개


    // runBlocking을 상속 받아 같은 코루틴 컨텍스트에서 실행됨
    launch {
        println("main runBlocking:" + " I'm working in thread ${Thread.currentThread().name}")
    }

    // main에서 실행됨
    launch(Dispatchers.Unconfined) {
        println("Unconfined:"+" I'm working in thread ${Thread.currentThread().name}")
    }

    // Global Scope 에서 실행한 쓰레드랑 같은 효과
    launch(Dispatchers.Default) {
        println("Default:" + " I'm working in thread ${Thread.currentThread().name}")
    }

    // 코루틴을 실행할 때마다 쓰레드를 만드는 방식
    // 메모리 릭 방지 위해 다음과 같이 코드 작성해줌
    // use를 통해 close도 할 수 있도록
    newSingleThreadContext("MyOwnThread").use {
        launch(it) {
            println("newSingleThreadContext:" + " I'm working in thread ${Thread.currentThread().name}")
        }
    }
}