
import java.io.File //import the file library
fun main() {
    var listOfMax = mutableListOf<Int>(11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21) //(practice1)create of a list of 10 elements
    println(listOfMax)
    // for (index in 0 until listOfMax.size)
    println(listOfMax.maxOf { it }) //like you see up I try to do it in author way (in for, if) but don't work with me so, I search for a replacement and found (The MaxOf) function compares non-null values and returns the highest value.

    var numList = File("Data/NumList").readText().split("/n") //(practice2) create a text file and read it
    println(numList)
}

