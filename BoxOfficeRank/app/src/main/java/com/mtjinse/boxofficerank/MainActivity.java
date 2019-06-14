package com.mtjinse.boxofficerank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
//http://www.kobis.or.kr/kobisopenapi/homepg/main/main.do
public class MainActivity extends AppCompatActivity {
    final String BASE_URL = "http://www.kobis.or.kr";
    Retrofit retrofit;
    BoxOfficeService boxOfficeService;
    TextView testText;
    RecyclerView boxoffice_recycler;

    String API_KEY = "aaecf1e767fc3c72f21874a5f19649f5";

    List<WeeklyBoxOfficeList> weeklyBoxOfficeLists = new ArrayList<>();
    BoxOfficeAdapter boxOfficeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boxoffice_recycler= findViewById(R.id.boxoffice_recycler);

        //Retrofit 객체생성
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    /*addConverterFactory(GsonConverterFactory.create())은
    Json을 우리가 원하는 형태로 만들어주는 Gson라이브러리와 Retrofit2에 연결하는 코드입니다 */

        boxOfficeService = retrofit.create(BoxOfficeService.class);

        boxOfficeService.getBoxOffice(API_KEY, "20190608").enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                if (response.isSuccessful()){
                    Log.d("retro", 1+"");
                    Result result = response.body();
                    BoxOfficeResult boxOfficeResult = result.getBoxOfficeResult();
                   List<WeeklyBoxOfficeList> weeklyBoxOfficeListLIst2 = boxOfficeResult.getWeeklyBoxOfficeList();
                   for (WeeklyBoxOfficeList weeklyBoxOffice : weeklyBoxOfficeListLIst2){
                       weeklyBoxOfficeLists.add(weeklyBoxOffice);
                   }

                   boxOfficeAdapter = new BoxOfficeAdapter(weeklyBoxOfficeLists, MainActivity.this);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
                    boxoffice_recycler.setLayoutManager(linearLayoutManager);
                    boxoffice_recycler.setAdapter(boxOfficeAdapter);
                }else{
                    Log.d("retro", 2+"Error");
                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

    }
}
