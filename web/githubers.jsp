<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--  Created by IntelliJ IDEA.
  User: SeB
  Date: 18/04/2018
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"/>

<div class="container-fluid">
    <div class="row">
        <div class="col-auto">
            <ul class="list-group">
                <c:forEach items="${githuberListe}" var="gi">
                    <li class="list-group-item"><img src="${gi.avatar_url}" width="60" height="auto"> <strong>${gi.name}</strong> <br>
                        Login : ${gi.login}<br>
                        E-mail : ${gi.email}<br>
                        <div class="bio">
                            Bio : <em>${gui.bio}</em>
                        </div>
                        <form method="post" action="untrack">
                            <input type="hidden" value="${gi.login}" name="login" id="login"/>
                            <input type="submit" value="unTrack"/>
                        </form>
                    </li>
                </c:forEach>
            </ul>
        </div>
        <div class="col-8">


        </div>
    </div>
</div>
</body>
</html>
