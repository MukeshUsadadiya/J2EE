<%--Record Insert using Form and Html Page --%>
<html>
<head>
	<title>Welcome</title>
</head>
<body>
	<%! int tot=0;%>
	<%
		try
		{
			tot =Integer.parseInt(request.getParameter("t1")) + Integer.parseInt(request.getParameter("t2"));
			out.println("Total is :"+tot);
		}
		catch(Exception e)
		{
			out.println("Exception is :"+e);
		}
	%>
</body>
</html>