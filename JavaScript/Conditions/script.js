/**
 * Low Cost Pay per miles scheme for travel.
 */

function calculate(){
	
	var miles=document.TravelOptions.miles.value;
	var total=document.TravelOptions.total.value;
	var means=document.TravelOptions.Travel.value;
	
	if(means=="Highway"){
		var price=miles*total*0.5;
		document.getElementById("price").innerHTML="The total pay-per-mile cost for your travel is :"+price+"$";
	}
	else
	if(means=="Flight"){
		var price=miles*total*3;
		document.getElementById("price").innerHTML="The total pay-per-mile cost for your travel is :"+price+"$";

	}
	else
	if(means=="Sea"){
		var price=miles*total*2;
		document.getElementById("price").innerHTML="The total pay-per-mile cost for your travel is :"+price+"$";

			}
}