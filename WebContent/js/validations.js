/**
 * VALIDACIONES PARA LOS FORMULARIOS DE LOGIN Y REGISTER.
 */

const authForm = document.querySelector('#authForm');

function validateAuthForm(evento) {
	evento.preventDefault();
	const name = document.querySelector('#reg_name').value.trim();
	const email = document.querySelector('#reg_email').value.trim();
	const password = document.querySelector('#reg_pass').value.trim();
	// String -> trim()     "   Gonzalo   Roa    " -> "Gonzalo   Roa"
	if(!name.length) {
		console.log('Está vacío');
	}
	if (!email.length) {
		console.log('Está vacío');
		
	}
	if(!password.length){
		console.log('Está vacío');
	}
	
}

document.addEventListener("DOMContentLoaded", function() {
	authForm.addEventListener('submit', validateAuthForm);
});

