<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="punchout_form" method="post" action="/reading/index">
    <input type="submit" value="立即支付" style="display:none" >
</form>
<script>
alert("该书不存在")
document.forms[0].submit();
</script>
</body>
</html>