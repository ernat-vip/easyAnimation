package com.azamirdev.easyanimation;

import android.content.Context;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class EasyAnimation {
    Context context;
    public EasyAnimation(Context context){
        this.context=context;
        Log.d("EASY","ANIMATION");
        //Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(),R.anim.move);
    }

    public Animation get_Push_Up_Out(){
        return AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.push_up_out);
    }
}
