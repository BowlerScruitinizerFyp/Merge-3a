package upload.firbase.com.firebaseuploadexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DemoAlertActivity extends AppCompatActivity {

    TextView tv1 ;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_alert);

        String angle = getIntent().getStringExtra("theta");

        tv1 = (TextView) findViewById(R.id.GetTheta);
       tv2 = (TextView) findViewById(R.id.Getresult);

        tv1.setText(getIntent().getStringExtra("theta"));

        Double theta = Double.parseDouble(angle);

        if(theta > 15){

            tv2.setText("Sorry Your angle of Bowling in not legal");

        }


        else if(theta <= 15){

            tv2.setText("Hurray your angle of bowling is legal");

        }


    }
}
