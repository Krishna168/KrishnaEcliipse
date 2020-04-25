Feature: Validating AddPlace API

Scenario: Verify if the place has been added successfuly using the AddPlace API
Given The AddPlace Payload
When User calls the "AddPlaceAPI" with the POST http method
Then The Response should be Success with Status code should be 200
And Confirm the "status" field in response should be "OK"
And Confirm the "scope" field in response should be "APP"

