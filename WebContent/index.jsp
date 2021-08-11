<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Proyecto Clase Sebastian</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" >
<link rel="stylesheet" href="css/main.css" >
<script src="https://kit.fontawesome.com/4115d47452.js"></script>
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,800&display=swap" rel="stylesheet">
</head>
<body>

	<h2 class="tittle">Biblioteca X</h2>
	<div class="container" id="container">
		
		<div class="form-container sign-up-container">
		
			<form action="auth" class="formulario" method="post" id="authForm">
				<h1>Crear Cuenta</h1>
				
				<div class="social-container">
					<a href="#" class="social"> <i class="fab fa-facebook-f"></i></a>
					<a href="#" class="social"> <i class="fab fa-google-plus-g"></i></a>
					<a href="#" class="social"> <i class="fab fa-linkedin-in"></i></a>
				</div>
				<span>puedes usar tambien tu email para registrarte</span>
				<input class="inputs" name="name" type="text" placeholder="Ingresa tu nombre" id="reg_name"/>
				<input class="inputs" name="email" type="email" placeholder="Ingresa tu email" id="reg_email"/>
				<input class="inputs" name="password" type="password" placeholder="Ingresa tu password" id="reg_pass" />
				<input class="boton" value="Registrate" type="submit" />
			</form>

		</div>
		
		<div class="form-container sign-in-container">
		
			<form action="login" class="formulario" method="post" >
				<h1>Inicia sesion</h1>
				
				<div class="social-container">
					<a href="#" class="social"> <i class="fab fa-facebook-f"></i></a>
					<a href="#" class="social"> <i class="fab fa-google-plus-g"></i></a>
					<a href="#" class="social"> <i class="fab fa-linkedin-in"></i></a>
				</div>
				<span>o usa tu cuenta...</span>
				<input class="inputs" name="email" type="email" placeholder="Ingresa tu email" id="log_email" />
				<input class="inputs" name="password" type="password" placeholder="Ingresa tu password" id="log_pass"/>
				<a href="#" class="link">¿Olvidaste tu contraseña?</a>
				<input class="boton" value="Inicia Sesión" type="submit" />
			</form>
		
		</div>
		
		<div class="overlay-container">
		
			<div class="overlay">
	            <div class="overlay-panel overlay-left">
	                <h1>Bienvenido otra vez!</h1>
	                <p>Para usar nuestro software, por favor ingresa tus datos</p>
	                <button class="boton ghost" id="signIn">Iniciar Sesión</button>
	            </div>
	            <div class="overlay-panel overlay-right">
	                <h1>Hola, Amigo!</h1>
	                <p>Registrate y comienza a disfrutar junto con nosotros</p>
	                <button class="boton ghost" id="signUp">Registrate</button>
	            </div>
			</div>
		
		</div>
		
	</div>

	<script src="js/main.js"></script>
	<script src="js/validations.js"></script>

</body>
</html>