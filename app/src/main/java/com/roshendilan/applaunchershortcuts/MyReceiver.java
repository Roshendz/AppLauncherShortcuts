package com.roshendilan.applaunchershortcuts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Roshen Dilan on 2022-01-02.
 */
public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = MainActivity.TAG;

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive: " + intent);
        if (Intent.ACTION_LOCALE_CHANGED.equals(intent.getAction())) {
            // Refresh all shortcut to update the labels.
            // (Right now shortcut labels don't contain localized strings though.)
            new ShortcutHelper(context).refreshShortcuts(/*force=*/ true);
        }
    }
}
