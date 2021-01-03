<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="kendo" uri="http://www.kendoui.com/jsp/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WhereToGo</title>
	<link href="resources/styles/kendo.common.min.css" rel="stylesheet" type="text/css" />
    <link href="resources/styles/kendo.default.min.css" rel="stylesheet" type="text/css" />
    <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/kendo.all.min.js"></script>
   
</head>
<body bgcolor="#FFCE6B">
<div style="text-align:center;">
<div style="height:50px;"></div>
<img src="resources/title.png"></img>
<div style="height:50px;"></div>
<div>
<form action='${requestUri}' method='get' name='form1'>
<kendo:textBox name='keyword' placeholder = 'Search...' style="width:410px;height:30px;" ></kendo:textBox>
<kendo:button name="button" type="button" onClick='document.form1.submit()' imageUrl="resources/magnifying-glass.png">
</kendo:button>
</form>
</div>
</div>
</body>
</html>
