<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:iterator value="libros">
<p>
	Titulo: <s:property value="titulo" /> <br>
	Precio: <s:property value="precio" /> <br>
	ISBN: <s:property value="isbn" /> <br>
</p>

</s:iterator>

</body>
</html>