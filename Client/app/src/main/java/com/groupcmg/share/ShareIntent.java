package com.groupcmg.share;

import android.content.Context;
import android.content.Intent;

import com.groupcmg.easymobileplatform.R;

public class ShareIntent {
    public static void ShareText(Context context, String theText){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, theText);
        sendIntent.setType("text/plain");
        context.startActivity(sendIntent);
    }
}
