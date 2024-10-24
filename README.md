# README

**Student name**: Isidora Erakovic  
**Lab**: Lab 1 - Calculating your grade with TDD

## Activities completed
- Implemented the grade calculation logic in `Calculation` class, which includes calculating the final grade based on lab points and exam scores.
- Added logic for handling bonus points if lab points exceed 50, and ensured the final exam grade is adjusted accordingly.
- Implemented rounding logic based on lab points:
  - If lab points are less than 25, the final grade rounds down.
  - If lab points are between 25 and 40, the final grade rounds normally.
  - If lab points exceed 40, the final grade rounds up.
- Developed a complete set of unit tests using JUnit to cover:
  - Valid scenarios where students pass and receive different grades.
  - Scenarios where students receive **cum laude** for grades above 30.
  - Tests for invalid inputs (e.g., exam scores outside the valid range or negative lab points).
  - Tests to ensure proper exception handling when a student fails or when invalid input is provided.
  - Rounding behavior testing for different lab points to ensure correctness.
- Other requirements:
  - Used TDD by creating tests for every scenario before implementing the function.
  - Refactored regularly by using auxiliary functions and keeping each function under 10 lines of code.

## Problems and Incomplete Activities
- NONE

## AI Usage Declaration
- Asked AI to help me structure the report and correct grammatical mistakes.

## Additional Comments
- The lab helped me practice TDD by writing tests first and then coding to pass them. This made it easier to handle the rounding logic and catch mistakes early. It was a useful way to ensure the code worked as expected.

## Points claimed
- +1 lab point for the coding dojo (07.10.)
- +1 lab point for the report
- +2 lab points for the basic assignment
- +1 lab point for Kahoot (09.10.)
- **Total: 5 points**
