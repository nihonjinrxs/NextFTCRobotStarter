package org.firstinspires.ftc.teamcode.lib;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.generated.BuildConstants;

public class BuildDataUtilities {
  public static void logSoftwareBuild(Telemetry telemetry) {
    telemetry.addLine("Starting FTC Team 25619 Robot Software");
    String buildData = String.format("%s:%s build %s%s%s (%s)", BuildConstants.MAVEN_GROUP, BuildConstants.MAVEN_NAME,
        BuildConstants.GIT_SHA, BuildConstants.DIRTY > 0 ? "-dirty" : "",
        !BuildConstants.GIT_BRANCH.equals("main") ? String.format(" (%s)", BuildConstants.GIT_BRANCH) : "",
        BuildConstants.BUILD_DATE
    );
    telemetry.addLine(buildData);
  }
}
