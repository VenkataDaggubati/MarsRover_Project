package StepDefinitions;

import CommonUtility.MoveAndChangeDirectionOfRover;
import CommonUtility.NewRover;
import CommonUtility.rover;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RoverMoveOnInstructions {
	
	rover Rover;
	MoveAndChangeDirectionOfRover roverdirection;
	NewRover newRover; 
	
	@Given("^the rover is initialised with position (.+) and direction (.+)$")
    public void initialiseRover(int x, int y, String direction) {
		
		Rover.setPosition(1,2, 'N');
		Rover.setPosition(3,3, 'E');
    }
	
	@When("^the rover receives the command (.+)$")
    public void receiveCommand(String command) {
		Rover.moveRover("LMLMLMLMM");
		Rover.moveRover("MMRMMRMRRM");
		
		roverdirection.turnRight(newRover);
    	roverdirection.turnRight(newRover);
    	roverdirection.moveForward(newRover);
		
	}
	
		@Then("^the rover's position should be (.+) and direction (.+)$")
	    public void checkPositionScenarioOutline(int x, int y, String direction) {
			Rover.printPosition(Rover);
			System.out.println(x+""+y+""+direction);
	    	
		}
		
		public void testRoverMovement(int startX, int startY, String start_Direction, String command, int endX, int endY, String end_Direction ) {
			initialiseRover(startX, startY,start_Direction);
			receiveCommand(command);
			checkPositionScenarioOutline(endX, endY, end_Direction);
	    }
		
    }

