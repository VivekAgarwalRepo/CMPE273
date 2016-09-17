/**
 * Javascript can often silently ignore errors which makes debugging difficut for programmers. Using strict-mode demonstrate how errors
 * can be displayed in Javascript.
 */

stray="This is an invalid string stored in an un declared variable"
	

function test(){
	"use strict";
	
	stray="This string will definitely give you an error!";
	document.write(stray);
}

test();