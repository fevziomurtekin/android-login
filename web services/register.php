<?PHP
header('Content-Type: text/html; charset=utf-8');
if(isset($_POST['txtName']) && isset($_POST['txtTel'])){
	$con=mysqli_connect("localhost","root","","umutbankasi");
	$txtName = $_POST['txtName'];
	$txtTel = $_POST['txtTel'];
	$txtMajor = $_POST['txtMajor'];

	$result=mysqli_query($con,"insert into uyeler(username, password , email) values('$txtName', '$txtTel', '$txtMajor')");
	if($result){echo "Data Inserted";}
	else{echo "not Inserted";}
	
}
?>

<html>
<head>
<title>Insert Data</title>
</head>
<body>
<h1>Insert Data</h1>
	<form action="<?PHP $_PHP_SELF ?>" method="post">
		Student Name <input type="text" name="txtName" placeholder="Student Name" /> <br/> <br/>
		Tel <input type="text" name="txtTel" placeholder="Tel" /> <br/> <br/>
		Major <input type="text" name="txtMajor" placeholder="Major" /> <br/> <br/>
		<input type="submit" value="Insert" /> <br/>
	</form>
</body>
</html>	