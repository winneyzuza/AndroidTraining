package winney.co.th.myexchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import winney.co.th.myexchange.fragment.MainFragment;

public class MainActivity extends AppCompatActivity { // สร้างคน

    @Override
    protected void onCreate(Bundle savedInstanceState) {// savedInstanceState  ทำหน้าที่เก็บความคืบหน้าของโปรแกรม
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment to Activity

        if(savedInstanceState == null){ //เปิดครั้งแรก
            getSupportFragmentManager().beginTransaction()
                .add(R.id.contentMainFragment, new MainFragment())
                .commit();// ต้องจำ
        }

    }//Main Method



} //Main Class
