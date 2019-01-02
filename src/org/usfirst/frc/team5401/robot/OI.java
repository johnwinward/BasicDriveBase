/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5401.robot;

import edu.wpi.first.wpilibj.AnalogTrigger;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static final double leftStickThreshold = 0.25; //change for dead zone
	public static final double rightTriggerDeadZone = 0; //trigger dead zone? not sure if needed
	
	public final XboxController driver = new XboxController(RobotMap.DRIVER_CONTROLLER);
	//public final Joystick leftStick = new Joystick(RobotMap.CONTROLLER_LEFT_STICK);
	//public final AnalogTrigger rightTrigger = new AnalogTrigger(RobotMap.CONTROLLER_RIGHT_TRIGGER);
	
	public double leftStickAxis(GenericHID.Hand kleft){
		double raw = driver.getX();
		if (Math.abs(raw) <= leftStickThreshold){
			return 0.0;
		}
		else{
			return raw; //might not be raw, might be 1 or -1
		}
	}
	public double triggerAxis(GenericHID.Hand kright){
		double triggerValue = driver.getTriggerAxis(kright);
		if (triggerValue <= rightTriggerDeadZone){ //might not be needed
			return 0.0;			
		}
		else{
			return triggerValue;
		}
		
	}
}
