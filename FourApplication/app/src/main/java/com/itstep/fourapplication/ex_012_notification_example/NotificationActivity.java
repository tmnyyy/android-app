package com.itstep.fourapplication.ex_012_notification_example;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.itstep.fourapplication.R;


public class NotificationActivity extends Activity {

    private final int NOTIFICATION_ID = 127;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_012_notification_layout);
    }

    public void showNotification(View view) {
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Notification.Builder builder = new Notification.Builder(getApplicationContext());

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);

        builder.setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.ic_launcher_round)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher_round))
                .setTicker("New notification")
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(false)
                .setContentTitle("Notification")
                .setContentText("Press that you want know a secret");

        Notification notification = builder.build();

        manager.notify(NOTIFICATION_ID, notification);
    }
}
