package com.example.showapi;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.apache.http.Header;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.show.api.ShowApiRequest;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt = (TextView) this.findViewById(R.id.textView1);
        Button myBtn = (Button) this.findViewById(R.id.button1);
        final AsyncHttpResponseHandler resHandler = new AsyncHttpResponseHandler() {
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable e) {
                //做一些异常处理
                e.printStackTrace();
            }

            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try {
                    long b = System.currentTimeMillis();
                    long a = (Long) txt.getTag();
                    System.out.println("response is :" + new String(responseBody, "utf-8"));
                    System.out.println("used time is :" + (b - a));
                    txt.setText(new String(responseBody, "utf-8") + new Date());
                    //在此对返回内容做处理
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            }
        };
        myBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setTag(System.currentTimeMillis());
                new ShowApiRequest("http://route.showapi.com/341-1", "15872", "e70cb02184704473bcd17f2371f8d8ef")
                        .setResponseHandler(resHandler)
                        .addTextPara("time", "2015-07-10")
                        .addTextPara("maxResult", "3")
                        .post();
            }
        });
    }

}
