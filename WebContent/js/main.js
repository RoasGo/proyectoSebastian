var signUpButton = document.getElementById('signUp');
var signInButton = document.getElementById('signIn');
var container = document.getElementById('container');

signUpButton.addEventListener("click", function() {
    container.classList.add("right-panel-active");
});

signInButton.addEventListener("click", function() {
    container.classList.remove("right-panel-active");
});

console.log('TODO CORRECTO')
