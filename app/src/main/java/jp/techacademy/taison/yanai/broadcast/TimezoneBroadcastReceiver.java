package jp.techacademy.taison.yanai.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by taiso on 2017/07/27.
 */

public class TimezoneBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context,"タイムゾーンが変化しました", Toast.LENGTH_LONG).show();
    }
}
