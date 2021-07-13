//This program will take the number of petal of each flower and return true if they are in love (one even number of petals on one flower and one odd number of petals on the other flower)
// and false if they are not (either odd numbers or even numbers of petals on both flower)
fun loveDetector(flower1: Int, flower2: Int): Boolean{
	if (flower1 % 2==0 && flower2 % 2==1){
		return true
	}
	else if(flower1 % 2==1 && flower2 % 2==0){
		return true
}
   else{
   	return false
   }
}
fun main(){
println(loveDetector(32,19))
}
	