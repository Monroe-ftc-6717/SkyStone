package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class MyFirstOpMode extends OpMode {

    DcMotor fl, fr, bl, br;
    private static double[] Direction = {0,0}; // Forward/Backward 0, Left/Right 1
    private static double Turn = 0;

    @Override
    public void init() {
        fl = hardwareMap.dcMotor.get("Front Left");
        fr = hardwareMap.dcMotor.get("Front Right");
        bl = hardwareMap.dcMotor.get("Back Left");
        br = hardwareMap.dcMotor.get("Back Right");
    }

    @Override
    public void loop() {
        Controls(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x, /*gamepad1.right_stick_y, */
                gamepad2.left_stick_x, gamepad2.left_stick_y, gamepad2.right_stick_x, gamepad2.right_stick_y);

        //TODO Test and implement directional movement
        fl.setPower(1);
        fr.setPower(1);
        bl.setPower(-1);
        br.setPower(-1);
    }

    public static void Controls(double Lx1, double Ly1, double rx1,/* double ry1,*/ double Lx2, double Ly2, double rx2, double ry2){
        Direction[1] = Lx1;
        Direction[0] = Ly1;
        Turn = rx1;
    }

    /*public static float distance2time(float distance){ // Centimeters, assuming 3m/s      ----- For Automation -----
        float time = 0;                                                                                              |
                                                                                                                     |
        distance /= 100; // Now in meters                                                                            |
                                                                                                                     |
                                                                                                                     |
        return time;                                                                                                 |
    }                                                                                       ----- For Automation -----                */

}
