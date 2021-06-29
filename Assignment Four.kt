//This program returns true if the three values are evenly spaced or false if they are not
 fun evenlySpaced(){
 	var a = 2
 	var b = 4
 	var c = 6
 	var result : Boolean
        result = true
 	 if ((b - a) == (c - b)){
  	println(result)
  	}
  	else{
  		result = false
  		println(result)
  	}
 }
 fun main (){
 	var bool = evenlySpaced()
 	println(bool)
 }

 


    