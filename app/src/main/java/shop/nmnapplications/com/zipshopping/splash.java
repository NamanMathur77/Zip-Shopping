package shop.nmnapplications.com.zipshopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    private TextView tv ;
    private ImageView iv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tv=(TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.transition);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);


        Timer time=new Timer();
        time.schedule(new TimerTask(){
            @Override
            public void run()
            {
                Intent in;
                in = new Intent(splash.this,MainActivity.class);
                startActivity(in);
                finish();

            }
        },2000);

    }
}
