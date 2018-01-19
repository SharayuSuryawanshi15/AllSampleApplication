package com.v2team.allsampleapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

public class PhoneCallStateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        /*Bundle bundle = intent.getExtras();
        if(bundle != null){
            String state = bundle.getString(TelephonyManager.EXTRA_STATE);
            Log.w("PhoneCallStateReceiver","EXTRA_STATE"+state);
            if(state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_RINGING)){
                String phoneNumber = bundle.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.w("PhoneCallStateReceiver","EXTRA_INCOMING_NUMBER"+phoneNumber);

            }
        }*/

        Bundle extras = intent.getExtras();
        if (extras != null) {
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            Log.w("MY_DEBUG_TAG", state);
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                String phoneNumber = extras
                        .getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.w("MY_DEBUG_TAG", phoneNumber);
            }
        }

    }
}
