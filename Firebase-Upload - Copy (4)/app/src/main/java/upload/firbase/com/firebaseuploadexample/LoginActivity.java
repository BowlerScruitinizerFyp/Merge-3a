package upload.firbase.com.firebaseuploadexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




    }

    //if login button clicked
    public void login(View view) {

        if(findViewById(R.id.UserEmail).equals("admin") && findViewById(R.id.UserPassword).equals("admin")){

            Intent intent = new Intent (LoginActivity.this , DrawerActivity.class);
            startActivity(intent);


        }


        else{

            Intent intent = new Intent (LoginActivity.this , DrawerActivity.class);
            startActivity(intent);


        }

    }
}
