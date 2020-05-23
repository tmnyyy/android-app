package com.itstep.fourapplication.ex_013_notification_add_responsibileties;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;
import com.itstep.fourapplication.ex_012_notification_example.SecondActivity;


public class NotificationActivity extends Activity {

    private final int NOTIFICATION_ID = 127;
    private NotificationManager manager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_013_notification_layout);

        manager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
    }

    public void showNotification(View view) {

        Notification.Builder builder = new Notification.Builder(getApplicationContext());

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);

        builder.setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.ic_launcher_round)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher_round))
                .setTicker("New notification")
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setContentTitle("Notification")
                .setContentText("Press that you want to know a secret")
                .setProgress(100, 50, true);

        Notification notification = builder.build();
        notification.defaults =  Notification.DEFAULT_VIBRATE;
       notification.sound = Uri.parse("android.resource://"+ getPackageName()+ "/" + R.raw.sound_laser);
//
//        long[] vibrate = {1500, 1000, 1500, 1000};
//        notification.vibrate = vibrate;
        notification.flags = notification.flags | Notification.FLAG_ONGOING_EVENT;
        //Notification.FLAG_INSISTENT;

        manager.notify(NOTIFICATION_ID, notification);
    }

    public void cancelNotification(View view) {
        manager.cancel(NOTIFICATION_ID);
    }

}
