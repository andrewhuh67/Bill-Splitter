<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


</head>
<body>

	<h1>Bill-Splitter</h1>
	
	<form action="/Bill-Splitter/submitAdmissionForm.html" method="post">
		<p>
			Person 1 Amount: <input type="text" name="studentName" />
			
		</p>
		
		<p>
			Person 2 Amount: <input type="text" name="studentHobby" />
		</p>
		
		<p>
			Person 3 Amount: <input type="text" name="studentHobby" />
		</p>
		
		<p>
			Person 4 Amount: <input type="text" name="studentHobby" />
		</p>
		
		<p>
			Tax: <input type="text" name="studentHobby" />
		</p>
		
		<p>
			Delivery Fee: <input type="text" name="studentHobby" />
		</p>
		
		<p>
			Tip: <input type="text" name="studentHobby" />
		</p>
		<input type="submit" value="Submit Form"/>
		
	
	</form>





	
	<h2>${msg}</h2>
</body>
</html>