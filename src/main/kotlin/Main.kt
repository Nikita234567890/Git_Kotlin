fun main(args: Array<String>) {
    //check if even
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