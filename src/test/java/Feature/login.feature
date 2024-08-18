Feature: Verify all login functionality 

@Reg
Scenario Outline:Verify login with Valid Credential

When User give "<Username>" And "<Password>" as credential
And Hit the login button
Then Verify successful login

Examples:
|Username|Password|
|standard_user|secret_sauce|