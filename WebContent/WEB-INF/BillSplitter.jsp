<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


</head>
<body>

	<h1>Bill-Splitter</h1>
	<h2>If there are less then four people, just leave it blank.</h2>
	<h2>${msg}</h2>
	
	<form action="/Bill-Splitter/submitBillForm.html" method="POST">
		<p>
			Person 1 Amount: <input type="text" name="person1" />
			
		</p>
		
		<p>
			Person 2 Amount: <input type="text" name="person2" />
		</p>
		
		<p>
			Person 3 Amount: <input type="text" name="person3" />
		</p>
		
		<p>
			Person 4 Amount: <input type="text" name="person4" />
		</p>
		
		<p>
			Tax: <input type="text" name="tax" />
		</p>
		
		<p>
			Delivery Fee: <input type="text" name="deliveryfee" />
		</p>
		
		<p>
			Tip: <input type="text" name="tip" />
		</p>
		<input type="submit" value="Submit Form"/>
		
	
	</form>
	
</body>
</html>