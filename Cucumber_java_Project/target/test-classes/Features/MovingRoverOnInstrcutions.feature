Feature: Rover movement

  Scenario Outline: Rover moves from start_position, start_direction to end_position, end_direction
    Given the rover is initialised with position <startX>, <startY> and direction <start_Direction>
    When the rover receives the command <command>
    Then the rover's position should be <endX>, <endY> and  <end_Direction>

    Examples:
      | startX |startY | start_Direction | command    |endX |endY | end_Direction|
      | 1      |  2    | N               | LMLMLMLMM  | 1   |  3  | N            |
      | 3      |  3    | E               | MMRMMRMRRM | 5   | 1   | E            |
      