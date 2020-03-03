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
<a href="/TDHibernate/Accueil" style="color:white;">Accueil</a><br>
<a href="/TDHibernate/Formulaire" style="color:white;">Enregistrement </a><br>
<a href="/TDHibernate/ListeFormation" style="color:white;">Liste des formations </a><br>

</div>
<div class="col-lg-6" style="background-color: #d6faff; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px; ">
<h1 style="text-align:center;">Formation ajoutée avec succès!</h1>


</div>
<div class="col-lg-3">
</div>
</div>
</div>
</body>
</html>