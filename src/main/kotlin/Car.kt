open class Car ( color: String){
    var length: String = "Undefined"
    var width: String = "Undefined"
    var color: String = "green"
    var price: Any = "10000 dollars"

    init{
        this.color = color
    }
    constructor(color: String, price: Any): this(color){
        this.price = price
    }

    fun firstcar(){
        println("My first car will be $color and cost $price ")
    }
    fun brand(brand: String){
        println ("$brand is good for first car")
    }
    fun dimensions() :String {
        return "Length: $length  Width: $width"
    }
}