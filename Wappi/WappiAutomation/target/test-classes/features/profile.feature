Feature: profile
  As quality control automation
  I want to request an order
  To validate the purchase order

  Background: logged
    Given That Daniel join Wappi
    When He enter the credentials
      | user     | password |
      | UserTest | PassTest |

  Scenario: user update information

    When  add new information
      | Name     | Surname      | DateOfBirth |
      | UserTest | LastUserTest | 01/25/1993    |

    Then he can see the updated information