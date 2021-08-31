/**
 * VALIDACIONES PARA LOS FORMULARIOS DE LOGIN Y REGISTER.
 */
console.log('Cargó validations');
const authForm = document.querySelector('#authForm');
const authButton = document.querySelector('#authButton');

function validateAuthForm(evento) {
	evento.preventDefault();
	const name = document.querySelector('#reg_name').value.trim();
	const email = document.querySelector('#reg_email').value.trim();
	const password = document.querySelector('#reg_pass').value.trim();
	// String -> trim()     "   Gonzalo   Roa    " -> "Gonzalo   Roa"
	if(!name.length) {
		return alert('El campo name está vacio');
	}
	if (!email.length) {
		return alert('El campo email está vacío');
	}
	if (!password.length) {
		return alert('El campo password está vacío');
	}
	
	authForm.submit();
}

document.addEventListener("DOMContentLoaded", function() {
	authButton.addEventListener('click', validateAuthForm);
});
