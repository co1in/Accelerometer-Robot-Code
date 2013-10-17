/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nashobarobotics.templates;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class Network
{
    NetworkTable networkTable;
    private float[] values;
    public Network() 
    {
        values = new float[3];
        networkTable = NetworkTable.getTable("accelerometer-values");
    }
    
    public float[] getAccelerometerValues()
    {
        values[0] = (float)networkTable.getNumber("x");
        values[1] = (float)networkTable.getNumber("y");
        values[2] = (float)networkTable.getNumber("z");
        
        return values;
    }
}
