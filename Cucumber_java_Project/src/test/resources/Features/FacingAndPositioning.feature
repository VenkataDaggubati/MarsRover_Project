Feature: Rover direction facing and positioning initialisation

  Scenario: Initialise rover with position (1, 2) and direction North
    Given the rover is initialised with position (1, 2) and direction North
    When the rover receives the command <LMLMLMLMM>
    Then the rover's position should be (1, 3) and direction North

   