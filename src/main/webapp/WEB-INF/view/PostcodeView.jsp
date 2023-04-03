<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 09/03/2023
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>GymsAndPubs - Compensate your activities with proper beer!</title>
    <%--TODO attach CSS files--%>
    <%--    <link href="<c:url value="/resources/css/GymsAndPubs.css" />" rel="stylesheet">--%>

    <link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet">
</head>

<body>

<div class="boxbgsearch">
    <div class="boxbgleftsearch">
        &nbsp;
    </div>

    <div class="boxcentersearch">

        <div class="boxtextsearch">
            <p>Hi!</p>
            <p>Choose your postcode to find nice GYM with up to 5 PUB's just nearby to compensate your fitness time!
            </p>
        </div>


<%--    <div class="selectbox">--%>
<%--        <form:form action="./showNearestGyms" modelAttribute="gym" method="GET">--%>
<%--                &lt;%&ndash;    <script>  </script>&ndash;%&gt;--%>
<%--                &lt;%&ndash;//TODO make input line which will not conflict with droplist--%>
<%--                TODO ADD website to info&ndash;%&gt;--%>
<%--                        <form:input type="text" path="postcode" --%>
<%--                           placeholder="Write your postcode" />--%>
<%--    </div>--%>

        <div class="selectboxsearch">
            <form:form action="./showNearestGyms" modelAttribute="gym" method="GET">
            <form:select path="postcode" disabled="false" class="selectboxsearch">

                <form:option value="Nothing selected" />
                <form:options items="${allPostcodes}" />

            </form:select>
            <br><br>

                <input type = "submit" value = "Find!" class="submitsearch"/>

            </form:form>
        </div>

        <div class="spacesearch">
            &nbsp;
        </div>

        <div class="boxtextsearch">
            <p>...Or just enter your postcode below:</p>
        </div>


        <div class="selectboxsearch">


            <form:form action="./showNearestGyms" modelAttribute="gym" method="GET">
            <form:input type="text" path="postcode" class="search" placeholder="Enter Postcode!"></form:input>
            <input type = "submit" value = "Find!" class="submitsearch"/>


            </form:form>

        </div>

        <div class="spacesearch">
            &nbsp;
        </div>



    </div>


    <div class="boxbgrightsearch">
        &nbsp;
    </div>

</div>




<div  class="mapboxsearch">
<%--    <iframe src="https://www.google.com/maps/d/embed?mid=1S47lNOlVDTenavFsae2kuFrfvlCrShw&ehbc=2E312F"   class="mapboxsearch"></iframe>--%>

    <iframe src="https://www.google.com/maps/d/embed?mid=19aLd_kpEXXSO0YW39vVR8ByC3rVvOsU&ehbc=2E312F" width="800" height="600"  class="mapboxsearch"></iframe>

<%--    <br> <img src="${pageContext.request.contextPath}/resources/images/cat1.png" style="width: 100px;height: 100px;">--%>

</div>




<div class="empty">

</div>

<div class="info">
    ..link to GitHUB: <a href="https://github.com/Elen4538"> Elena Grishina</a>
</div>


</body>
</html>