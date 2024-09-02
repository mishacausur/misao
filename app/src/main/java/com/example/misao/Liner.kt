package com.example.misao

class Liner {

    fun main() {
        val name = "Name"
        println(name)
    }

    fun check(number: Int?) : String {
        val _number = number ?: 0
        val result: String
        when (_number) {
            1 -> result = "FIRST"
            2 -> result = "SECOND"
            3 -> result = "THIRD"
            else -> result = "NONE"
        }

        return  result
    }

    fun format() : Int {
        var result = 0
        for (i in 1..10) {
            result += i
        }
        return result
    }
}