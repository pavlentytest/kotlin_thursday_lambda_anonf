fun main() {
    // { println() }()
    val yy = fun() = { println("Hello") }
    yy().invoke()

    val zz = { println("123123") }
    zz()

    val zz2: () -> Unit = { println(8888) }
    zz2.invoke()

    val res = { m: String -> println(m)}
    res("HHH") // HHH

    val sum = {x: Int, y: Int -> println(x + y)}
    sum(2,3)
    sum(4,5)

    val sum2 =  {x: Int, y: Int ->
        val result = x + y
        println(result)
    }
    sum2(5,66)

    // Лямбда выражение в качестве параметра
    doOp(3,4,{a: Int, b: Int -> a-b})
    doOp(3,4) { a: Int, b: Int -> a - b }
    doOp(3,4) { a, b -> a - b }

    // Анонимная функция
    doOp(3,4,fun(x: Int, y: Int) = x*x + y*y)


}
fun doOp(x: Int, y: Int, op: (Int, Int) -> Int) {
    val res = op(x,y)
    println(res)
}