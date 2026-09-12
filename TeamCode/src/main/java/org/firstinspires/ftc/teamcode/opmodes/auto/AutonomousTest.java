package org.firstinspires.ftc.teamcode.opmodes.auto;

import org.firstinspires.ftc.teamcode.NovaPyraRobot;

import dev.nextftc.robot.Telemetry;
import dev.nextftc.robot.opmode.NextAutonomous;
import dev.nextftc.robot.opmode.NextOpMode;

@NextAutonomous(name = "Test Auto", group = "Auto Testing", preselectTeleop = "TeleOp Default")
public class AutonomousTest  extends NextOpMode {
    public AutonomousTest(NovaPyraRobot robot) { super(robot); }

    @Override
    public void periodic() {
        Telemetry.log("Status", "Running");
    }
}
