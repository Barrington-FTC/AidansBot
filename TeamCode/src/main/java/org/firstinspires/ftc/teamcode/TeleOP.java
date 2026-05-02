package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.Mechanisms.Flywheel;
import org.firstinspires.ftc.teamcode.Mechanisms.Intake;
import org.firstinspires.ftc.teamcode.Mechanisms.MecanumDrive;
import org.firstinspires.ftc.teamcode.Mechanisms.Transfer;

@TeleOp
public class TeleOP extends OpMode {
    MecanumDrive mecanumDrive = new MecanumDrive();
    Intake intake = new Intake();
    Flywheel flywheel = new Flywheel();
    Transfer transfer = new Transfer();
    @Override
    public void init() {
        mecanumDrive.init(hardwareMap);
        intake.init(hardwareMap);
        flywheel.init(hardwareMap);
        transfer.init(hardwareMap);
    }

    @Override
    public void loop() {
        ////Driving Code:
        //Assigning Variables
        double forward = gamepad1.left_stick_y;
        double strafe = -gamepad1.left_stick_x;
        double rotate = gamepad1.right_stick_x;
        //Actual Driving
        mecanumDrive.drive(forward, strafe, rotate);

        ////Intake Code
        //Assigning Variables
        boolean in_take = gamepad1.right_bumper;
        boolean reverse = gamepad1.left_bumper;
        //Actual Intake
        intake.intake(in_take, reverse);
        /*
        //Based on triggers
        //Assigning Variables
        double intakeSpeed = gamepad1.right_trigger - gamepad1.left_trigger;

        //Actual Intake
        intake.intake(intakeSpeed);
         */

        ////Flywheel Code
        //Assigning Variables
        double flywheelSpeed = gamepad1.right_trigger;

        //Actual Flywheel
        flywheel.shoot(flywheelSpeed);

        ////Transfer Code
        //Assigning Variables
        double transferSpeed = gamepad1.left_trigger;
        transfer.transfer(transferSpeed);
    }
}