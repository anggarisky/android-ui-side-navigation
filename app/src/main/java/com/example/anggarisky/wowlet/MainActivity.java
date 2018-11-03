package com.example.anggarisky.wowlet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnmenu, exp, msg, so, st, ao;
    RelativeLayout maincontent;
    LinearLayout mainmenu;
    Animation fromtop, frombottom;
    ImageView userpicbig;
    TextView user, country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmenu = (Button) findViewById(R.id.btnmenu);

        exp = (Button) findViewById(R.id.exp);
        msg = (Button) findViewById(R.id.msg);
        so = (Button) findViewById(R.id.so);
        st = (Button) findViewById(R.id.st);
        ao = (Button) findViewById(R.id.ao);

        user = (TextView) findViewById(R.id.user);
        country = (TextView) findViewById(R.id.country);



        userpicbig = (ImageView) findViewById(R.id.userpicbig);




        fromtop = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        maincontent = (RelativeLayout) findViewById(R.id.maincontent);
        mainmenu = (LinearLayout) findViewById(R.id.mainmenu);

        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maincontent.animate().translationX(0);
                mainmenu.animate().translationX(0);

                exp.startAnimation(frombottom);
                msg.startAnimation(frombottom);
                so.startAnimation(frombottom);
                st.startAnimation(frombottom);
                ao.startAnimation(frombottom);


                user.startAnimation(fromtop);
                country.startAnimation(fromtop);
                userpicbig.startAnimation(fromtop);



            }
        });

        maincontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maincontent.animate().translationX(-735);
                mainmenu.animate().translationX(-735);
            }
        });


    }
}
