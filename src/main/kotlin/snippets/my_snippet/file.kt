import kotlin.coroutines.CoroutineContext.Element
import kotlin.coroutines.CoroutineContext.Key
//
//
//data class C1(val name: String)
//
//var v: C1 = C1("string")
//    get() = field
//    set(c: C1) {
//        field = c
//    }
//
//interface  IC
//
//class C(): IC{
//    operator fun get(k: Int) = 5
//    fun f() = 1
//
//}
//
//public val ic: IC
//    get() {
//        return IC()//throw NotImplementedError("Implemented as intrinsic")
//    }
//
//fun main(){
//    println(v)
//    val c1 = C1("string1")
//    v = c1
//    println(v)
//}
