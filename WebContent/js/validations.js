/**
 * VALIDACIONES PARA LOS FORMULARIOS DE LOGIN Y REGISTER.
 */

const authForm = document.querySelector('#authForm');

function validateAuthForm(evento) {
	evento.preventDefault();
	const name = document.querySelector('#reg_name').value.trim();
	// String -> trim()     "   Gonzalo   Roa    " -> "Gonzalo   Roa"
	if(!name.length) {
		console.log('Está vacío');
	}
	if (!name) {
		
	}
	
}

document.addEventListener("DOMContentLoaded", function() {
	authForm.addEventListener('submit', validateAuthForm);
});
