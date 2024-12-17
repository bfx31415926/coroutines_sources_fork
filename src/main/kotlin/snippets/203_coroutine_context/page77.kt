package snippets.page77


import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

fun main() {
    val name: CoroutineName = CoroutineName("A name")
    val element: CoroutineContext.Element = name
    val context: CoroutineContext = element

    val job: Job = Job()
    val jobElement: CoroutineContext.Element = job
    val jobContext: CoroutineContext = jobElement

    var ctx: CoroutineContext = name + job
    ctx += CoroutineName("B name")



    println("ctx = $ctx")
    println("ctx[CoroutineName] = ${ctx[CoroutineName]}, ctx[Job] = ${ctx[Job]}")
}


