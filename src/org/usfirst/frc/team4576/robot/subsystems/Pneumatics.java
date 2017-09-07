package org.usfirst.frc.team4576.robot.subsystems;

import org.usfirst.frc.team4576.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem {

	public Pneumatics() {
		s0 = new Solenoid(RobotMap.SOLENOID_0);
		s1 = new Solenoid(RobotMap.SOLENOID_1);
		s2 = new Solenoid(RobotMap.SOLENOID_2);
		
		sv0 = new Solenoid(RobotMap.SOLENOID_SV0);
		sv1 = new Solenoid(RobotMap.SOLENOID_SV1);
		sv2 = new Solenoid(RobotMap.SOLENOID_SV2);
	}

	private Compressor c;
	
	private Solenoid s0,s1,s2;
	private Solenoid sv0,sv1,sv2;
	
	protected void initDefaultCommand() {
		c = new Compressor();
	}

	public void setAutoEnabled() {

		c.setClosedLoopControl(true);
	}
/*
	// Shifting
	public void setShift(boolean closed) {
		s0.set(closed);
	}

	public void shiftUp() {
		s0.set(true);

	}

	public void shiftDown() {
		s0.set(false);
	}
*/
	//SOLENOID 0
	public void setSolenoid0(boolean closed) {
		s0.set(closed);
	}

	public void solenoidS0() {
		s0.set(!s0.get());

	}

	//SOLENOID 1
	public void setSolenoid1(boolean closed) {
		s1.set(closed);
	}

	public void solenoidS1() {
		s1.set(!s1.get());

	}
	//SOLENOID 2
	public void setSolenoid2(boolean closed) {
		s2.set(closed);
	}

	public void solenoidS2() {
		s2.set(!s2.get());

	}
	//SPRINKLER VALVE SOLENOID 0
	public void setSolenoidSV0(boolean closed) {
		sv0.set(closed);
	}

	public void solenoidSV0() {
		sv0.set(!sv0.get());

	}

	//SPRINKLER VALVE SOLENOID 1
	public void setSolenoidSV1(boolean closed) {
		sv1.set(closed);
	}

	public void solenoidSV1() {
		sv1.set(!sv1.get());

	}

	
	//SPRINKLER VALVE SOLENOID 2
	public void setSolenoidSV2(boolean closed) {
		sv2.set(closed);
	}

	public void solenoidSV2() {
		sv2.set(!sv2.get());

	}

	// Compressor Toggle
/*	public void toggleComp() {
		if (c.enabled())
			c.stop();
		else
			c.start();
	}
*/
	public void startComp() {
		c.start();
	}
	public void stopComp() {
		c.stop();
	}
	public void reset() {
		s0.set(false);
		s1.set(false);
		s2.set(false);
		sv0.set(false);
		sv1.set(false);
		sv2.set(false);
		
	}
}
