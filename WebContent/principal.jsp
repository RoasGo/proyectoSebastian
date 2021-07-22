<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/main.css">
<script src="https://kit.fontawesome.com/4115d47452.js"></script>
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,800&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">
<title>Libreria</title>
</head>
<body class="relativa">
	
	<main>
		
		<div class="contenido-main">
		
			<div class="contenido-izquierda">
				<div class="titulo-contenido">
					<h3 class="start">Libreria</h3>
					<h3 class="end">Cibertec</h3>
				</div>
				<ul class="lista-opciones">
					<li>Usuarios</li>
					<li>Libros</li>
					<li>Autores</li>
					<li>Roles</li>
					<li>Reservaciones</li>
					<li>Reportes</li>
				</ul>
			</div>
			
			<div class="contenido-derecha">
				
				<div class="contenido-usuarios actual" id="usuarios">
					<h1>Mantenimiento de Usuarios</h1>
					<div id="mensaje-error"></div>
					
					<div class="mantenimiento">
						<table class="listado">
							<thead>
								<tr>
									<th>Codigo</th>
									<th>Nombre</th>
									<th>Email</th>
									<th></th>
									<th></th>
								</tr>
							</thead>
							<tbody id="columnas">
								<tr>
									<td>1</td>
									<td>Gonzalo</td>
									<td>roasgo@hotmail.com</td>
									<td><a href="#"> <i class="far fa-edit"></i> </a></td>
									<td><a href="#"> <i class="fas fa-trash"></i> </a></td>
								</tr>
							</tbody>
						</table>
					</div>
					
				</div>
				
			</div>
		
		</div>
		
	</main>
	
	<div class="slider"></div>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.1.3/TweenMax.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.1.3/TimelineMax.min.js"></script>

	<script src="js/principal.js"></script>
	
</body>
</html>