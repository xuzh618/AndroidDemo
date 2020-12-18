package com.tiger.myapplication.http;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetExample {

    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Okhttp main()");


        GetExample getExample = new GetExample();
        String response = getExample.run("https://link.bi.sensetime.com/sl/v2/company");


        System.out.println("response=" + response);
    }

}
