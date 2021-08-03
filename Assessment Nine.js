
// This program gives the differences between two arrays:
var firstCourses = ["Chemistry", "Agric", "English", "Physics", "Maths" ];
var secondCourses = [ "Physics", "Chemistry", "Maths" ];
 
var b = new Set(secondCourses);
var diffArray = [...firstCourses].filter(x => !b.has(x));

console.log(diffArray);
