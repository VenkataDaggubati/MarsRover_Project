Feature: Moving the rover x and y position and location


  Scenario: Moving the rover in the south direction
    Given the rover is initialised with position (2, 3) and direction South
    When the rover receives the command <RMLMRMLMM>
    Then the rover's position should be (2, 2) and direction South

 