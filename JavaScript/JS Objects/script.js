/**
 * VTA is a transportation authority that provides, bus, train and car access to the public. Create objects and functions for each means of
 * transport which contains its properties. Using conditional statements check which type of service is being asked for by the user and display its 
 * characteristics such as its size, availability, wheels, capacity and cost of travel.
 */

function bus(){
	this.wheels=4;
	this.size="medium";
	this.availability="frequent";
	this.capacity=50;
	this.cost="2$"
}

function train(){
	this.wheels=16;
	this.size="large";
	this.availability="very frequent";
	this.capacity=200;
	this.cost="1.5$"
	
}

function car(){
	this.wheels=4;
	this.size="small";
	this.availability="less frequent";
	this.capacity=5;
	this.cost="4$"
	
}

function vta(){
	//console.log("In this function!");
	console.log(document.VTAForm.destination.value);
	
	if(document.VTAForm.destination.value=="Bus"){
		VTAbus=new bus();
		document.getElementById("wheels").innerHTML="<div> Wheels: "+VTAbus.wheels+" </div>";
		document.getElementById("size").innerHTML="<div> Size: "+VTAbus.size+" </div>";
		document.getElementById("availability").innerHTML="<div> Availability: "+VTAbus.availability+" </div>";
		document.getElementById("capacity").innerHTML="<div> Capacity: "+VTAbus.capacity+" </div>";
		document.getElementById("cost").innerHTML="<div> Cost: "+VTAbus.cost+" </div>";
	}
	else
		if(document.VTAForm.destination.value=="Train"){
			VTAtrain=new train();
			console.log("Inside");
			document.getElementById("wheels").innerHTML="<div> Wheels: "+VTAtrain.wheels+" </div>";
			document.getElementById("size").innerHTML="<div> Size: "+VTAtrain.size+" </div>";
			document.getElementById("availability").innerHTML="<div> Availability: "+VTAtrain.availability+" </div>";
			document.getElementById("capacity").innerHTML="<div> Capacity: "+VTAtrain.capacity+" </div>";
			document.getElementById("cost").innerHTML="<div> Cost: "+VTAtrain.cost+" </div>";
		}
		else
			if(document.VTAForm.destination.value=="Car"){
				VTAcar=new car();
				document.getElementById("wheels").innerHTML="<div> Wheels: "+VTAcar.wheels+" </div>";
				document.getElementById("size").innerHTML="<div> Size: "+VTAcar.size+" </div>";
				document.getElementById("availability").innerHTML="<div> Availability: "+VTAcar.availability+" </div>";
				document.getElementById("capacity").innerHTML="<div> Capacity: "+VTAcar.capacity+" </div>";
				document.getElementById("cost").innerHTML="<div> Cost: "+VTAcar.cost+" </div>";
			}
	
	
}