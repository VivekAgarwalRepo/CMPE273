/**
 * Write a script asking the user to enter a sentence without any spaces between the words. Accept a second string from the user
 * and find the number of occurances. Also replace the second string with another string if ouccurances are >= 1.
 *
 */


function search(){
	
	
	var myArray = document.getElementById("str1").value.match(/\S+/g).length;

	document.getElementById("div").innerHTML="The Total number of words in this sentence is :"+myArray;
}