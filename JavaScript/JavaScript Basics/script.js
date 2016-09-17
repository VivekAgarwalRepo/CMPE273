function calculate() {
	
var first=document.myTravelForm.fname.value;
var last=document.myTravelForm.lname.value;

var amt=document.myTravelForm.amt.value;

var discount=0.0;

if(amt<10)
	{
	discount = amt-amt*0.05;
	document.getElementById("result").innerHTML="Hey "+first+" "+last+", your discount price is now "+discount;
	}

else
if(amt>=10 && amt < 50){
	discount = amt - amt*0.1;
	document.getElementById("result").innerHTML="Hey "+first+" "+last+", your discount price is now "+discount;	
}
else
if(amt >=50){
	discount = amt-amt*0.15;
	document.getElementById("result").innerHTML="Hey "+first+" "+last+", your discount price is now "+discount;
}
}