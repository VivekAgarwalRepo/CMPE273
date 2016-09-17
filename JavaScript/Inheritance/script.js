/**
 * A person inherits their surname from their father. Users are required to submit their father's surname and their first name. Using inheritance
 * we can output the complete name of the user. 
 */

var Parent=function(father)
{
	this.surname=father;	
	this.lands=10;
	this.loan=20000;
	this.familyIncome=100000;
	this.share=20000;
}


Parent.prototype.getSurName=function(){
	return this.surname;
}

Parent.prototype.getLand=function(){
	return this.lands;
}

Parent.prototype.getLoan=function(){
	return this.loan;
}

Parent.prototype.getIncome=function(){
	return this.familyIncome;
}

Parent.prototype.getShare=function(){
	return this.share;
}
  
var child=function(fname)
{
	this.firstname=fname;
}

function Assign(){
	var c=new child(document.Inheritance.child.value);
	var p=new Parent(document.Inheritance.father.value);
	child.prototype=p;
	

	document.getElementById("name").innerHTML=("Your complete name is " +c.firstname+" "+c.getSurName());
	document.getElementById("land").innerHTML=("You have inherited "+c.getLand()+" pieces of land");
	document.getElementById("loan").innerHTML=("Your have inherited " +c.getLoan()+"$ worth of loan from your father");
	document.getElementById("income").innerHTML=("You have inherited "+c.getIncome()+"$ from your father");document.getElementById("name").innerHTML=("Your complete name is " +c.firstname+" "+c.getSurName());
	document.getElementById("shares").innerHTML=("You have inherited "+c.getShare()+"$ worth of share from your father");
	
	
	
}