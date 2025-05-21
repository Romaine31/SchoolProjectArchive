var character = document.getElementById("character");
var obstacle = document.getElementById("obstacle");

function jump(){
    if(character.classList != "animate"){
        character.classList.add("animate");
    }
    
    setTimeout(function(){
        character.classList.remove("animate");
    },500);
}



var Hit = setInterval(function(){
let chitB = character.getBoundingClientRect()
let ohitB = obstacle.getBoundingClientRect()
	if (chitB.left >= ohitB.right || ohitB.left >= chitB.right){
}
	else if (ohitB.bottom <= chitB.top || chitB.bottom <= ohitB.top){
}

else{
alert('you died');
}
}, 10);

