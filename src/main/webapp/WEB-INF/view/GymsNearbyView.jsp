<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 10/03/2023
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset='UTF-8' />
    <title>GymsAndPubs - SearResults for ${gym.postcode}</title>
<%--TODO attach CSS files--%>
<%--    <link href="<c:url value="/resources/css/GymsAndPubs.css" />" rel="stylesheet">--%>

    <link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet">

</head>
<body>

<div class="top">
    <a href="javascript:history.back()">Back to search...</a>
</div>


<div class="intro">
    Here are gyms with pubs within 20min walk for <strong>${gym.postcode}</strong>:
</div>


<c:forEach var="gyms" items="${gymsAndPubs}">

    <div class="boxresultscontainer">
<%--&lt;%&ndash;    //TODO add info to DB and extract data to screen&ndash;%&gt;--%>
<%--    Working hours: !!!!!!!!!!!!!!!!!!!!!--%>

        <div class="boxresultscolgym">
            <h2><b><c:out value="${gyms['key']['name']}"></c:out></b></h2>
            Address: <c:out value="${gyms['key']['address']}"></c:out><br>
            Type: <c:out value="${gyms['key']['type']}"></c:out>, Rating: <c:out value="${gyms['key']['rating']}"></c:out><br>
            <p>Phone: <c:out value="${gyms['key']['phone']}"></c:out></p>
<%--            Schedule: <c:out value="${gyms['key']['openingHours']}"></c:out>--%>
            <p>Description: <c:out value="${gyms['key']['additionalInformation']}"></c:out></p>
<%--            ${gyms['key']['postcode']}--%>
<%--            ${gyms['key']['latitude']}--%>
<%--            ${gyms['key']['longitude']}--%>
<%--&lt;%&ndash;    //TODO add images for GYMS--%>


        </div>

        <div class="boxspace">
            <p>&nbsp;</p>
        </div>

        <div class="boxresultscolpub">
            <c:forEach var="pub" items="${gyms.value}">
                <div class="boxpubitem">

                    <h3>${pub.key}</h3>
                    ${pub.value.address} <br>
                    Phone: ${pub.value.phone}<br>
<%--                    ${pub.value.openingHours}<br>--%>
                    Rating: ${pub.value.rating}<br>
                    Additional information: ${pub.value.additionalInformation}
                        <%--&lt;%&ndash;    //TODO add images for PUBS--%>
                        <%--&lt;%&ndash;    //TODO for PUBS if no description, or no phone or no other information do not print "tecnical data from DB--%>
                </div>
            </c:forEach>

        </div>

        <div class="boxspace">
            <p>&nbsp;</p>
        </div>

        <div class="boxresultscolmap">
            <iframe src="https://www.google.com/maps/d/embed?mid=19aLd_kpEXXSO0YW39vVR8ByC3rVvOsU&ehbc=2E312F&ll=${gyms['key']['latitude']}%2C${gyms['key']['longitude']}&z=18"  class="mapiframe"></iframe>
        </div>

        <div class="boxspace">
            <p>&nbsp;</p>
        </div>

    </div>

    <div class="empty">

    </div>

</c:forEach>

<div class="empty">

</div>

<div class="top">
    <a href="javascript:history.back()">Back to search...</a>
</div>


<div class="empty">

</div>
<div class="empty">

</div>

<div class="info">
    ..link to GitHUB: <a href="https://github.com/Elen4538"> Elena Grishina</a>
</div>



</body>
</html>








<%--&lt;%&ndash;====================&ndash;%&gt;--%>


<%--<div class="top">--%>
<%--Here are several gyms with pubs within 20min walk--%>
<%--</div>--%>

<%--&lt;%&ndash;&lt;%&ndash;    //TODO add info to DB and extract data to screen&ndash;%&gt;&ndash;%&gt;--%>
<%--&lt;%&ndash;    Working hours: !!!!!!!!!!!!!!!!!!!!!&ndash;%&gt;--%>

<%--&lt;%&ndash;====================&ndash;%&gt;--%>

<%--<div class="results">--%>

<%--<c:forEach var="gyms" items="${gymsAndPubs}">--%>
<%--    <br>--%>
<%--    ${gyms['key']['postcode']}--%>
<%--    <br>--%>
<%--    Name:--%>
<%--    <c:out value="${gyms['key'].getName()}"></c:out>--%>
<%--    <br>--%>
<%--    Address:--%>
<%--    <c:out value="${gyms['key']['address']}"></c:out>--%>
<%--    <br>--%>
<%--    Type:--%>
<%--    <c:out value="${gyms['key']['type']}"></c:out>--%>
<%--    <br>--%>
<%--    Rating:--%>
<%--    <c:out value="${gyms['key']['rating']}"></c:out>--%>
<%--    <br>--%>
<%--    Phone:--%>
<%--    <c:out value="${gyms['key']['phone']}"></c:out>--%>
<%--    <br>--%>
<%--    Schedule:--%>
<%--    <c:out value="${gyms['key']['openingHours']}"></c:out>--%>
<%--    <br>--%>
<%--    Description:--%>
<%--    <c:out value="${gyms['key']['additionalInformation']}"></c:out>--%>

<%--    <br><br>--%>

<%--    ${gyms['key']['latitude']}--%>
<%--    ${gyms['key']['longitude']}--%>
<%--    <br><br>--%>

<%--    <div class="google_map">--%>

<%--        <iframe src="https://www.google.com/maps/d/embed?mid=19aLd_kpEXXSO0YW39vVR8ByC3rVvOsU&ehbc=2E312F&ll=${gyms['key']['latitude']}%2C${gyms['key']['longitude']}&z=15" width="800" height="600"></iframe>--%>

<%--    </div>--%>

<%--    <div class="paragraph">--%>
<%--    <br>--%>
<%--    Pubs to visit:--%>
<%--    <br><br>--%>

<%--    <c:forEach var="pubs" items="${gymsAndPubs.values()}">--%>
<%--        <br><br>--%>
<%--        <c:forEach var="pubInfo" items="${pubs.values()}">--%>

<%--            <br><br>--%>

<%--&lt;%&ndash;            <c:out value="${pubInfo}"></c:out>&ndash;%&gt;--%>

<%--            <c:out value="${pubInfo.getName()}"></c:out>--%>
<%--            <br>--%>
<%--            <c:out value="${pubInfo.getAddress()}"></c:out>--%>
<%--            <br>--%>
<%--            <c:out value="${pubInfo.getType()}"></c:out>--%>
<%--            <br>--%>
<%--            <c:out value="${pubInfo.getRating()}"></c:out>--%>
<%--            <br>--%>
<%--            <c:out value="${pubInfo.getPhone()}"></c:out>--%>
<%--            <br>--%>
<%--            <c:out value="${pubInfo.getOpeningHours()}"></c:out>--%>
<%--            <br>--%>
<%--            <c:out value="${pubInfo.getAdditionalInformation()}"></c:out>--%>


<%--        </c:forEach>--%>

<%--        <br><br>--%>
<%--    </c:forEach>--%>

<%--    </div>--%>
<%--    <div class="clearfix"></div>--%>



