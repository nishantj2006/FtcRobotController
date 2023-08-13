package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
@TeleOp(name = "testMotors")

public class TestMotors extends LinearOpMode {


    public void runOpMode() throws InterruptedException {
        DcMotor motorBackRight = hardwareMap.dcMotor.get("backLeft");
        DcMotor motorFrontRight = hardwareMap.dcMotor.get("frontLeft");
        DcMotor motorBackLeft = hardwareMap.dcMotor.get("backRight");
        DcMotor motorFrontLeft = hardwareMap.dcMotor.get("frontRight");
        motorBackLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        motorFrontLeft.setDirection(DcMotorSimple.Direction.REVERSE);


        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.a) {
                motorBackLeft.setPower(1);
            } else{
                motorBackLeft.setPower(0);
            }
            if (gamepad1.b) {
                motorBackRight.setPower(1);
            }
            else{
                motorBackRight.setPower(0);
            }
            if (gamepad1.x) {
                motorFrontRight.setPower(1);
            }
            else{
                motorFrontRight.setPower(0);
            }
            if (gamepad1.y) {
                motorFrontLeft.setPower(1);
            }
            else{
                motorFrontLeft.setPower(0);
            }
        }
    }
    }
