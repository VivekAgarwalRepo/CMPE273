/**
 * John Armani is applying to SJSU for his master's program. Show him a video that gives him a campus tour of the university.
 * Also play an audio that tells him about your experience at San Jose State University and why he should join it.
 */

function vid_play_pause(){
	
	var vid = document.getElementById("vid");
    var button = document.getElementById("pp");
    if (vid.paused) {
       vid.play();
       button.textContent = "pause";
    } else {
       vid.pause();
       button.textContent = "play";
    }
 

}