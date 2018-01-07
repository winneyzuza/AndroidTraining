package winney.co.th.myexchange.utility;

import android.content.Context;
import android.os.AsyncTask;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

/**
 * Created by Dell on 1/7/2018.
 */
                                               // url, progress, result
public class MyGetRateFromAPI extends AsyncTask<String, Void, String>{

    private Context context;

    public MyGetRateFromAPI(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... strings) { // ทำงานอัตโนมัติ แต่ถ้าไม่มี Internet จะ error
        try { // เวลาใช้ thread ต้องใช้ try catch เสมอ

            OkHttpClient okHttpClient = new OkHttpClient();

            Request.Builder builder = new Request.Builder();

            Request request = builder.url(strings[0]).build();

            Response response = okHttpClient.newCall(request).execute();

            return response.body().toString();


        } catch (Exception e) {
            e.printStackTrace();;
            return null;
        }
    }



    //https://api.fixer.io/latest?symbols=THB&base=USD

    //{"base":"USD","date":"2018-01-05","rates":{"THB":32.19}}




}// Main Class
