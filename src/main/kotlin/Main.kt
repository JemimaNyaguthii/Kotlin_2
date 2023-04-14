fun main() {
    println(names("Kenya","Rwanda","Tanzania").contentToString())
    countries()
    pets()
    numeric()
    people("Jem","Essy","Emily","lynn")

}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun names(name1:String,name2:String,name3:String):Array<String>{
    var countryNames= arrayOf(name1,name2,name3)
    return countryNames
}
//Create a function that given an array below:
//var countries = arrayOf(“kenya”, “rwanda”, “tanzania”, “uganda”)
//prints out the names of the cities in the correct grammatical case.

//(.capitalize) capitalizes the title case of the strings.To make the strings to be small letters we
//(.decapitalize).To make all letters capitale we use the concept .toUpperCase,to make all the letters
//of the element small we use .toLowerCase

fun countries() {
    var countries = arrayOf("kenya", "uganda", "tanzania", "rwanda")
    countries.forEach { country -> println(country.capitalize()) }
}
fun pets(){
    var pets=arrayOf("Cat","Dog","Parrot")
    pets.forEach { pet -> println(pet.decapitalize ())}
}

//Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//prints out the sum of the second and fifth elements (1 point)
//prints out the index of 158 (1 point)
//prints out the elements in ascending order
fun numeric(){
    var numbers= arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//    each item in an array is called an element.
    var addition=numbers[1]+numbers[4]
    println(addition)
//    We get an element at an idex using (.get)
    println(numbers.get(11))
//    we use contenttostring to return a string representation of the array in form of a list
    println(numbers.sortedArray().contentToString())
}
//Create a function that takes in 4 strings and creates an array out of them then
//prints out the array

fun people(person1:String,person2: String,person3: String,person4:String){
    var names= arrayOf(person1,person2,person3,person4)
    println(names.contentToString())
}


