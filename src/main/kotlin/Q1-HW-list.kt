fun main() {
    var favCity= mutableListOf<String>("Riyadh","Dammam","Jeddah") //create a list of 3 elements
    println(favCity)
    favCity.addAll(3, listOf("Abha", "Tabuk"))// Add 2 elements to favCity list
    println(favCity)
    favCity[4]="TABUK" //update the last element which is Tabuk(edited with upper letter)
    println(favCity)
    for ( index in 0 until favCity.size ){ //this line will print all list with index number
        println("$index - ${favCity[index]}")
    }
}
