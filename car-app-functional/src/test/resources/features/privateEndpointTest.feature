Feature: Testing private endpoint

  Scenario: the client calls "private/status"
    When  the client calls "private/status" and happy case scenario
    Then the client receives a status code of 200
    And the client receives a body of "OK"
    And the client receives a header of "x-sky-request-id"


