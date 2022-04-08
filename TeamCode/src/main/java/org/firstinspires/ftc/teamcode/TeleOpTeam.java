package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
@TeleOp(name= "TeleOpTeam", group= "Linear Opmode")
public class TeleOpTeam extends LinearOpMode {
    DcMotor motorLeft;
    DcMotor motorRight;
    Servo servo1;
    ColorSensor color1;
    DistanceSensor distance1;

    @Override
    public void runOpMode() {
        motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
        motorRight = hardwareMap.get(DcMotor.class, "motorRight");
        servo1 = hardwareMap.get(Servo.class, "servo1");
        color1 = hardwareMap.get(ColorSensor.class, "color1");
        distance1 = hardwareMap.get(DistanceSensor.class, "distance1");
        // Put initialization blocks here
        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        // Put run blocks here
        motorLeft.setPower(1);
        motorRight.setPower(1);
        sleep(1500);
        motorLeft.setPower(0);
        motorRight.setPower(0);
        while (opModeIsActive()) {
            // Put loop blocks here
        }
    }

}
