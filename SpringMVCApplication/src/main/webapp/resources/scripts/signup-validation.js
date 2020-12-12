function validateDetails() {
	var accHolderName = document.getElementById("accHolderName").value;
	var accNumber = document.getElementById("accNumber").value;
	var emailAddress = document.getElementById("email").value;
	var password = document.getElementById("password").value;
	var cnfPassword = document.getElementById("cnfPassword").value;
    
	if(accHolderName==null || accNumber==null || emailAddress==null || password==null || cnfPassword==null)
    {
		swal({
			title : "Oops!!",
			text : "Fields cannot be empty",
			icon : "error"
		});
		return false;
		
    }
	if (accHolderName.length < 4) {
		swal({
			title : "Oops!!",
			text : "Please enter your full name",
			icon : "error"
		});
		return false;
	}
	if (Number.isInteger(parseInt(accNumber)) != true) {
		swal({
			title : "Oops!!",
			text : "Please enter only numbers in this field",
			icon : "error"
		});
		return false;
	}

	if (accNumber.length < 8) {
		swal({
			title : "Oops!!",
			text : "Please enter a valid account number",
			icon : "error"
		});
		return false;
	}
	if(password!=cnfPassword)
	{
		swal({
			title : "Oops!!",
			text : "Passwords are not same",
			icon : "error"
		});
		return false;
	}
	
	if(checkPasswordStrength(password))
	{
		swal({
			title : "Oops!!",
			text : "Passwords is not strong enough",
			icon : "error"
		});
		return false;
	}

}

function checkPasswordStrength(password)
{
	if(password.length<8)
		{
		  return true;
		}
	else
	{
		var capitalLetterCount=0;
		var smallLetterCount=0;
		var numbersCount=0;
		var specialCharCount=0;
		
		for(i=0;i<password.length;i++)
		{
			if(password.charAt(i)>='A' && password.charAt(i)<='Z')
			 {
				capitalLetterCount++;
			 }
			else if(password.charAt(i)>='a' && password.charAt(i)<='z')
			{
				 smallLetterCount++;	
			}
			else if(password.charAt(i)>=0 && password.charAt(i)<=9)
			{
				numbersCount++;
			}
			else if(password.charAt(i)=='!'||password.charAt(i)=='@'||password.charAt(i)=='#'||password.charAt(i)=='$'||password.charAt(i)=='%'||password.charAt(i)=='&')
			{
				specialCharCount++;
			}
		}
		
		if(capitalLetterCount<1 || smallLetterCount<1 || numbersCount<1 || specialCharCount<1)
		{
			return true;
		}
	}
}

