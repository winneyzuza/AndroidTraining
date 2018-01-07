package winney.co.th.myexchange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import winney.co.th.myexchange.R;

/**
 * Created by Dell on 1/6/2018.
 */

public class MainFragment extends Fragment{

    @Nullable
    @Override

    // method to create mask
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Mask
        View view = inflater.inflate(R.layout.fragment_main, container, false); // การนำ xml(fragment.xml) มาทำงานใน Java
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) { // method หลัก สำหรับสร้าง Activity
        super.onActivityCreated(savedInstanceState);

//        Exchange Controller
        exchangeController();



    }// Main Method

    private void exchangeController() {
        Button button = getView().findViewById(R.id.btnExchange);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Initial View
                EditText editText = getView().findViewById(R.id.edtMoney);

                String moneyString = editText.getText().toString().trim();



                if (moneyString.isEmpty()) {
//                    Have space


                }else{


                }




            } // Onclick
        });
    }


} //main Class
