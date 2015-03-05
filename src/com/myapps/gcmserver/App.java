package com.myapps.gcmserver;

import com.myapps.gcmserver.model.Content;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Sending POST to GCM");
        String apiKey = "AIzaSyC9F_FQSJUCUculhqgOiP6NfBeRcb8najY";// Android api key.
        Content content = createContent();
        POST2GCM.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();
        // Registration id from the GCM server
        c.addRegId("APA91bGgpNVuffM9__eU5pOHl43Tpcj45DrZzi86f-O9GT62SlZAQUnt5Asy1MCczV_xfEQB4Tb6Z0B8t8_bf4iV3Hdw3IOY6nyY8owtRwHRV-AB_U5sjVROQaVl7bAp1wB4OT8QWxfkDZIAtZpUuMfx6sbru2b7fQ");
        c.createData("Test Title", "Test Message");
        return c;
    }
}
