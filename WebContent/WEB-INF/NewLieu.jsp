<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<link rel="icon" type="image/png" href="http://localhost:8080/TDHibernate/R.PNG" />
<title>New Lieu</title>
</head>
<body style="background-image: url(http://localhost:8080/TDHibernate/ray1.jpg);background-attachment: fixed;background-repeat: no-repeat;background-size: 100%;">
<nav class="navbar navbar-dark" style="background-color:black; border-bottom-style: solid; border-color:#d6faff;">
  <a class="navbar-brand" href="/TDHibernate/Accueil">
    <img src="http://localhost:8080/TDHibernate/R.PNG" width="40" height="40" alt="">
     <img src="http://localhost:8080/TDHibernate/RFtype.png" width="150" height="30" margin-top="5px">
  </a>
</nav>
<div class="container-fuild">
<div class="row">
<div class="col-lg-3" style="padding-top:6px;">
<div style="background-color:#50ecfa; border-radius:50px; text-align:center; color:black; margin-left:14px;"><h4>Menu</h4></div>
<div style="border-bottom-style:solid;border-bottom-color:#50ecfa;margin-left:14px;">
<h5><a href="/TDHibernate/Accueil" style="color:white;">Accueil </a></h5>
<h5><a href="/TDHibernate/addFormation" style="color:white;">Enregistrement formation </a></h5>
<h5><a href="/TDHibernate/addLieu" class="btn btn-link btn-lg disabled" role="button" aria-disabled="true" style="color:white;">Enregistrement lieu </a></h5>
<h5><a href="/TDHibernate/ListeFormation" style="color:white;">Liste des formations </a></h5>
<h5><a href="/TDHibernate/ListeLieu" style="color:white;">Liste des lieux </a></h5>
<h5><a href="/TDHibernate/listLieuFormation" style="color:white;">Formations par lieux </a></h5>
</div>
</div>
<div class="col-lg-6" style="background-color: #d6faff; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px; ">
<h1>Formulaire d'ajout de nouveaux lieux:</h1>
<form action="/TDHibernate/addLieu" method="post">
<label>Ville:</label>
<input type="text" name="ville" class="form-control"><br>
<label>Adresse et salle:</label>
<input type="text" name="adresse" class="form-control"><br>
<input type="submit" value="Ajouter" class="btn btn-dark">
</form><br><br>


</div>
<div class="col-lg-3">
</div>
</div>
</div>
</body>
</html>