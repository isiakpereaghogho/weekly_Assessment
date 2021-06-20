//program to print Fizz Buzz

/*number divisible by 3 and 5 will always be divisible by (3*5) equals 15, print 
'FizzBuzz' instead of the number*/
// number divisible by 5, print 'Buzz'instead of the number 	
// number divisible by 3, print 'Fizz' instead of the number

fun main(){
	var program = fizzBuzz()
	println(program)
}

fun fizzBuzz() {
		for (y in 1..100){
		if (y % 15 == 0){
		println("FizzBuzz")
	}	
		else if(y % 5 == 0){
   	println("Buzz")
   }  	
   	else if(y % 3 == 0){
		println("Fizz")
			}
   	else{
   	println (y) }
    } 
   }
   
 
//This program prints the reverse of a string
fun reverseString(str: String): String {
var reverse = ""
    if(str.length == 1) {
        return str
    } else {
        reverse = reverse + str[str.length - 1] + reverseString(str.substring(0, str.length - 1))
        return reverse
    }
}

fun main() {
    var str = "Good Food"
    println("Initial string : "+str)
    println("Reversed string : " + reverseString(str))
}
    

    