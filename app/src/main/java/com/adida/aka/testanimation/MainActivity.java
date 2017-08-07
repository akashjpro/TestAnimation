package com.adida.aka.testanimation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mIvDown, mIvRotate, mIvSide;
    private Button mBtDown, mBtSide;
    ObjectAnimator mObDown, mObRotate, mObSide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mIvDown = (ImageView) findViewById(R.id.iv_down);
        mIvRotate = (ImageView) findViewById(R.id.iv_rotate);
        mIvSide   = (ImageView) findViewById(R.id.iv_side);
        mBtDown   = (Button) findViewById(R.id.btn_down);
        mBtSide   = (Button) findViewById(R.id.btn_side);
    }

    public void down(View view) {
        mObDown = ObjectAnimator.ofFloat(mIvDown, "translationY", 0f, 900f);
        mObDown.setDuration(4000);
        mObDown.start();
    }

    public void side(View view) {
        mObSide = ObjectAnimator.ofFloat(mIvSide, "translationX", 0f, 100f);
        mObSide.setDuration(2500);
        mObSide.setRepeatCount(ValueAnimator.INFINITE);
        mObSide.start();
    }

    public void rotate(View view) {
        mObRotate = ObjectAnimator.ofFloat(mIvRotate, "rotation", 0f, 360f);
        mObRotate.setDuration(2000);
        mObRotate.setStartDelay(1000);
        mObRotate.start();
    }
}
