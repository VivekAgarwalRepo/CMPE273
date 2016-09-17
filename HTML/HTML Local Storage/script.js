/**
 * Using HTML5, create a local storage that stores following information regarding your university.
Name,
Year,
Motto,
President. 
 */

var count=1;

function add_to_local(){
	
	if (typeof(Storage) !== "undefined") {
	localStorage.setItem("Name",document.university.uni.value);
	localStorage.setItem("Year",document.university.year.value);
	localStorage.setItem("Motto",document.university.motto.value);
	localStorage.setItem("President",document.university.pres.value);
	count++;
	document.getElementById("msg").innerHTML="Database Updated!"

	}
	
	else{
		document.write("Your browser does not support local storage!");
	}
	
}

function clearData(){
	
	localStorage.clear();
	document.getElementById("msg").innerHTML="Local Storage has been cleared.";
	cnt=0;
	display();
}


function display(){
	document.getElementById("msg").innerHTML="";
	document.getElementById("un").innerHTML="University Name :"+localStorage.getItem("Name");
	document.getElementById("fy").innerHTML="Founding Year:"+localStorage.getItem("Year");
	document.getElementById("mt").innerHTML="Motto :"+localStorage.getItem("Motto");
	document.getElementById("pn").innerHTML="President :"+localStorage.getItem("President");
	
}
