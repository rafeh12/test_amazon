Feature:

  Scenario: user logs in with invalid credentials

    Given as a user I am on Amazon.co.uk
    When user click Sign-in button
    Then i enter In  valid username and In valid password
    And I am logged in unsuccessfully
