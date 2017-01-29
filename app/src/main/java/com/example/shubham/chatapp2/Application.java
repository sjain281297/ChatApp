package com.example.shubham.chatapp2;

import com.google.firebase.FirebaseApp;

/**
 * Created by shubham on 24/12/16.
 */

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        FirebaseApp.initializeApp(this);
    }
}
