Feature: Validating AddPlace API

Scenario Outline: Verify if the place has been added successfuly using the AddPlace API
Given The AddPlace Payload with "<name>" "<language>" "<address>"
When User calls the "AddPlaceAPI" with the "POST" http method
Then The Response should be Success with Status code should be 200
And Confirm the "status" field in response should be "OK"
And Confirm the "scope" field in response should be "APP"

Examples:
|name|language|address|
|Krishna1|Marathi|No.10, Wall Street, Mexico|
|hari1|Gujarathi|No.55, Goodword shipping appartment,Singapore|