package sample.section3.code6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val imageProcessingDispatcher = Dispatchers.Default.limitedParallelism(2)
    repeat(100) {
        launch(imageProcessingDispatcher) {
            Thread.sleep(1000L) // 이미지 처리 작업
            println("[${Thread.currentThread().name}] 이미지 처리 완료")
        }
    }
}