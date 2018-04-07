<%--
  User: 57140
  Date: 2018/3/21
  Time: 17:24
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<table id="pgSF" style="width:300px"></table>
<script>
    var sportsFacility = sessionStorage.getItem("row");
    $('#pgSF').propertygrid({
        url: 'sf/details'+sportsFacility,
        showGroup: true,
        scrollbarSize: 0,
        //请求方式，默认是POST
        method: 'get',
    });

</script>
