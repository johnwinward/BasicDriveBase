/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5401.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5401.robot.RobotMap;
import org.usfirst.frc.team5401.robot.commands.XboxMove;
import edu.wpi.first.wpilibj.VictorSP;


public class DriveBase extends Subsystem {
	
	private VictorSP leftMotor;
	private VictorSP rightMotor;
	
	public DriveBase(){
		leftMotor = new VictorSP(RobotMap.LEFT_MOTOR);	
		rightMotor = new VictorSP(RobotMap.RIGHT_MOTOR);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new XboxMove());
	}	
	
	public void drive(double leftDesired, double rightDesired) {
		leftMotor.set(leftDesired);
		rightMotor.set(rightDesired);		
	}
		
	public void stop() {
		leftMotor.set(0);
		rightMotor.set(0);
	}
}
