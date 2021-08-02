var signUpButton = document.getElementById('signUp');
var signInButton = document.getElementById('signIn');
var container = document.getElementById('container');

var divAgregar = document.getElementById('divAgregar');
var addButton = document.getElementById('btnAgregar');
var formAgregar = document.getElementById('formAgregar');

signUpButton.addEventListener("click", function() {
    container.classList.add("right-panel-active");
});

signInButton.addEventListener("click", function() {
    container.classList.remove("right-panel-active");
});

addButton.addEventListener('click', function() {
	console.log('TODO CORRECTO')
	divAgregar.style.display = 'none';
	formAgregar.classList.remove('ocultado');
});