package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotorEx;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class Flywheel {
    private DcMotorEx flywheelMotor;
    public void init (HardwareMap hwMap) {
        flywheelMotor = hwMap.get(DcMotorEx.class, "flywheel_motor");

        flywheelMotor.setDirection(DcMotorEx.Direction.REVERSE);

        flywheelMotor.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);

        flywheelMotor.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.FLOAT);
    }

    public void shoot (double flywheelSpeed) {
        flywheelMotor.setPower(flywheelSpeed);
    }
}
