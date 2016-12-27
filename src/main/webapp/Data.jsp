<%--
  Created by IntelliJ IDEA.
  User: 木松
  Date: 2016/12/23
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="util.*" %>
<%@ page import="dao.ItemsDAO" %>
<%@ page import="entity.Items" %>
<html>
<head>
    <title>asd </title>
</head>
<body>


<%=new Date()%>
<%=DateUtil.getTime()%>

<h1>测试：</h1>

<%
    ItemsDAO itemsDAO = new ItemsDAO();
    if (itemsDAO.getAllItems() == null){
%>
集合是空的
    <%}else {
        %>
list有东西
<%
    }


%>

dsf sdcccccfg

</body>
</html>
