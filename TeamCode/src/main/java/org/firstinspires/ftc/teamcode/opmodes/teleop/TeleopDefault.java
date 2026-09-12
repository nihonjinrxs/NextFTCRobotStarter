package org.firstinspires.ftc.teamcode.opmodes.teleop;

import org.firstinspires.ftc.teamcode.NovaPyraRobot;

import dev.nextftc.robot.Telemetry;
import dev.nextftc.robot.opmode.NextOpMode;
import dev.nextftc.robot.opmode.NextTeleop;

@NextTeleop(name = "TeleOp Default", group = "Competition")
public class TeleopDefault extends NextOpMode {
    public TeleopDefault(NovaPyraRobot robot) { super(robot); }

    @Override
    public void periodic() {
        Telemetry.log("Status", "Running");
    }
}
