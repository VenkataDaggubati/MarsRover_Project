package StepDefinitions;




import CommonUtility.MoveAndChangeDirectionOfRover;
import CommonUtility.NewRover;
import CommonUtility.rover;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class FacingAndPositionRover {
	
	rover Rover;
	MoveAndChangeDirectionOfRover roverdirection;
	NewRover newRover; 

	
    @Given("^the rover is initialised with position (.+) and direction (.+)$")
    public void initialiseRover(int x, int y, String direction) {
    	Rover.setPosition(1, 2, 'N');
    	
    	
    }

    @When("^the rover receives the command (.+)$")
    public void receiveCommand(String command) {
    	Rover.moveRover("LMLMLMLMM");
    	roverdirection.turnRight(newRover);
    	roverdirection.turnRight(newRover);
    	roverdirection.moveForward(newRover);
    }

    @Then("^the rover's position should be (.+) and direction (.+)$")
    public void checkPosition(int x, int y, String direction) {
    	Rover.printPosition(Rover);
    	System.out.println(x+""+y+""+direction);
    	
	
	}		
}