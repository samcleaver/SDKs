<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Permissions</title>
</head>
<body>
	<h2>GetPermissions API Test Page</h2>
	<form method="post">
		<div class="params">
			<div class="param_name">Access Token</div>
			<div class="param_value">
				<input type="text" name="token" size="50" maxlength="260" value="" /><br />
			</div>
		</div>
		<input type="submit" name="GetPermissionsBtn" value="GetPermissions" />
		<br/>
		<a href="index.html">Home</a>
	</form>
</body>
</html>