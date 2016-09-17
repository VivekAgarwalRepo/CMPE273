/**
 * 
 */

function Display(){
	var d=document.converter.inches.value;
	var f=d*0.0833
	document.getElementById("div").innerHTML="The feet equivalent is :"+f+" feet";
	
}