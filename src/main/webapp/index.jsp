<html>
<body>
<jsp:useBean id = "nameBean" class = "org.demo_page.NameBean" />
<h2>Hello World, <jsp:getProperty name="nameBean" property="name" />!</h2>
</body>
</html>
