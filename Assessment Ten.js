//This program converts a String to a spinalCase

function spinalCase(str) {
//change string to title case
    let newStr = str.replace(/([A-Z]|[a-z])([A-Z])/g, ('$1 $2'));
//replace space with '-'
    newStr = newStr.replace(/ /g, '-');
//replace underscores with '-'
    newStr = newStr.replace(/_/g,'-');
//change the result to lowercase
    return newStr.toLowerCase()
}
console.log(spinalCase("This is a Complex_Program"))