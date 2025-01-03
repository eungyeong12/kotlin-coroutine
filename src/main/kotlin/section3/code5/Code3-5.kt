package sample.section3.code5

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    launch(Dispatchers.Default) {
        launch {
            println("[${Thread.currentThread().name}] 작업1 실행")
        }
        launch {
            println("[${Thread.currentThread().name}] 작업2 실행")
        }
        launch {
            println("[${Thread.currentThread().name}] 작업3 실행")
        }
    }
}