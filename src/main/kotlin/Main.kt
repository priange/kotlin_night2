fun main(args: Array<String>) {
    details("Anabo",44,"Uganda")

println( length("Omara Emmanuel Etuk"))

takeIn("Ityaku")
}


//1. Write a function that takes in 3 parameters, name, age, and country, and
// returns a String with this structure “Hi, my name is x, I am y years old and
// I am from z.” Where x, y, and z are the provided name, age, and country respectively. (3 points)
fun details(name:String,age:Int,country:String){
   println( "Hi, my name is $name,I am $age years old and I am from $country.")
}


//2. Write a function that takes in a String and returns its length (2 points)
fun length(name: String):Int{
    return name.length
}


//3. Write a function that takes in a name and prints out “That’s me!” when your name is
// passed to it, otherwise, it prints out “I don’t know who that is” (3 points)
fun takeIn(name:String) {
    var String="Ityaku"

//    for (i in name) {
        if (name.equals(String)) {
            println("That's me!")
        } else {
            println("I don't know who that is")
        }

    }
//}


//4. Write a Kotlin function that takes in a string will all the vowels replaces by the
// character ‘*’. Use string interpolation to generate the output. (2 points)
fun vowelsGenerated(name:String){
var string1="Today is a sunny day"
    println(string1)
    for(i in string1){
        println("The boy weights")

    }
    println("The boy weights")

}


