import kotlinx.coroutines.*
//import kotlinx.coroutines.CoroutineName
//import kotlinx.coroutines.runBlocking

suspend fun main(): Unit = withContext(CoroutineName("main")) {
    val name = coroutineContext[CoroutineName]?.name
    println(name) // main
    launch {
        delay(1000)
        val name = coroutineContext[CoroutineName]?.name
        println(name) // main
    }
}
