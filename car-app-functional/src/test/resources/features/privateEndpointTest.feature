Feature: Testing private endpoint

  Scenario: the client calls "private/status"
    When  the client calls "private/status"
    Then teh client receives a status code of 200
    And the client receives a body of "Ok"

