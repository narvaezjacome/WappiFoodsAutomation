Feature: login
  As QA Automation
  I want enter credentials in login inputs
  To validate login

  Scenario:Login whit data valid
    Given That Daniel join Wappi
    When He enter the credentials
      | user                  | password    |
      | UserTest              | PassTest   |
    Then the user should see Ofertas