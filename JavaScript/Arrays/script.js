/**
 * JS to create an array of your courses for MSSE and display them using an array.
 */

function add_to_array()
{
	var c1=document.getElementById("c1").value;
	var c2=document.getElementById("c2").value;
	var c3=document.getElementById("c3").value;
	
	var array=[c1,c2,c3];
	
	
	document.getElementById("div1").innerHTML="The three courses you have enrolled are : "+array[0]+" ; "+array[1]+" ; "+array[2];
}