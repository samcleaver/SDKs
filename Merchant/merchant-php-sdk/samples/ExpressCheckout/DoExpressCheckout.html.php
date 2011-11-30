<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PayPal SDK - DoExpressCheckout</title>
</head>
<body>
<div id="wrapper">
<div id="header">
<h3>DoExpressCheckout</h3>
<div id="apidetails">Used to make checkout payment</div>
</div>
<form method="POST">
<div id="request_form">
<div class="params">
<div class="param_name">
Token(Get Token via <a href="SetExpressCheckout">SetExpressCheckout</a>)
</div>
<div class="param_value">
<input type="text" name="token" value="" size="50" maxlength="260" />
</div>
</div>
<div class="params">
<div class="param_name">Payer ID</div>
<div class="param_value">
<input type="text" name="payerID" value="" size="50"
maxlength="260" />
</div>
</div>
<div class="params">
<div class="param_name">PaymentType</div>
<div class="param_value">
<select name="paymentAction">
<option value="Sale">Sale</option>
<option value="Authorization">Authorization</option>
<option value="Order">Order</option>
</select>
</div>
</div>
<div class="params">
<div class="param_name">Amount</div>
<div class="param_value">
<input type="text" name="amt" value="2.00" size="50"
maxlength="260" />
</div>
</div>
<div class="params">
<div class="param_name">CurrencyCode</div>
<div class="param_value">
<input type="text" name="currencyCode" value="USD" size="50"
maxlength="260" />
</div>
</div>

<div class="submit">
<input type="submit" name="DoExpressCheckoutBtn"
value="DoExpressCheckout" /> <br />
</div>
<a href="/merchant-sample/index.html">Home</a>
</div>
</form>
</div>
<div id="relatedcalls">
See also
<ul>
<li><a href="SetExpressCheckout">SetExpressCheckout</a></li>
<li><a href="GetExpressCheckout">GetExpressCheckout</a></li>
<li><a href="DoUATPExpressCheckoutPayment">DoUATPExpressCheckout</a>
</li>
</ul>
</div>
</div>
</body>
</html>