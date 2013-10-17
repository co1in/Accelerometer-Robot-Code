
package com.nashobarobotics.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.nashobarobotics.templates.commands.DriveCommand;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveSubsystem extends Subsystem 
{
    private CANJaguar[] jag;
    private RobotDrive robotDrive;
    
    public void initDefaultCommand()
    {
        jag = new CANJaguar[4];
        robotDrive = new RobotDrive(jag[0], jag[1], jag[2], jag[3]);
        for(int i = 0; i < 4; i++)
        {
            try
            {
                jag[i] = new CANJaguar(i+1);
            }
            catch(CANTimeoutException e)
            {
                System.out.println("Error creating jaguars");
            }
        }
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DriveCommand());
    }
    
    public void driveMecanum(float x, float y, float z)
    {
        SmartDashboard.putNumber("X: ", x);
        SmartDashboard.putNumber("Y: ", y);
        SmartDashboard.putNumber("Z: ", z);
    }
}

