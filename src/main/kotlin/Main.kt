fun main(args: Array<String>) {
    doTask1()
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