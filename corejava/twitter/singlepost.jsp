<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="h" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<h:master title="${post.getText()}">
    <h:post post="${post}"/>
</h:master>