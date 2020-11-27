function validateInput()
{
	var participantName=document.getElementById("name").value;
	var dob=document.getElementById("dob").value;
	var gender=document.getElementById("gender").value;
	var collegeName=document.getElementById("college").value;
	var registrationNumber=document.getElementById("regNumber").value;
	var branch=document.getElementById("branch").value;
	var year=document.getElementById("year").value;
	var event=document.getElementById("event").value;
    var contactNumber=document.getElementById("number").value;
    
    if(participantName.length < 4)
    {
    	swal({
            title: "Oops!!",
            text: "Please enter a valid name",
            icon: "error"
            });
     return false;
    }
    if(isNaN(parseInt(registrationNumber)))
    {
    	swal({
            title: "Oops!!",
            text: "Please Enter only numbers in the RegisterNumber field",
            icon: "error"
            });
     return false;
    }
     if(registrationNumber.length < 6)
    {
    	swal({
            title: "Oops!!",
            text: "Invalid Registration Number",
            icon: "error"
            });
     return false;
    }
    if(isNaN(parseInt(contactNumber)))
    {
    	swal({
            title: "Oops!!",
            text: "Please Enter only numbers in the contactNumber field",
            icon: "error"
            });
     return false;
    }
    if(contactNumber.length!=10)
    {
    	swal({
            title: "Oops!!",
            text: "Invalid Mobile Number",
            icon: "error"
            });
    	return false;
    }
    else
    {
    	swal({
            title: "Success!!!",
            text: "You will be redirected to MyHCL website",
            icon: "success"
            });
    	return true;
    	}
    }