package upload.firbase.com.firebaseuploadexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Huma on 6/10/2018.
 */

public class Splash extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        this.overridePendingTransition(R.anim.left,
                R.anim.right);
        this.overridePendingTransition(R.anim.right,
                R.anim.left);


        final ImageView iv = (ImageView) findViewById(R.id.imageView);
        final ImageView iv2 = (ImageView) findViewById(R.id.bowler);
        final ImageView iv3 = (ImageView) findViewById(R.id.scrutinizer);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
        final Animation an3 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.left);
        final Animation an4 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.right);
        final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_out);


        iv.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                iv3.startAnimation(an3);
                iv2.startAnimation(an3);

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                iv.startAnimation(an2);

                finish();
                Intent i = new Intent(getBaseContext(), SliderActivity.class);
                startActivity(i);


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}