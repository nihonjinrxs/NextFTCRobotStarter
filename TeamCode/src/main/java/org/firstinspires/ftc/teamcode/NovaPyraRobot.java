package org.firstinspires.ftc.teamcode;

import androidx.annotation.NonNull;
import org.firstinspires.ftc.teamcode.mechanisms.Drivetrain;
import java.util.Set;
import dev.nextftc.robot.Mechanism;
import dev.nextftc.robot.NextRobot;

public class NovaPyraRobot implements NextRobot {
  // Declare mechanisms
  private final Set<Mechanism> mechanisms;
  public final Drivetrain drivetrain;

  public NovaPyraRobot() {
    this.drivetrain = new Drivetrain();

    this.mechanisms = Set.of(drivetrain);
  }

  @Override
  public void periodic() {
    // implement periodic activities at the robot level here
  }

  @NonNull
  @Override
  public Set<Mechanism> getMechanisms() {
    return mechanisms;
  }
}
