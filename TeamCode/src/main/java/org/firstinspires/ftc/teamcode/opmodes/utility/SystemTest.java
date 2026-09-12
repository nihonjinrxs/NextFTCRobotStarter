package org.firstinspires.ftc.teamcode.opmodes.utility;

import org.firstinspires.ftc.teamcode.NovaPyraRobot;

import dev.nextftc.robot.Telemetry;
import dev.nextftc.robot.opmode.NextOpMode;
import dev.nextftc.robot.opmode.NextUtility;

@NextUtility(name = "System Test",
        description = "Runs a system test to ensure Mechanisms are expected to work properly")
public class SystemTest extends NextOpMode {
    public SystemTest(NovaPyraRobot robot) { super(robot); }

    @Override
    public void periodic() {
        Telemetry.log("Status", "Running");
    }
}
