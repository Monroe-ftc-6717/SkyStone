package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;


// import java.text.SimpleDateFormat;
// import java.util.Date;

@TeleOp
public class MyFirstOpMode extends OpMode {

    DcMotor fl, fr, bl, br;
    float x1 = gamepad1.left_stick_x, x2 = gamepad2.left_stick_x,
          y1 = gamepad1.left_stick_x, y2 = gamepad2.left_stick_y;

    private final ElapsedTime runtime = new ElapsedTime();

    @Override
    public void init() { telemetry.addData("Status", "Initialized");

        fl = hardwareMap.dcMotor.get("l1");
        fr = hardwareMap.dcMotor.get("r1");
        bl = hardwareMap.dcMotor.get("l2");
        br = hardwareMap.dcMotor.get("r2");

    }



    /*
     * Code to run when the op mode is first enabled goes here
     * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#start()
     */
    @Override
    public void init_loop() {
    }

    /*
     * This method will be called ONCE when start is pressed
     * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#loop()
     */
    @Override
    public void start() {
        runtime.reset();
    }

    /*
     * This method will be called repeatedly in a loop
     * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#loop()
     */
    @Override
    public void loop() { telemetry.addData("Status", "Run Time: " + runtime.toString());

        if(x1>=1){
            horizontal(x1);
        }
        if(y1>=1){
            vertical(y1);
        }


    }

    public void horizontal(float x) {
        //TODO motor directional
    }
    public void vertical(float x) {
        //TODO motor directional
    }
}
