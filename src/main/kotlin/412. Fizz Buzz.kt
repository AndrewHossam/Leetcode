fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()
    for (i in 1..n) {
        if (i % 5 == 0 && i % 3 == 0) {
            list.add("FizzBuzz")
        } else if (i % 3 == 0) {
            list.add("Fizz")
        } else if (i % 5 == 0) {
            list.add("Buzz")
        } else {
            list.add("$i")
        }
    }
    return list
}

fun fizzBuzz2(n: Int): List<String> {
    val list = mutableListOf<String>()
    for (i in 1..n) {
        var acc = ""
        if (i % 3 == 0) {
            acc += "Fizz"
        }
        if (i % 5 == 0) {
            acc += "Buzz"
        }
        if (acc.isEmpty()) {
            acc = "$i"
        }
        list.add(acc)
    }
    return list
}

fun main() {
    println(
        fizzBuzz2(15).toString()
    )
}
