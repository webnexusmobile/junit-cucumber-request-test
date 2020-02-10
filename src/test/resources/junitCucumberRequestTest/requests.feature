Feature: Requests

  Scenario: I can send a GET request
    When I send a GET request
    Then I see response status 200