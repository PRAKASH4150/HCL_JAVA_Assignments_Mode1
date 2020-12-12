package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.appexception.ApplicationException;
import com.dao.SignUpDao;
import com.model.SignUp;

@Service
public class SignUpValidationImpl implements SignUpValidation{
	
	@Autowired
	private SignUpDao signUpDaoImpl;

	public void validateSignUpPage(SignUp signUp) throws ApplicationException {
		
		if(signUp.getAccountHolderName()==null || signUp.getAccountNumber()==null || signUp.getBankName()==null || signUp.getEmailAddress()==null||
		   signUp.getPassword()==null ||signUp.getConfirmPassword()==null)
		{
			throw new ApplicationException("Fields cannot be empty");
		}
		
		if(signUp.getAccountHolderName().length()<4)
		{
			throw new ApplicationException("Please enter your full name");
		}
		else if(signUp.getAccountNumber().length()<9)
		{
			throw new ApplicationException("Please enter a valid account number");
		}
		else if(!(signUp.getPassword().equals(signUp.getConfirmPassword())))
		{
			throw new ApplicationException("Passwords are not the same");
		}
		else if(isPasswordNotStrong(signUp.getPassword()))
		{
			throw new ApplicationException("Password is not strong");
		}
		else if(signUpDaoImpl.doesAccountExists(signUp))
		{
			throw new ApplicationException("Account already exists. Please try with other mail-id");
		}
		else
		{
			signUpDaoImpl.createAccount(signUp);
		}
	}

	public boolean isPasswordNotStrong(String password)
	{
		if(password.length()<8)
		{
			return true;
		}
		else
		{
			int captialLetterCount=0;
			int smallLetterCount=0;
			int numberCount=0;
			int specialCharacterCount=0;
			
			for(int i=0;i<password.length();i++)
			{
				if(password.charAt(i)>='A' && password.charAt(i)<='Z')
				{
					captialLetterCount++;
				}
				else if(password.charAt(i)>='a' && password.charAt(i)<='z')
				{
					smallLetterCount++;
				}
				else if(password.charAt(i)>='0' && password.charAt(i)<='9')
				{
					numberCount++;
				}
				else if(password.charAt(i)=='!'||password.charAt(i)=='@'||password.charAt(i)=='#'||password.charAt(i)=='$'||
						password.charAt(i)=='%'||password.charAt(i)=='&')
				{
					specialCharacterCount++;
				}
			}
			
			if(captialLetterCount< 1 || smallLetterCount< 1|| numberCount<1 || specialCharacterCount< 1 )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
