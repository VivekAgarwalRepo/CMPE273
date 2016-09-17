/**
 * 
 */


function conversion(){
	var op=document.getElementById("options").value;
	var entry=document.getElementById("entry").value;
	
	if(op=="String to Integer"){
		var ans=parseInt(entry);
		if(isNaN(ans)){
			document.getElementById("div").innerHTML="This string does not consist of any numerals. Please check your entry."
		}
		else
		document.getElementById("div").innerHTML="After converting to integer : "+parseInt(entry);
		
	}
	
	if(op=="Display Date"){
		
		document.getElementById("div").innerHTML="After converting Date to String : "+String(Date());
		
	}

	if(op=="Integer to String"){
	
	document.getElementById("div").innerHTML=("After converting to String : "+entry.toString());
	
	}
	
	if(op=="Decimal to Integer"){
		var ans=parseInt(entry);
		if(isNaN(ans)){
			document.getElementById("div").innerHTML="This entry is not numeral value. Please check your entry."
		}
		else
		document.getElementById("div").innerHTML=("After converting to integer : "+parseInt(entry));
		
		}
}