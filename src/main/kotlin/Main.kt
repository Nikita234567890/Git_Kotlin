fun main(args: Array<String>) {
    doTask1()
    println(doTask2( 5))
}
fun doTask1(){
    val a = readLine()?.toIntOrNull()
    if(a != null)
    {
        if (a!! % 2 == 1)
        {
            println("not even ")
        }
        else
        {
            println("even ")
        }
    }
}
fun doTask2(data: Int): Int{
    if (data < 0)
        return -1

    if (data ==0)
        return 1

    var res = 1
    for (i in 1 .. data)
    {
        res  *= i
    }
    return res
}