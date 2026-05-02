package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private DcMotor intakeMotor;
    public void init (HardwareMap hwMap) {
        intakeMotor = hwMap.get(DcMotor.class, "Intake");

        intakeMotor.setDirection(DcMotor.Direction.REVERSE);
        intakeMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }
    /*
    //Intake based on triggers
    public void intake (double intakeSpeed) {
        if (intakeSpeed >= 0.3) {
            intakeMotor.setPower(1.0);
        }
        else if (intakeSpeed <= -0.3) {
            intakeMotor.setPower(-1.0);
        }
        else {
            intakeMotor.setPower(0.0);
        }
    }

     */
    public void intake (boolean intake, boolean reverse) {
        if (intake) {
            intakeMotor.setPower(1.0);
        } else if (reverse) {
            intakeMotor.setPower(-1.0);
        }
        else {
            intakeMotor.setPower(0.0);
        }
    }
}
