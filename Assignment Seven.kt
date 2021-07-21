//this programme gives a random non-negative number, which return the digits of this number within an array in reverse order.

fun reversedNum() {
    var num = 123456789
    var reversed = 0

    while (num != 0) {
        val numbers = num % 10
        reversed = reversed * 10 + numbers
        num /= 10
    }

    println("Reversed  Number: $reversed")
}


fun main() {
    reversedNum()

}
    