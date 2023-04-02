<%@page import="Dto.Customer1"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="">
<tr>
<th>customer_id</th>
<th>customer_name</th>
<th>email</th>
<th>phone_number</th>
<th>booking_id</th>
<th>location_id</th>
<th>drone_shot_id</th>
<th>created_time</th>

</tr>
<%List<Customer1>customer1s=(List<Customer1>)request.getAttribute("fetchall"); %>
<%for(Customer1 daoJsp:customer1s)   {%>
<tr>
<td><%=daoJsp.getCustomer_id()%></td>
<td><%=daoJsp.getCustomer_name()%></td>
<td><%=daoJsp.getEmail()%></td>
<td><%=daoJsp.getPhone_number()%></td>
<td><%=daoJsp.getBooking_id()%></td>
<td><%=daoJsp.getLocation_id()%></td>
<td><%=daoJsp.getDrone_shot_id()%></td>
<td><%=daoJsp.getCreated_time()%></td>
</tr>
<%} %>
</table>
</body>
</html>