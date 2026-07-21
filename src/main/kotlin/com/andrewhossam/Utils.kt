package com.andrewhossam

fun CharArray.swape(first: Int, second: Int) {
    val temp = this[first]
    this[first] = this[second]
    this[second] = temp
}