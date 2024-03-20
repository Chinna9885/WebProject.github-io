<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PortManagementSystem/title>
</head>
 <style>
     
        form{
            display: block;
            box-sizing: border-box;
            padding: 40px;
            width: 100%;
            height: 100%;
            backdrop-filter:brightness(40%);
            flex-direction: column;
            display: flex;
            gap: 5px;
           }
     input{
          background:rgba(255,255,255,0.3) ;
            height: 40px;
            line-height: 40px;
            border-radius: 20px;
            border: none;
            margin-bottom: 20px;
            color: white;
     } 
     .AirportData{
           border: 1px solid black; 
           width: 400px;
           height: 500px;
           margin:auto;
           color: white;
           border-radius: 40px;
           box-shadow: 0px 0px 20px rgba(0,0,0,0.75);
           background-size:cover;
           background-position: center;
           overflow: hidden;
        }
          label{
            color: rgba(255,255,255,0.3);
            text-transform: uppercase;
            font-size: 10px;
            letter-spacing: 2px;
            padding-left: 10px;
        }
        #submit{
          
          background: rgba(45,126,231);
            height: 40px;
            line-height: 40px;
            border-radius: 40px;
            border: none;
            margin: 10px 10px;
            box-shadow: 0px 0px 5px rgba(0,0,0,0.3);
            color: white;
            font-size: 12px;
            text-transform: uppercase;
        }
        body{
           background-image: url('https://i0.wp.com/demishia.com/wp-content/uploads/2018/04/admin-login-background-images-8.jpg?ssl=1');
            background-repeat: no-repeat;
        }
     
 </style>
<body>
<div class="AirportData">
 
  <form action="pmm" method="post">
	 
	  <label>Port Name</label>
	  <input type="text" name="PName" >
	  <label> Port Location</label>
	  <input type="text" name="PLoc" >
	  <label>Number of stands</label>
	  <input type="number" name="NoofStands">
	  <label> Number of Boats</label>
	 <input type="number" name="NoOfBoats">
	  <input type="submit" id="submit" value="Submit">
	 
  </form>
  </div>
  <h1 style="color:red">${Response}</h1>

</body>
</html>
