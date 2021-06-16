//Question One: Define 10 if statement
	fun main(args: Array<String>) {
        var num1 = 10
        var num2 =20
        var result = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is smaller than $num2"
        println(result)
	}
	

	fun main(args: Array<String>){
   	if (1>5){
   	println("print 1 is greater than 5")
   	}
   	else{
   	    println("print 1 is lesser than 5")
   		}
	}


	fun main(args: Array<String>) {
    	val num = 10
    	val result = if (num > 0){
        "$num is positive"
    	}else if(num < 0){
        "$num is negative"
    	}else{
        "$num is zero"
    	}
    	println(result)
	}


    	fun main(args: Array<String>) {
    	val numbers = intArrayOf(1, 4, 42, -3)
    	if (4 in numbers) {
        println("numbers array contains 4.")
    	}
	}


	fun main(args: Array<String>){
   	if (1>10){
   	println("print 1 is greater than 10")
   	}
   	else{
   	   println("print 1 is lesser than 10")
   	}


	fun main(args: Array<String>) {
    	val numbers = intArrayOf(-1, 2, 10, 5)
    	if (5 in numbers) {
        println("numbers array contains 4.")
    	}


	fun main(args: Array<String>) {
   	val num = -3
    	val result = if (num > 0){
        "$num is positive"
   	 }else if(num < 0){
        "$num is negative"
    	}else{
        "$num is zero"
    	}
    	println(result)
	}


 	fun main(args: Array<String>) {
        var num1 = 2
        var num2 =15
        var result = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is smaller than $num2"
        println(result)
 	}


	fun main(args: Array<String>){
   	if (4< 12){
   	println("print 4 is greater than 12")
   	}
   	else{
   	println("print 4 is lesser than 12")
   		}
	

	fun main(args: Array<String>) {
    	val numbers = intArrayOf(10, 9, 8, 7)
    	if (8 in numbers) {
        println("numbers array contains 8.")
    	}


	//DEFINE FIVE CONDITIONAL EXPRESSIONS USING THE WHEN STATEMENT
	fun main(args: Array<String>){
    	var number = 8
    	var numberProvided = when(number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "invalid number"
    	}
    	println("You provided $numberProvided")
	}


	fun main(args: Array<String>){
    	var day = 1
    	when(day) {
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    	}


	fun main( ){
    	when(4) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    	}
	}


	fun main(){
    	var month = 2
    	when(month) {
        3, 4, 5, 6 ->
            println("It is summer season")
        7, 8, 9 ->
            println("It is rainy season")
        10, 11 ->
            println("It is autumn season")
        12, 1, 2 ->
            println("It is winter season")
        else -> println("invalid input")
    	}
	}


	fun main(args: Array<String>){
    	var num = 4
   	when(num) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("invalid number")
    	}
	}

	
	//QUESTION TWO. DEFINE A LOOP THAT WILL PRINT 1- 100. ANOTHER LOOP THAT WILL PRINTOUT 1-10 WITHOUT PRINTING NUMBERS 4 AND 5
	fun main() {
	for (a in 1 .. 100){
		print(a)
	}
	println()
   	for (x in 1 .. 10){
   	if ( x == 4){
   		continue
   	}
   	if ( x == 5){
   		continue
   	}
   	print(x)
   	}
	}


	//QUESTION THREE. THIS PROGRAM WILL PRINTOUT ONLY THE EVEN NUMBERS BETWEEN 10 AND 20, ODD NUMBERS BETWEEN 20 AND 30 
	fun main() {
	for (b in 10 .. 20){
	if(b % 2 == 0){
	print (" " +b)
	}
	}
	println()
   	for (y in 20 .. 30){
   	if(y % 2 == 1){
   		print (" " +y)
   	}
   	}
	}

//QUESTION FOUR: DEFINE 5 CLASSES. THESE CLASSES CONTAINS 5 INSTANCE VARIABLES AND ONE CONSTRUCTOR
	class Account() {
	private var acc_no: Int = 0
	private var name: String = " "
	private var amount: Float = 0f
	private var atm_pin: Int = 0
	private var phoneNumber: Int = 0

	constructor(acc_no: Int, name: String, amount: Float, atm_pin: Int, phoneNumber: Int):(){
	this.acc_no = acc_no
	this.name = name
   	this.amount = amount
   	this.atm_pin = atm_pin
   	this.phoneNumber = phoneNumber
	}
    	fun getAcc_No():Int {
       return this.acc_No
    	}
    
     	fun getName():String {
       return this.name
    	}
   
       fun getAmount():Float {
       return this.amount
     	}
      
       fun getAtm_pin():Int {
       return this.atmPin
    	}

       fun getPhoneNumber():Int {
       return this.phoneNumber
    	}
	}

	
	class StudentPortal(){
	private var name: String = " "
	private var sex: String = " "
	private var level: Int = 0
	private var matric_no: Double = 0.0
	private var department: String = " "

	constructor(name: String, sex: String, level: Int , matricNo: Double, department: String):this(){
	this.name = name
	this.sex = sex
   	this.level = level
   	this.matric_no = matric_no
   	this.department = department
	}

    	fun getName():String{
       	return this.name
        }

   	fun getSex():String{
       	return this.sex    
    	}

    	fun getLevel():Int{
       	return this.level   
     	}

    	fun getMatric_No():Double{
       	return this.matric_No
    	}

    	fun getDepartment():String {
       	return this.department
    	}
	}


 	class Person(){
	private var name: String = " "
	private var sex: String = " "
	private var age: Int = 0
	private var phoneNumber: Double = 0.0
	private var skinColor: String = " "

	constructor(name: String, sex: String, age: Int , phoneNumber: Double, skinColor: String):this(){
	this.name = name
	this.sex = sex
   	this.age = age
   	this.phoneNumber= phoneNumber
   	this.skinColour = skinColour
	}

    	fun getName():String{
       return this.name
    	}
    	fun getSex():String{
      	return this.sex
    	}
    	fun getAge():Int{
        return this.age
     	}
    	fun getPhoneNumber():Double{
    	return this.phoneNumber
    	}
    	fun getSkinColor():String{
    	return this.skinColor
    	}
	}


	class Staff_Profile(){
	private var name: String = " "
	private var sex: String = " "
	private var gradeLevel: Int = 0
	private var phoneNumber: Double = 0.0
	private var department: String = " "

	constructor(name: String, sex: String, gradeLevel: Int , phoneNumber: Double, department: String):this(){
	this.name = name
	this.sex = sex
   	this.gradeLevel = gradeLevel
   	this.phoneNumber= phoneNumber
   	this.department = department
	}
    	fun getName():String{
       	return this.name
    	}
    	fun getSex():String{
      	return this.sex
    	}
    	fun getGradeLevel():Int{
        return this.gradeLevel
     	}
    	fun getPhoneNumber():Double{
    	return this.phoneNumber
    	}
    	fun getDepartment():String{
    	return this.department
    	}
	}

class Animal(){
private var name: String = " "
private var sex: String = " "
private var species: String = " "
private var age: Int = 0
private var typeOfFood: String = " "

constructor(name: String, sex: String, species: String, age: Int, typeOfFood: String):this(){
	this.name = name
	this.sex = sex
   this.species = species
   this.age= age
   this.typeOfFood = typeOfFood
}
    fun getName():String{
       return this.name
    }
    fun getSex(): String{
      return this.sex
    }
    fun getSpecies(): String{
        return this.species
     }
    fun getAge():Int{
    	return this.age
    	}
    fun getTypeOfFood(): String{
    	return this.typeOfFood
    }
}

//QUESTIONS FIVE:ASSIGN VALUES TO THE CLASSES AND PRINT OUT THE VALUES IN THE MAIN FUNCTION
	
	fun main (){
     	var acc: Account = Account(acc_no = 0123456789, name = "Aghogho", amount = 5000, atm_pin = 1234, phoneNumber = 08123456789)
    	println(acc.getAcc_no())
	println(acc.getName())
	println(acc.getAmount())
	println(acc.getAtm_pin())
	println(acc.getPhoneNumber())
	}
	
	fun main (){
	var student : StudentPortal = StudentPortal(name = "Aghogho", age = 29, level = 500, matric_no = 0901122, department = "mobile development")
	println(student.getName())
	println(student.getAge())
	println(student.getLevel())
	println(student.getMatric_no())
	println(student.getDevelopment())
	}
	
	fun main ()
	var aPerson : Person = Person(name = "Joy", sex = "Female", age = 20 , phoneNumber = 08123456789, skinColor= "Brown")
	println(aPerson.getName())
	println(aPerson.getSex())
	println(aPerson.getAge())
	println(aPerson.getPhoneNumber())
	println(aPerson.getSkinColour())
	}

	fun main (){
	var staff : StaffProfile = StaffProfile(name = John, sex = Male, gradeLevel = 08 , phoneNumber = 08123456789, department = "Account")
	println(staff.getName())
	println(staff.getSex())
	println(staff.getGradeLevel())
	println(staff.getPhoneNumber())
	println(staff.getDepartment())
	}

fun main (){
	var theAnimal : Animal = Animal(name= "Dog", sex = "Male", species = "Domestic", age = 2, typeOfFood = "Bone")
	println(theAnimal.getName())
	println(theAnimal.getSex())
	println(theAnimal.getSpecies())
	println(theAnimal.getAge())
	println(theAnimal.getTypeOfFood())
	}
	
	
	//QUESTION SIX: CREATE 2 REPOSITORIES WITH 3 FILES IN EACH OF THEM
  
	/*$ cd- Document
	$ mkdir repositories1
	$ cd repositories1
	$ mkdir my_project
	$ mkdir	aghogho_project
	$ mkdir sophia_project
	$ cd my_project
	$ git init
	$ touch first.kt
	$ git status
	$ git add
	$ git commit-a-m "New commit"
	$ git remote add my_project https://github.com/isiakpereaghogho/my_project.git
	$ git push--set-upstream my_project master
	aghososafe@yahoo.com



	
	$ cd aghogho_project
	$ git init
	$ git add
	$ git commit-a-m "New commit"
	$ git remote add aghogho_project https://github.com/isiakpereaghogho/aghogho_project.git
	$ git push--set-upstream aghogho_project master
	aghososafe@yahoo.com

	$ cd sophia_project
	$ git init
	$ git add
	$ git commit-a-m "New commit"
	$ git remote add sophia_project https://github.com/isiakpereaghogho/sophia_project.git
	$ git push--set-upstream sophia_project master
	aghososafe@yahoo.com

	$ mkdir repositories2
	$ cd repositories2
	$ mkdir project1
	$ mkdir	project2
	$ mkdir project3
	$ cd project1
	$ git init
	$ git add
	$ git commit-a-m "New commit"
	$ git remote add project1 https://github.com/isiakpereaghogho/project1.git
	$ git push--set-upstream project1 master
	aghososafe@yahoo.com
	$ cd..

	
	$ cd project2
	$ git init
	$ git add
	$ git commit-a-m "New commit"
	$ git remote add project2 https://github.com/isiakpereaghogho/project2.git
	$ git push--set-upstream project2 master
	aghososafe@yahoo.com

	$ cd project3
	$ git init
	$ git add
	$ git commit-a-m "New commit"
	$ git remote add project3 https://github.com/isiakpereaghogho/project3.git
	$ git push--set-upstream project3 master
	aghososafe@yahoo.com */
