fun main(){
   var car1: Car = Car("black", "5000 dollars")
   var car2: Car = Car("red","15000 dollars")
   println (car1.color)
   println (car2.price)
   car1.length ="4.3 meters"
   car1.width = "1.7 meters"
   car1.brand("renault logan")
   car1.firstcar()
   println(car1.dimensions())

}