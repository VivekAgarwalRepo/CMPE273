/**
 * Bear Grills like to go mountain trekking all by himself as an adventure. He also carries a map of the area in case he is lost. However, he needs his current co-ordinates to figure out an exit path on the map he is carrying. Using HTML5 Geolocation API display his current location coordinates so that he can reach home safely.
 */
function get_location(){
	
		if(navigator.geolocation){
			navigator.geolocation.getCurrentPosition(display,Error);
		}
		else{
			document.write("Geolocation is not supported in this browser!");
		}
}

function display(pos){
		var coordinates=pos.coords.latitude+","+pos.coords.longitude;
		
		
		var url="http://maps.googleapis.com/maps/api/staticmap?center="
		    +coordinates+"&zoom=14&size=500x400&sensor=false";//change Zoom
		
		document.getElementById("location").innerHTML="You co-ordinates are - longitude :"+pos.coords.longitude+" latitude :"+pos.coords.latitude;
		document.getElementById("map").innerHTML = "<img src='"+url+"'>";
}

function Error(err) {
    switch(err.code) {
        case err.PERMISSION_DENIED:
        	document.getElementById("start").innerHTML = "You have been denied the request for Geolocation."
            break;
        case err.POSITION_UNAVAILABLE:
        	document.getElementById("start").innerHTML = "Location information is currently unavailable."
            break;
        case err.TIMEOUT:
        	document.getElementById("start").innerHTML = "Request timed out."
            break;
        case err.UNKNOWN_ERROR:
        	document.getElementById("start").innerHTML = "An unknown error occurred."
            break;
    }
}
