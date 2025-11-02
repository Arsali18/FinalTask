Feature: Booking Ticket Scenario

  Scenario: User can booking ticket successfully
    Given user is on the dashboard page
    When user set departure airport
    And user select departure airport
    And user set destination airport
    And user select destination airport
    And user sets departure date
    And user click button Search
    Then user navigate is navigated to result page
    When user select ticket
    Then user navigate is navigated to customer information page