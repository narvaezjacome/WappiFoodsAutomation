Feature: order
  As quality control automation
  I want to request an order
  To validate the purchase order

  Background: logged
    Given That Daniel join Wappi
    When He enter the credentials
      | user     | password |
      | UserTest | PassTest |

  Scenario: the user wants to request an order

    When he click order a product
    Then he can see the order was placed 13/09/2022 Aceite de Girasol $20,000.00 $2,000.00 Premier Tr. 13 #12-34 No

