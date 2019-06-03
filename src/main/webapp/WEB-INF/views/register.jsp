<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<!-- <link rel="stylesheet" href="styles.css"> -->
<link href=https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cosmo/bootstrap.min.css
	rel="stylesheet">
</head>
<body>
	<h1>Registration Page</h1>
	
	<!-- Post will hide the data from the URL -->
	<!-- the name attribute allows us to send values from the form back to the 
	controller, the name assigned in quotes should match exactly to the
	@RequestParam in the controller method -->
	<form action="add-user" method="POST">
		First name: <input type="text" name="firstName"><br>
		Last name: <input type="text" name="lastName"><br>
		Email: <input type="text" name="email"><br>
		Phone Number: <input type="tel" name="phone"><br>
		Password: <input type="password" name="password"><br>
		
		
		<!-- More form inputs for Lab 23 -->
		<!-- Birthday: <input type="text" name="birthday"><br>
		Street Address:  <input type="text" name="address"><br>
		State:
		<select name="state">
			<option value="AL">Alabama</option>
			<option value="AK">Alaska</option>
			<option value="AZ">Arizona</option>
			<option value="AR">Arkansas</option>
			<option value="CA">California</option>
			<option value="CO">Colorado</option>
			<option value="CT">Connecticut</option>
			<option value="DE">Delaware</option>
			<option value="DC">District Of Columbia</option>
			<option value="FL">Florida</option>
			<option value="GA">Georgia</option>
			<option value="HI">Hawaii</option>
			<option value="ID">Idaho</option>
			<option value="IL">Illinois</option>
			<option value="IN">Indiana</option>
			<option value="IA">Iowa</option>
			<option value="KS">Kansas</option>
			<option value="KY">Kentucky</option>
			<option value="LA">Louisiana</option>
			<option value="ME">Maine</option>
			<option value="MD">Maryland</option>
			<option value="MA">Massachusetts</option>
			<option value="MI">Michigan</option>
			<option value="MN">Minnesota</option>
			<option value="MS">Mississippi</option>
			<option value="MO">Missouri</option>
			<option value="MT">Montana</option>
			<option value="NE">Nebraska</option>
			<option value="NV">Nevada</option>
			<option value="NH">New Hampshire</option>
			<option value="NJ">New Jersey</option>
			<option value="NM">New Mexico</option>
			<option value="NY">New York</option>
			<option value="NC">North Carolina</option>
			<option value="ND">North Dakota</option>
			<option value="OH">Ohio</option>
			<option value="OK">Oklahoma</option>
			<option value="OR">Oregon</option>
			<option value="PA">Pennsylvania</option>
			<option value="RI">Rhode Island</option>
			<option value="SC">South Carolina</option>
			<option value="SD">South Dakota</option>
			<option value="TN">Tennessee</option>
			<option value="TX">Texas</option>
			<option value="UT">Utah</option>
			<option value="VT">Vermont</option>
			<option value="VA">Virginia</option>
			<option value="WA">Washington</option>
			<option value="WV">West Virginia</option>
			<option value="WI">Wisconsin</option>
			<option value="WY">Wyoming</option>
		</select>
		Zip Code: <input type="text" name="zipCode"><br>
		Gender:
			<input type="radio" name="gender" value="male">   Male
			<input type="radio" name="gender" value="female">   Female
			<input type="radio" name="gender" value="other">   Other <br>
 -->		<input type="submit" value="Register">
	</form>

</body>
</html>