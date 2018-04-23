package com.example.scanqr;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.net.HttpURLConnection;
import java.net.URL;

public class Main2Activity extends Activity {
    private Button scanButton;
    private TextView resultText;
    private String GUID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultText = (TextView) findViewById(R.id.result_text);

        //scan button
        scanButton = (Button) findViewById(R.id.scan_button);
        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scannerIntent = new Intent(Main2Activity.this, QRScannerActivity.class);
                startActivityForResult(scannerIntent, 1);
            }
        });
    }

    private void sendGUID() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String url = "http://60.205.201.102:8081/userLogin/user/updateGUID?guid=" + GUID;

                try {
                    URL postURL = new URL(url);
                    HttpURLConnection connection = (HttpURLConnection) postURL.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(6 * 1000);
                    connection.getResponseCode();
                    connection.disconnect();
                } catch (Exception e) {
                    Log.e("URL error", "Malformed URLException caught : " + e);
                }
            }
        }).start();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    GUID = data.getStringExtra("scanner_result");
                    sendGUID();
                    resultText.setText(GUID);
                    Toast.makeText(Main2Activity.this, "GUID已经发送到服务器", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                Toast.makeText(Main2Activity.this, "发生了未知错误", Toast.LENGTH_SHORT).show();
        }
    }
}