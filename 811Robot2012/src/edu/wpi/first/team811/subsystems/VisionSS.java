/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.team811.subsystems;

import edu.wpi.first.team811.SubSystem;
import edu.wpi.first.team811.Team811Robot;

/**
 *
 * @author saswat
 */
public class VisionSS extends SubSystem {

    public VisionSS(Team811Robot teamrobot) {
        super(teamrobot);
    }
    
    public String ID() {
        return "VisionSS";
    }

    public void logic(Object param) {
        d.ac.freshImage();
    }
}
