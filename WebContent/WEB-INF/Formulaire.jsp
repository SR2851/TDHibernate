<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<title>Accueil</title>
</head>
<body style="background-image: url(http://localhost:8080/TDHibernate/ray1.jpg);background-attachment: fixed;background-repeat: no-repeat;background-size: 100%;">
<nav class="navbar navbar-dark" style="background-color:black; border-bottom-style: solid; border-color:#d6faff;">
  <a class="navbar-brand" href="">
    <img src="http://localhost:8080/TDHibernate/R.PNG" width="30" height="30" class="d-inline-block align-top" alt="">
    Ross Formations
  </a>
</nav>
<div class="container-fuild">
<div class="row">
<div class="col-lg-3">
<a href="/TDHibernate/Accueil" style="color:white;">Accueil </a><br>
<a href="/TDHibernate/ListeFormation" style="color:white;">Liste des formations </a><br>
<a href="" style="color:white;"> </a>
</div>
<div class="col-lg-6" style="background-color: #d6faff; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px; ">
<h1>Formulaire d'ajout de nouvelles formations:</h1>
<form action="/TDHibernate/addFormation" method="post">
<label>Thème de la formation:</label>
<input type="text" name="theme" class="form-control"><br>
<input type="submit" value="Ajouter" class="btn btn-dark">
</form><br><br>


</div>
<div class="col-lg-3">
</div>
</div>
</div>
</body>
</html>