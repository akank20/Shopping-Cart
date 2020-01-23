<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body>
	<h1>Insert Items into Cart:</h1>
	<form action="/showCart" method="post">
	Item Name:<input type="text" name="itemName"/><br>
	Price:<input type="text" name="price"/><br>
	Quantity:<input type="text" name="quantity"/><br>
	<input type="submit" value="Save data!"/>
	</form>
	${msg}
</body>
</html>