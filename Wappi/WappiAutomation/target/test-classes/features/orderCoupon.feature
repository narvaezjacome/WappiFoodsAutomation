Feature: orderCoupon
  As quality control automation
  I want to use welcome coupon
  To validate the purchase order with coupon

  Background: logged
    Given That Daniel join Wappi
    When He enter the credentials
      | user     | password |
      | UserTest | PassTest |


  Scenario: he user wants to use coupon in an order

    When he claim him welcome coupon
    And he click order a product for add coupon
    Then he can see the order was placed 13/09/2022 Aceite de Girasol $20,000.00 $2,000.00 Premier Tr. 13 #12-34 Si