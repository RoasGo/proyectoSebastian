var divAgregar = document.getElementById('divAgregar');
var addButton = document.getElementById('btnAgregar');
var formAgregar = document.getElementById('formAgregar');

addButton.addEventListener('click', function() {
	console.log('TODO CORRECTO')
	divAgregar.style.display = 'none';
	formAgregar.classList.remove('ocultado');
});