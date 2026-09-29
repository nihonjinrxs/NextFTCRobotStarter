package org.firstinspires.ftc.teamcode.opmodes.utility;

import org.firstinspires.ftc.teamcode.NovaPyraRobot;
import org.firstinspires.ftc.teamcode.lib.BuildDataUtilities;
import dev.nextftc.robot.Telemetry;
import dev.nextftc.robot.opmode.NextOpMode;
import dev.nextftc.robot.opmode.NextUtility;

@NextUtility(name = "System Test", description = "Runs a system test to ensure Mechanisms are expected to work properly")
public class SystemTest extends NextOpMode {
  public SystemTest(NovaPyraRobot robot) {
    super(robot);
    BuildDataUtilities.logSoftwareBuild(telemetry);
  }

  /**
   * Called repeatedly, while the Driver Station is in INIT.
   */
  @Override
  public void disabledPeriodic() {}

  /**
   * Called once, right after the PLAY button is pressed.
   */
  @Override
  public void start() {}

  /**
   * Called repeatedly, while the OpMode is running.
   */
  @Override
  public void periodic() {
    Telemetry.log("Status", "Running");
  }

  /**
   * Called once, when the OpMode finishes.
   */
  @Override
  public void end() {}
}
