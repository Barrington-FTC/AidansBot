package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.Intake;
import org.firstinspires.ftc.teamcode.Mechanisms.MecanumDrive;
@TeleOp
public class TeleOP extends OpMode {
    MecanumDrive mecanumDrive = new MecanumDrive();
    Intake intake = new Intake();

    @Override
    public void init() {
        mecanumDrive.init(hardwareMap);
        intake.init(hardwareMap);

    }

    @Override
    public void loop() {
        ////Driving Code:
        //Assigning Variables
        double forward = -gamepad1.left_stick_x;
        double strafe = -gamepad1.left_stick_y;
        double rotate = gamepad1.right_stick_x;
        //Actual Driving
        mecanumDrive.drive(forward, strafe, rotate);

        ////Intake Code

        //Assigning Variable
        double intakeSpeed = gamepad1.right_trigger - gamepad1.left_trigger;

        //Actual Intake
        intake.intake(intakeSpeed);
    }
}