/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package edu.wpi.first.team811.Modes;

import edu.wpi.first.team811.*;
import edu.wpi.first.team811.subsystems.*;

/**
 *
 * @author Saswat
 */
public class OperatorControl extends Mode {

    //<editor-fold defaultstate="collapsed" desc="StartUp">
    public OperatorControl(Team811Robot tr) {
        super(tr);
    }
    
    /*public OperatorControl(Devices dev, Configuration config, Watchdog wd) {
        super(dev, config, wd);
    }*/
    //</editor-fold>
    
    /**
     * Runs when robot is started
     */
    public void runOnce() {
        drivetrain = new DriveTrain(tr);
        visionss = new VisionSS(tr);
    }
    
    /**  
     * Runs once when operator control is enabled
     */
    public void init() {
        
    }
    
    /**
     * Runs continuously while operator control is enabled
     */
    public void execute() {
        //drivetrain.execute(null);
        visionss.logic(null);
    }
    
    /**
     * Runs once operator control is disabled
     */
    public void disable() {
        
    }
    
    SubSystem drivetrain;
    SubSystem visionss;
}
