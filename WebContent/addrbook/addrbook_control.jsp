<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="gbridge.addrbook.*, java.util.*"%>
    
<% request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id = "addrbook" class = "gbridge.addrbook.AddrBook" />
<jsp:setProperty property = "*" name = "addrbook" />

<%
	AddrBookDAO dao = new AddrBookDAO();
	String action = request.getParameter("action");
	
	if(action.equals("insert")) {
		dao.insertDB(addrbook);
		response.sendRedirect("addrbook_control.jsp?action=list");
	} else if(action.equals("list")){
		List<AddrBook> datas = dao.getDBList();
		request.setAttribute("datas", datas);
		pageContext.forward("addrbook_list.jsp");
		
	}
%>