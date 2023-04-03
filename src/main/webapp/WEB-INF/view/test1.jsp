<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 14/03/2023
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>




Here are several gyms with pubs within 20min walk for ${gym.postcode}:
</div>



<c:forEach var="gyms" items="${gymsAndPubs}">



                <p>${gyms['key']['postcode']}</p>
                <br>
                Name: <br><c:out value="${gyms['key'].getName()}"></c:out>
                Address: <c:out value="${gyms['key']['address']}"></c:out>

                <br>
                Type: <c:out value="${gyms['key']['type']}"></c:out>
                <br>
                Rating: <c:out value="${gyms['key']['rating']}"></c:out>
                <br>
                Phone: <c:out value="${gyms['key']['phone']}"></c:out>
                <br>
                Schedule: <c:out value="${gyms['key']['openingHours']}"></c:out>
                <br>
                Description: <c:out value="${gyms['key']['additionalInformation']}"></c:out>
                    <%--                    --%>
                <br>
                    ${gyms['key']['latitude']}<br>
                    ${gyms['key']['longitude']}
                <br>
                <br>


                <c:forEach var="pubs" items="${gymsAndPubs.values()}">

                    ${pubs}



                    <c:forEach var="pubInfo" items="${pubs.values()}">


                            <br>


                        <c:out value="${pubInfo['name']}"></c:out>
                            <c:out value="${pubInfo.getAddress()}"></c:out>


                        Rating: <c:out value="${pubInfo.getRating()}"></c:out>

                        Phone: <c:out value="${pubInfo.getPhone()}"></c:out>

                            <c:out value="${pubInfo.getAdditionalInformation()}"></c:out>

                        </div>

                    </c:forEach>


                </c:forEach>



</c:forEach>




</body>
</html>
