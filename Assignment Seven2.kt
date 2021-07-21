//this programme gives a random non-negative number, which return the digits of this number within an array in reverse order.

fun reverseNum(num: Int) {
    var numbers: Int = num
    val array = ArrayList<Int>()
    do {
        array.add(numbers % 10)
        numbers /= 10
    } while (numbers > 0)
    println(array)
}
    

fun main(args: Array<String>) {
    reverseNum(123456789)
    reverseNum(246835791)
}