//import java.io.File
fun main() {
    var favNum = mutableListOf<Int>(7, 8, 9, 10, 11, 14)//create a list of integer with 5 elements
    println(favNum)
    favNum[3] = 12 // update the 3th element to 12
    println(favNum)
    println(favNum.indexOf(12)) //check the exists of 12, it will return the index number for it
    favNum.removeAt(index = 3) // now delete 12 case it's there in index 3
    println(favNum)
    //var numList =File("Data/NumList").readText().split("/n")
    //println(numList)
}
