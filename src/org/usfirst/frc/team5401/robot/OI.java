/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5401.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static final double leftStickDeadZone = 0; //change for dead zone
	
	public final Joystick leftStick = new Joystick(RobotMap.CONTROLLER_LEFT_STICK);
	
	public double axis(){
		double raw = leftStick.getX();
		if (raw <= leftStickDeadZone){
			return 0.0;
		}
		else{
			return raw;
		}
	}
	public double trigger(){   //trigger method
		
	}
}
