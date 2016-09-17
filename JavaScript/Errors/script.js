/**
 * Write a javascript that divides two numbers after validating the entries. In case any error is detected, the respective error is displayed
 */

function Display() {
    var msg, val;
    msg = document.getElementById("ans");
    msg.innerHTML = "";
    val1 = document.getElementById("num1").value;
    val2 = document.getElementById("num2").value;
    var res = checkforError(val1,val2,msg);
 
    if(res==false){
    	msg.innerHTML=Number(x)/Number(y);
    }
}

function checkforError(x,y,message){
	try { 
        if(x == "" || y=="") throw "Empty text feild detected";
        if(isNaN(x) || isNaN(y)) throw "Text feild not a number detected";
        y = Number(y);
        if(y==0) throw "Divide by Zero error";
    }
    catch(err) {
        message.innerHTML = "Error encountered as : " + err;
        return true;
    }
    
    return false;
}