package org.firstinspires.ftc.teamcode.mechanisms;

import com.pedropathing.ivy.Command;
import org.jetbrains.annotations.NotNull;
import dev.nextftc.robot.Mechanism;
import dev.nextftc.robot.Telemetry;

public class Drivetrain implements Mechanism {
  // TODO: Add member variables
  public Drivetrain() {
    // TODO: Setup hardware
    Telemetry.log("Setup Drivetrain mechanism");
  }

  @Override
  public void periodic() {}

  @NotNull
  @Override
  public Command getDefaultCommand() {
    return driveWithSticks();
  }

  // TODO: Implement more Command generating methods as needed using instant and infinite
  public Command driveWithSticks() {
    // TODO: Fill in details here!!
    return infinite(() -> {});
  }
}
