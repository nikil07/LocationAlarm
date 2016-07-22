package androidworks.nikhil.locationalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Nikhil on 21-Jul-16.
 */
public class DestinationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d("nikhil","inside broadcastr");
    }
}
