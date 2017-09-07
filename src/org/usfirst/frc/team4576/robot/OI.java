package org.usfirst.frc.team4576.robot;

import org.usfirst.frc.team4576.robot.commands.Barrel1;
import org.usfirst.frc.team4576.robot.commands.Barrel2;
import org.usfirst.frc.team4576.robot.commands.Barrel3;
import org.usfirst.frc.team4576.robot.commands.Reload;
import org.usfirst.frc.team4576.robot.commands.ToggleCompressor;
//import org.usfirst.frc.team4576.robot.commands.ToggleFlashlight;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

// Button Values:
//
// 1: A
// 2: B
// 3: X
// 4: Y
// 5: Left Bumper
// 6: Right Bumper
// 7: Back
// 8: Start
// 9: Left Joystick pressed down
// 10: Right Joystick pressed down
//
//
// Axis values:
//
// 1 - LeftX
// 2 - LeftY
// 3 - Triggers (Each trigger = 0 to 1, axis value = right - left)
// 4 - RightX
// 5 - RightY
// 6 - DPad Left/Right
public class OI {
	Button dsA = new JoystickButton(Robot.driveStick, 1);
	Button dsB = new JoystickButton(Robot.driveStick, 2);
	Button dsX = new JoystickButton(Robot.driveStick, 3);
	Button dsY = new JoystickButton(Robot.driveStick, 4);

	Button dsLPRESS = new JoystickButton(Robot.driveStick, 9);
	Button dsRPRESS = new JoystickButton(Robot.driveStick,10);
	
	public OI() {
		dsLPRESS.whenPressed(new ToggleCompressor(false));
		dsRPRESS.whenPressed(new ToggleCompressor(true));
		
		dsY.whenPressed(new Reload());
		dsX.whenPressed(new Barrel1());
		dsA.whenPressed(new Barrel2());
		dsB.whenPressed(new Barrel3());
	


	}
}