package org.usfirst.frc.team4576.robot.commands;

import org.usfirst.frc.team4576.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Reload extends Command {
	
public Reload(){
		
		requires(Robot.pneumatics);
        
	}

	protected void initialize() {
		Robot.pneumatics.solenoidS0();
		Robot.pneumatics.solenoidS1();
		Robot.pneumatics.solenoidS2();

		
		// TODO Auto-generated method stub
		
	}

	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}

