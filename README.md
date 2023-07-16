# rest-calculator
A simple calculator written with Spring Web 4fun.

## Requirement
Java 17+.

## Mappings
*http://localhost:8080/add/{number}* - Adding result by value. <br>
*http://localhost:8080/subtract/{number}* - Subtracting result by value. <br>
*http://localhost:8080/multiply/{number}* - Multiplying result by value. <br>
*http://localhost:8080/divide/{number}* - Dividing result by value. <br>
*http://localhost:8080/reset* - Setting result to 0. <br>

Every request return JSON with result and mathematical operation.
