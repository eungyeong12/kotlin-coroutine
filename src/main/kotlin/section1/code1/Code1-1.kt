package sample.section1.code1

fun main() {
    // main 함수를 실행하는 스레드 출력
    println("[${Thread.currentThread().name}] 시작")
    Thread.sleep(1000L)
    println("[${Thread.currentThread().name}] 종료")
}