import kotlinx.coroutines.*
suspend fun main() = coroutineScope{
    println("Введите количество функций")
    var n=readLine()!!.toInt()
    if(n>0)
    {
        println("Введите ширину")
        var weight=readLine()!!.toDouble()
        println("Введите высоту")
        var height=readLine()!!.toDouble()
        var prim:Primougol=Primougol(weight,height)
        launch{
            for(i in 1..n)
            {
                prim.S()
                delay(2000)
            }
        }
        for (i in 1..n)
        {
            println(i)
            prim.P()
            delay(2000)


        }

    }
    else println("не может быть отрицательных значений")
}
