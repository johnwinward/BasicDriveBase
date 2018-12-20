/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5401.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5401.robot.RobotMap;

import edu.wpi.first.wpilibj.PWMSpeedController;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveBase extends Subsystem {
	//This does something
	private VictorSP leftMotor;
	private VictorSP rightMotor;
	
	public DriveBase(){
		
		leftMotor = new VictorSP(RobotMap.LEFT_MOTOR);
		rightMotor = new VictorSP(RobotMap.RIGHT_MOTOR);
	}
	
	public void drive(double leftDesiredSpeed, double rightDesiredSpeed) {
		
		leftMotor.set(leftDesiredSpeed);
		rightMotor.set(rightDesiredSpeed);
	}
	//drive command
		
	public void stop() {
		leftMotor.set(0);
		rightMotor.set(0);
	}
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		//default command for xboxmove XD
		setDefaultCommand(new XboxMove());
		
		
	
	}
}
