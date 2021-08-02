	console.log("TODO BIEN");
var hero = document.querySelector('.contenido-main');
var slider = document.querySelector('.slider');
var links = document.querySelector('.lista-opciones');

var seccion1 = document.querySelector('#seccion1');


if (slider) {

	var tl = new TimelineMax();

	if (screen.width > 1440) {
		tl.fromTo(hero, 1, { height: "0%" }, { height: "100%", ease: Power2.easeInOut })
			.fromTo(hero, 1.2, { width: "100%" }, { width: "95%", ease: Power2.easeInOut })
			.fromTo(slider, 1.2, { x: "0%" }, { x: "100%", ease: Power2.easeInOut }, "-=1.2")
			.fromTo(links, 0.5, { opacity: "0", x: "-60" }, { opacity: "1", x: "0" }, "-=0.5")

	} else {
		tl.fromTo(hero, 1, { height: "0%" }, { height: "100%", ease: Power2.easeInOut })
			.fromTo(hero, 1.2, { width: "100%" }, { width: "95%", ease: Power2.easeInOut })
			.fromTo(slider, 1.2, { x: "0%" }, { x: "100%", ease: Power2.easeInOut }, "-=1.2")
			.fromTo(links, 0.5, { opacity: "0", x: "-60" }, { opacity: "1", x: "0" }, "-=0.5")

	}

}



var liElements = document.querySelectorAll('.lista-opciones li');
var lista = document.querySelector('.lista-opciones');


lista.addEventListener('click', function(e) {
	

	document.querySelector('.actual').classList.remove('actual');

	var itemSelect = e.target;

	for (var i = 0; i < liElements.length; i++) {
		liElements[i].classList.remove('active');
		if (liElements[i].dataset.id == itemSelect.dataset.id) {
			var muestra = document.querySelector(liElements[i].dataset.id);
			muestra.classList.add('actual');
		} else {
			var muestra = document.querySelector(liElements[i].dataset.id);
			muestra.classList.remove('actual');
		}
	}

	itemSelect.classList.add('active');

});

var tituloLogo = document.querySelector('.titulo-contenido');
tituloLogo.addEventListener('click', function() {

	window.location = "principal.jsp";

});

