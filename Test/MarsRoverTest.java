import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MarsRoverTest {
	MarsRover marsRover;
	
	@Before
	public void SetUp()
	{
		marsRover= new MarsRover();
	}


	@Test
	public void AskForInitialPosition_returnsZeroZero() {

		assertPosition( 0, 0,marsRover.PositionX, marsRover.PositionY);
	}

	@Test
	public void SendForwardCommand_returnsOneStepForward(){
		marsRover.commands("f");

		assertPosition( 1, 0,marsRover.PositionX, marsRover.PositionY);
	}
	
	
	@Test
	public void SendBackwardCommand_returnsOneStepBackward(){
		marsRover.PositionX=1;
		marsRover.commands("b");

		assertPosition( 0, 0,marsRover.PositionX, marsRover.PositionY);
	}
	
	@Test
	public void SendTurnRightCommand_returnsTurnToRightOne(){

		marsRover.commands("r");
		assertEquals("E",marsRover.Direction);
		assertPosition( 0, 0,marsRover.PositionX, marsRover.PositionY);
	}
	@Test
	public void SendTurnLeftCommand_returnsTurnToLeftOne(){

		marsRover.commands("l");
		assertEquals(marsRover.Direction, "W");
		assertPosition( 0, 0,marsRover.PositionX, marsRover.PositionY);
	}
	@Test
	public void SendForwardAndBackwardCommand_returnsTheInitialPosition(){
		marsRover.commands("fb");

		assertPosition( 0, 0,marsRover.PositionX, marsRover.PositionY);
	}
	@Test
	public void SendTwoForwardCommand_returnsTwoStepForward(){
		marsRover.commands("ff");

		assertPosition( 2, 0,marsRover.PositionX, marsRover.PositionY);
	}
	@Test
	public void TurnToTheRightFourTimes_returnsTheInitialDirection(){
		marsRover.commands("rrrr");
		assertEquals(marsRover.Direction, "N");
	}
	private void assertPosition(int ExpectedX, int ExpectedY,int PositionX, int PositionY) {
		assertEquals(ExpectedX, PositionX);
		assertEquals(ExpectedY,PositionY);
	}

}
