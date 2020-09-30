Feature: To login/Registration into the website and Validate the below things
1. Validate able to register successfully
2. To validate the Email.
3. To Compose and Send email.

@registration
Scenario: Validate Able to register successfully.
Given The login application should be launched
When I click on Sign Up 
And I enter the First name as 'Rohit' 
And I enter the Last name as 'Raman' 
And I enter the e-mail as 'ramanrohit@abc.com' 
And I enter the User as 'ramanrohit' 
And I enter the Pass as 'abc@123' 
And I enter the Confirm password as 'abc@123' 
And I click on Register
Then I validate the User register successfully

@login 
Scenario: To Validate the Email
Given The login application should be launched
When I enter the username as 'ramanrohit' 
And I enter the password as 'abc@123' 
And I click on Login button
Then I validate the Email

@login
Scenario: To compose and send email
Given The login application should be launched
When I enter the username as 'ramanrohit' 
And I enter the password as 'abc@123' 
And I click on Login button
Then I compose and send email


