Feature: Demo.nopcommerce search founcnality
  Background: http://demo.nopcommerce.com
@SmokeTest1
  Scenario Outline: user enter categories name in search filed
    Given user already on Homepage
   # When I click on search box
    When I enter "<categories name>" on search box
    When I click on search button
    Then I can see all  "<categories list>" on page

    Examples:
      |categories name                                            |categories list|
      |Custom T-Shirt                                             |All Books appear on page|
      |Levi's 511 Jeans                                           |All computer appear on page|
      |Nike Tailwind Loose Short-Sleeve Running Shirt             |All Apparel&shoes  appear on page|
      |Oversized Women T-Shirt                                    |All Electronics  appear on page|


