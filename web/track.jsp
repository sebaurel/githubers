<%--
  Created by IntelliJ IDEA.
  User: sebastien
  Date: 27/04/2018
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"/>

<div class="container-fluid">
    <div class="row">
        <div class="col-auto">
            <form method="post" action="track">
                <label for="login">Login to track</label> : <input type="text" name="login" id="login" />
                <input type="submit"/>
            </form>
        </div>
    </div>
</div>
</body>
</html>