<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <h1>University Registration form</h1>
  <p>please fill out the form</p>
  <hr>

  <form>
    <h2>Personal Details </h2>

    <label for="name">First name</label>
    <input type="text" name="name" id="name" placeholder="eg:Arg">
    <br><br>
    <label for="surname">Last name</label>
    <input type="text" name="surname" id="surname"  placeholder="eg:mishra">
    <br><br>

    <label for="dob">Date of Birth</label>
    <input type="Date" name="dob" id="dob">
    <br><br>
    <h3>Gender</h3>
    <label for="male">Male</label>
    <input type="radio" name="gender" id="male" value="male">
    <label for="Female">fale</label>
    <input type="radio" name="gender" id="Female" value="female">
    <label for="Other">Male</label>
    <input type="radio" name="gender" id="Other" value="Other">
    <h3>upload photo</h3>
    <input type="file" name="photo">
    <hr>
    <h2>Contact Info</h2>
    <label for="email">Email Address:-</label>
    <input type="email" name="email" id="email" placeholder="eg:manish@123">
    <br><br>
    <label for="phone">Phone No:-</label>
    <input type="tel" name="phone" id="phone" placeholder="eg:6252628209">
    <br><br>
    <label for="Address">Mailing Address</label>
    <br>
    <textarea name="Address" id="Address" rows="10"column="10"></textarea>
    <hr>
    <h2>Academic Information</h2>
    <label for="course">Select Your Course</label>
    <select name="course" id="corse">
      <option value="cse">cse</option>
      <option value="ECE">ECE</option>
      <option value="EEE">EEE</option>
      option>
      <option value="AI">AI</option>
    </select>

    <br>
    <h3>Extracurricular Activities</h3>
    <label for="sports">sports</label>
    <input type="checkbox" name="interest" id="sports" value="sports">
    <br>
    <label for="music">music</label>
    <input type="checkbox" name="interest" id="music" value="music">
    <br>
    <label for="technology">technology</label>
    <input type="checkbox" name="interest" id="technology" value="volunterings">
    <br>
    <label for="volunterings">volunterings</label>
    <input type="checkbox" name="interest" id="volunterings" value="volunterings">
    <hr>
    <h2>Create Your account</h2>
    <label for="pass">Create passwords</label>
    <input type="password" name="password" id="password"
    <br><br>
    <label for="secu">security answer</label>
    <input type="text" name="security" id="secu">

    <hr>
    <input type="submit" value="register">
    <button type="submit">Register</button>
    <button type="reset">clear form</button>

  </form>
</body>
</html>
