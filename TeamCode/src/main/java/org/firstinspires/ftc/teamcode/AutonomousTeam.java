package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
@Autonomous(name= "AutonomousTeam", group= "Linear Opmode")
public class AutonomousTeam extends LinearOpMode {
    DcMotor motorLeft;
    DcMotor motorRight;
    Servo servo1;
    ColorSensor color1;
    DistanceSensor distance1;

    @Override
    // Square
    public void runOpMode() {
        motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
        motorRight = hardwareMap.get(DcMotor.class, "motorRight");
        servo1 = hardwareMap.get(Servo.class, "servo1");
        color1 = hardwareMap.get(ColorSensor.class, "color1");
        distance1 = hardwareMap.get(DistanceSensor.class, "distance1");
        // Put initialization blocks here
        waitForStart();
        // Put run blocks here
        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorLeft.setPower(0.8);
        motorRight.setPower(0);
        sleep(600);
        motorRight.setDirection(DcMotor.Direction.REVERSE);
        motorLeft.setPower(0);
        motorRight.setPower(0.8);
        sleep(800);
        motorRight.setDirection(DcMotor.Direction.FORWARD);
        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorLeft.setPower(1);
        motorRight.setPower(1);
        sleep(1300);
        motorLeft.setPower(1);
        motorRight.setPower(0);
        sleep(750);
        motorLeft.setPower(1);
        motorRight.setPower(1);
        sleep(600);
        motorLeft.setPower(1);
        motorRight.setPower(0);
        sleep(900);
        motorLeft.setPower(1);
        motorRight.setPower(1);
        sleep(1000);
        motorLeft.setPower(1);
        motorRight.setPower(0);
        sleep(1000);
        motorLeft.setPower(1);
        motorRight.setPower(1);
        sleep(800);
        motorLeft.setPower(0);
        motorRight.setPower(0);
        while (opModeIsActive()) {
            // Put loop blocks here
        }
    }

}

