package com.agentworkflow.lab.utils;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;

public class AnimationUtils {
    
    public static void applyFadeIn(Context context, View view) {
        Animation anim = android.view.animation.AnimationUtils.loadAnimation(context, 
            com.agentworkflow.lab.R.anim.fade_in);
        view.startAnimation(anim);
        view.setVisibility(View.VISIBLE);
    }

    public static void applySlideUp(Context context, View view) {
        Animation anim = android.view.animation.AnimationUtils.loadAnimation(context, 
            com.agentworkflow.lab.R.anim.slide_up);
        view.startAnimation(anim);
        view.setVisibility(View.VISIBLE);
    }

    public static void applyZoomIn(Context context, View view) {
        Animation anim = android.view.animation.AnimationUtils.loadAnimation(context, 
            com.agentworkflow.lab.R.anim.zoom_in);
        view.startAnimation(anim);
        view.setVisibility(View.VISIBLE);
    }
}
