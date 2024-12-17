package f_203_coroutine_context.my_1

//import kotlin.coroutines.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

fun main() {
    val name: CoroutineName = CoroutineName("A name")
    val element: CoroutineContext.Element = name
    val context: CoroutineContext = element

    val job: Job = Job()
    val jobElement: CoroutineContext.Element = job
    val jobContext: CoroutineContext = jobElement

    val ctx: CoroutineContext = name + job

//my
    val mySupervisorJob = SupervisorJob(job)
    val jobElement1: CoroutineContext.Element = mySupervisorJob
    val jobContext1: CoroutineContext = jobElement1
    println(jobContext1)

}
