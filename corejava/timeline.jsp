<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Twitter Clone Timeline</title>
</head>
<body>
    <h1>Twitter Clone Timeline</h1>

    <!-- Iterate over tweets and display them -->
    <c:forEach var="tweet" items="${tweets}">
        <div>
            <p>${tweet.text}</p>
            <p>Posted by: ${tweet.username}</p>
        </div>
    </c:forEach>

    <!-- Form for creating new tweets -->
    <form action="tweet" method="post">
        <textarea name="tweetText" rows="4" cols="50"></textarea>
        <input type="submit" value="Tweet">
    </form>
</body>
</html>