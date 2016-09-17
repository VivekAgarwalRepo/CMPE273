/**
 * 
 */

function get_location(){
		if(navigator.geolocation){
			navigator.geolocation.getCurrentPosition(showPosition,showError);
		}
		else{
			document.write("Geolocation is not supported in this browser!");
		}
		
}

function display(pos){
		var coord=pos.coords.latitude+","+position.coords.longitude;
		
		var url="http://maps.googleapis.com/maps/api/staticmap?center="
		    +coord+"&zoom=14&size=500x400&sensor=false";//change Zoom
		
		document.getElementById("map").innerHTML = "<img src='"+url+"'>";
}

