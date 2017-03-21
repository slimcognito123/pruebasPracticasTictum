<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>¿Me has visto?</title>
</head>
<body>
<% 
ArrayList<Question> preguntas = new ArrayList<>();
Interview entrevista = new Interview();
%>
	<jsp:useBean id="question" class="java.com.tt.tictinterview.beans.form.Question"></jsp:useBean>
	You have enterted below details:<br> 
	<jsp:getProperty property="question1" name="question"/><br> 
	<jsp:getProperty property="type1" name="question"/><br>
</body>
</html>