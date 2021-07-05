
	
// This program will remove the vowels 'a', 'e', 'i', 'o', and 'u' from a string, and return the new string.
fun vowelRemoval(s: String): String {
    val str = StringBuilder()
    for (x in s) {
        if (x != 'A' && x != 'a'
            && x != 'E' && x != 'e'
            && x != 'I' && x != 'i'
            && x != 'O' && x != 'o'
            && x != 'U' && x != 'u') {
            str.append(x)
        }
    }
    return str.toString()
}
 
fun main() {
    println(vowelRemoval("I love Programming"))
}
	
  