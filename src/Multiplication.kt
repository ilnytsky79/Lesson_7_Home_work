class Multiplication <T>(private val t: T){

    fun result (function: () -> Int) {
        print(t)
        println(function.invoke())
    }
}


