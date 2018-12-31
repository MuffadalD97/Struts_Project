<%@ page contentType = "text/html; charset = UTF-8" %>
<%@ taglib prefix = "s" uri = "/struts-tags" %>

<html>
   <head>
      <title>Hello World</title>
   </head>
   
   <body>
      <s:property value = "messageStore.message"/>
      <br>
      Visit Count: <s:property value = "helloCount"/>
   </body>
</html>