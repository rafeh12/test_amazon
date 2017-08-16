Feature:

Scenario: user logs in with valid credentials

  Given as a user I am on Amazon.co.uk
  When user click Sign-in button
  Then i enter username ans password
  And I am logged in successfully
