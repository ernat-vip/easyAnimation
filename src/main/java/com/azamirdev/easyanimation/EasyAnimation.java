package com.azamirdev.easyanimation;

import android.content.Context;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class EasyAnimation {
    public static int DURRATION_NORMAL = 500;
    public static int DURRATION_FAST = 200;
    public static int DURRATION_SLOW = 900;
    public static int REPEATE_MODE_INFINITY = -1;
    public static int REPEATE_MODE_RESTART = 1;
    Context context;
    public EasyAnimation(Context context){
        this.context=context;
        Log.d("EASY","ANIMATION");
    }
/*
* *SLIDE ANIMATION
 */

    public Animation get_Slide_Top_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.slide_top_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Slide_Top_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.slide_top_out);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Slide_From_Rid_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.slide_from_rid_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Slide_To_Rid_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.slide_to_rid_out);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Slide_From_Left_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.slide_from_left_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Slide_To_Left_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.slide_to_left_out);
        animation.setDuration(duration);
        return animation;
    }
    /*
    **FLIP ANIMATION
     */
    public Animation get_Flip_2_Center_Horizontal_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.flip_2_center_horizontal_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Flip_2_Center_Horizontal_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.flip_2_center_horizontal_out);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Flip_Center_Horizontal_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.flip_center_horizontal_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Flip_Center_Horizontal_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.flip_center_horizontal_out);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Flip_Center_Vertical_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.flip_center_vertical_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Flip_Center_Vertical_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.flip_center_vertical_out);
        animation.setDuration(duration);
        return animation;
    }
    /*
     **ALPHA ANIMATION
     */
    public Animation get_Alpha_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.alpha_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Alpha_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.alpha_out);
        animation.setDuration(duration);
        return animation;
    }
    /*
     **ROTATE ANIMATION
     */
    public Animation get_Rotate_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.rotate_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Rotate_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.rotate_out);
        animation.setDuration(duration);
        return animation;
    }
    /*
     **DECREASE/INCREASE ANIMATION
     */
    public Animation get_Increase_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.increase_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Increase_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.increase_out);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Increase_Different(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.increase_different);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Decrease_Different(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.decrease_different);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Decrease_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.decrease_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Decrease_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.decrease_out);
        animation.setDuration(duration);
        return animation;
    }
    /*
     **PULL ANIMATION
     */
    public Animation get_Pull_Bot_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.pull_bot_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Pull_Bot_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.pull_bot_out);
        animation.setDuration(duration);
        return animation;
    }
    /*
     **TURN ANIMATION
     */
    public Animation get_Turn_From_Rid_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.turn_from_rid_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Turn_From_Rid_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.turn_from_rid_out);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Turn_From_Left_In(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.turn_from_left_in);
        animation.setDuration(duration);
        return animation;
    }
    public Animation get_Turn_From_Left_Out(int duration){
        Animation animation = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.turn_from_left_out);
        animation.setDuration(duration);
        return animation;
    }
    //other test


}
