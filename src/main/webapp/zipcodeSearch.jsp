<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import="java.util.*,java.io.*" %> 
<HTML>
<TITLE>TITLE</TITLE>
<HEAD>

<script type="text/javascript" src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>


<SCRIPT LANGUAGE="javascript">
	function fn_load() 
	{		
		new daum.Postcode({
			oncomplete : function(data) {
				
				fn_return(data.zonecode+"_"+data.roadAddress)
			}
		}).open();
	}
	
	function fn_return(arg) 
	{	
		
		document.title = arg;
	}
	
</SCRIPT>     
	
</HEAD>
<BODY onload="fn_load()">
</BODY>
</HTML>