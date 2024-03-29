
package com.nashobarobotics.templates.commands;

import com.nashobarobotics.templates.RobotTemplate;
import edu.wpi.first.wpilibj.command.Command;
/**
 *
 * @author bradmiller
 */
public class DriveCommand extends Command {

    public DriveCommand() 
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        float[] values = RobotTemplate.network.getAccelerometerValues();
        RobotTemplate.drive.driveMecanum(values[0], values[1], values[2]);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
