@SauceDemo
  Feature: SauceDemo check test case

    @AllEmpty
    Scenario Outline: Empty Username and Empty Password
      Given User at home page
      When Click login button
      Then Check "<error>" message about username
      Examples:
        | error                |  |
        | Username is required |  |


    @EmptyPassword
    Scenario Outline:
      Given User at home page
      When write "<username>" for username field
      When Click login button
      Then "<error>" message about password
      Examples:
        | username | error                |
        | abcdef   | Password is required |


    @EmptyUsernme
    Scenario Outline:
      Given User at home page
      When write "<password>" for password field
      When Click login button
      Then Check "<error>" message about username
      Examples:
        | password | error                |
        | 123456   | Username is required |


    @CorrectUsernameFalsePassword
    Scenario Outline:
      Given User at home page
      When write correct "<username>" for username field
      When write false"<password>" for password field
      When Click login button
      Then Check "<error>" message about matching
      Examples:
        | username      | password | error                                                                     |
        | standard_user | 12345    | Epic sadface: Username and password do not match any user in this service |


    @FalseUsernameCorrectPassword
    Scenario Outline:
      Given User at home page
      When write false "<username>" for username field
      When write correct "<password>" for password field
      When Click login button
      Then Check "<error>" message about matching
      Examples:
        | username | password | error |  |
        | benben   |   secret_sauce       |  Epic sadface: Username and password do not match any user in this service     |  |


    @CorrectLogin
    Scenario Outline:
      Given User at home page
      When write correct "<username>" for username field
      When write correct "<password>" for password field
      When Click login button
      Examples:
        | username | password |
        |  standard_user       |   secret_sauce       |


