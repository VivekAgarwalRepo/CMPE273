/**
 * 
 */

var database={"UserInfo":[{"Name":"vivek","Age":21,"University":"SJSU","Major":"SE"}]};
var count=1;

function add_to_database(){
	
var n=document.getElementById("name").value;	
var age=document.getElementById("age").value;
var U=document.getElementById("university").value;
var major=document.getElementById("major").value;

//document.write("BreakPoint");

database.UserInfo[count]={"Name":n,"Age":age,"University":U,"Major":"CMPE"};

count++;

document.getElementById("div").innerHTML="<br><br>The student info has been added to the database!";
}

function display(){
	"use strict";

	try{
	document.getElementById("div").innerHTML="<br><br>The current database is as follows -- <br><br>";
		
	for(var i=0;i<count;i++)
	{
	var newdiv=document.createElement('div');
	newdiv.setAttribute("id","div"+i);
	newdiv.innerHTML="Name :"+database.UserInfo[i].Name+"&nbsp;&nbsp;&nbsp;&nbsp;"+"Age :"+database.UserInfo[i].Age+"&nbsp;&nbsp;&nbsp;&nbsp;"+"University :"+database.UserInfo[i].University+"&nbsp;&nbsp;&nbsp;&nbsp;"+"Major :"+database.UserInfo[i].Major+"</div><br><br>";
	document.getElementById("div").appendChild(newdiv);
	}
	}

	catch(err){
		document.write(err);
	}
}
/*
for(var i=0;i<3;i++)
{
if(db.Users[i].Name=="Agarwal")
delete db.Users[i];
}
*/