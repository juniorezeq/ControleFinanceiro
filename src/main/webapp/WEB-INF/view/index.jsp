<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<<!DOCTYPE html>
<html lang="pt-BR" ng-app>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description"
	content="Material em atendimento ao teste de programação">
<meta name="author" content="Ezequiel Junior">
<link rel="icon" href="imagens/favicon.png">

<title>Controle Financeiro - Jiva</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/carousel.css" rel="stylesheet">
<script src="js/angular.min.js"></script>
</head>
<!-- NAVBAR
================================================== -->
<body>
	<div ng-include src="'menus.html'"></div>

	<!-- Carousel
    ================================================== -->
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img class="first-slide" src="imagens/bestplace.jpg"
					alt="Sankhya Talentos">
				<div class="container">
					<div class="carousel-caption">
						<h1></h1>
					</div>
				</div>
			</div>
			<div class="item">
				<img class="second-slide" src="imagens/office.jpg"
					alt="Second slide">
				<div class="container">
					<div class="carousel-caption">
						<h1>Sankhya</h1>
					</div>
				</div>
			</div>
			<div class="item">
				<img class="third-slide" src="imagens/premio.jpg" alt="Third slide">
				<div class="container">
					<div class="carousel-caption">
						<h1>Mario Sérgio Cortella</h1>
					</div>
				</div>
			</div>
		</div>
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	<!-- /.carousel -->

	<footer>
		<p class="pull-right">
			<a href="#">Back to top</a>
		</p>
		<p>
			&copy; Ezequie de Paula Junior. &middot; <a href="#">Desenvolvedor Full Stack</a> &middot; <a href="#"></a>
		</p>
	</footer>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>
