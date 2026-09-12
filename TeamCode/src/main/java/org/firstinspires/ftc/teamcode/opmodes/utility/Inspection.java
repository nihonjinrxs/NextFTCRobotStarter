package org.firstinspires.ftc.teamcode.opmodes.utility;

import org.firstinspires.ftc.teamcode.NovaPyraRobot;

import dev.nextftc.robot.Telemetry;
import dev.nextftc.robot.opmode.NextOpMode;
import dev.nextftc.robot.opmode.NextUtility;

@NextUtility(name = "Inspection",
        description = "Prepares the robot for inspection")
public class Inspection extends NextOpMode {
    public Inspection(NovaPyraRobot robot) { super(robot); }

    @Override
    public void periodic() {
        Telemetry.log("Status", "Running");
    }
}
