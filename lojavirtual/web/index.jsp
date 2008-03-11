<%@page contentType="text/html"%>
<%@ taglib uri="menus-taglib.tld" prefix="menu" %>
<html>

<head>
<meta http-equiv="Content-Language" content="en-us">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>Orange free navigation LIB</title>
</head>

<body bgcolor="#FF6600"><menu:ddmenu name="first" x="340" y="180" isVertical="false">
<menu:ddmenu text="About" bckColor="#ff00aa" link="green.htm" icon1="doc.gif" icon2="doc1.gif"/>
<menu:ddmenu text="Examples" bckColor="#aa00ff" link="green.htm" icon1="fold.gif" icon2="fold1.gif">
<menu:ddmenu text="default configuration" bckColor="#aa00ff" link="example1.jsp" colWidth="140"/>
<menu:ddmenu text="Horisontal alignment" bckColor="#aa20ff" link="green.htm"/>
<menu:ddmenu text="Vertical alignment" bckColor="#aa40ff" link="green.htm"/>
<menu:ddmenu text="muliple menus" bckColor="#aa60ff" link="green.htm"/>
<menu:ddmenu text="different colors" bckColor="#aa80ff" link="green.htm"/>
<menu:ddmenu text="image menu" bckColor="#aaa0ff" link="green.htm"/>

</menu:ddmenu>
<menu:ddmenu text="Installation" bckColor="#aaff00" link="green.htm" icon1="doc.gif" icon2="doc1.gif"/>
<menu:ddmenu text="Configuration" bckColor="#ffaa00" link="green.htm" icon1="doc.gif" icon2="doc1.gif"/>
</menu:ddmenu> </body>

</html>