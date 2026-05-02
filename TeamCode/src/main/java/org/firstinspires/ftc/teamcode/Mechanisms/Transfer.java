package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Transfer {
    private DcMotor transfer;
    public void init(HardwareMap hwMap) {
        transfer = hwMap.get(DcMotor.class, "transfer_motor");

        transfer.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        transfer.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }
    public void transfer (double transferSpeed) {
        transfer.setPower(transferSpeed );
    }
}
