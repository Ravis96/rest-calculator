# rest-calculator
A simple calculator written with Spring Web 4fun.

## Requirement
Java 17+.

## Mappings
*http://localhost:8080/add/{number}* - Adding value to result. <br>
*http://localhost:8080/subtract/{number}* - Subtracting value to result. <br>
*http://localhost:8080/multiply/{number}* - Multiplying value to result. <br>
*http://localhost:8080/divide/{number}* - Dividing value to result. <br>
*http://localhost:8080/reset* - Setting result to 0. <br>

Every request return JSON with result and mathematical operation.
