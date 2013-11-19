import java.util.Arrays;
import java.util.List;


public class MarsRover {

	private List<String> directions= Arrays.asList("N","E","S","W","N");
	String Direction="N";
	int PositionX=0;
	int PositionY=0;
	
	public void commands(String command)
	{
		String[] commands= command.split("");
		for(String singleCommand: commands)
		{
			switch (singleCommand) {
			case "f":
				PositionX++;
				break;
			case "b":
				PositionX--;
				break;
			case "r":
				TurnRight();
				break;
			case "l":
				TurnLeft();
				break;
			}
		}
	}
	
	private void TurnRight()
	{
	Direction=directions.get(directions.indexOf(Direction)+1);
	}
	private void TurnLeft()
	{
	Direction=directions.get(directions.lastIndexOf(Direction)-1);
	}
}
