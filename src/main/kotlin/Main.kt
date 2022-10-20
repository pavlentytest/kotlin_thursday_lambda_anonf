fun main(args: Array<String>) {

    // анонимная функция без параметров
    val test = fun() = println("123")
    test()

    val test2 = fun(x: Int, y: Int): Int = x * y
    println(test2(5,6)) // 30

    val test3 = fun(x: Int, y: Int) = println("$x $y")
    test3(10,12)

    //  вызовы - анонимная функция как аргумент

    example(10,12,fun(x: Int, y: Int) = println("$x $x $y $y"))
    example2(10,12,fun(x: Int, y: Int) = Math.pow(x.toDouble(),y.toDouble()))

    // возвращение анонимной функции как результата
    var r1 = bigFun(1)
    println(r1(10,20))
}
fun example(a: Int, b: Int, test: (Int, Int) -> Unit) {
    test(50,100)
}
fun example2(a: Int, b: Int, test: (Int, Int) -> Double) {
    println(test(2,3))
}

fun bigFun(k: Int): (Int, Int) -> Int {
    when(k) {
        1 -> return fun(x: Int, y: Int): Int = x+y+x+y
        2 -> return fun(x: Int, y: Int): Int = 2*x*x + 3*y*y
        else -> return fun(x: Int, y:Int) : Int = 1000
    }
}