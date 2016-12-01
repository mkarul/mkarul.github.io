$(function(){
	
	$("#icerik_2").hide(0); 
	$("#icerik_3").hide(0); 
	$("#icerik_4").hide(0);

$("#muzik").click(function(){ 
	$("#icerik_1").slideDown(1000);
	$("#icerik_2").hide(1000); 
	$("#icerik_3").hide(1000); 
	$("#icerik_4").hide(1000); 	
});
$("#galeri").click(function(){
	$("#icerik_1").hide(1000);
	$("#icerik_4").hide(1000);  
	$("#icerik_2").slideDown(1000);
	$("#icerik_3").hide(1000); 
});
$("#organize").click(function(){
	$("#icerik_4").hide(1000); 
	$("#icerik_3").slideDown(1000);
	$("#icerik_1").hide(1000); 
	$("#icerik_2").hide(1000); 

	
	
	
});
   $("#hakk").click(function(){
	$("#icerik_1").hide(1000); 
	$("#icerik_2").hide(1000); 
	$("#icerik_3").hide(1000);
	$("#icerik_4").slideDown(1000);	
});

$(document).scroll(function(){
    var y=$(document).scrollTop(),
	header=$(".icerik_baslik");
	menn=$("");
	if (y >= 550) {
header.addClass('baslik_sabitleme');
menn.addClass('baslik_sabitleme2');
} else {
header.removeClass('baslik_sabitleme');
menn.removeClass('baslik_sabitleme2');
}
});

});
$(document).ready(kaydir);
function kaydir()
{
$.scrollTo('.icerik',800, {duration:1000} );
}