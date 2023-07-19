fun main() {
    isPalindrome(121).print()
}

    fun isPalindrome(x: Int): Boolean {
        val input = x.toString()
        for (i in 0 until input.length / 2) {
            if (input[i] != input[input.lastIndex - i])
                return false
        }
        return true
}
