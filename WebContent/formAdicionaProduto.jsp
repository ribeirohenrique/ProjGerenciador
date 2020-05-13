<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%

String produtoNome = (String)request.getAttribute("nomeProduto");
System.out.println("Novo Produto Cadastrado = " + produtoNome);

String produtoDescricao = (String)request.getAttribute("descricaoProduto");
System.out.println("Descrição = " + produtoDescricao);

%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Produto <%=produtoNome %> cadastrado com sucesso. 
Descricao <%=produtoDescricao %> 

</body>
</html>