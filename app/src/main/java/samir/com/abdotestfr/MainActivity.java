package samir.com.abdotestfr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import samir.com.abdotestfr.Fragments.HomeF;

public class MainActivity extends AppCompatActivity {
LinearLayout linearLayout;
LinearLayout ActivityCOnt;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout=findViewById(R.id.MainFrame);
        ActivityCOnt=findViewById(R.id.Amain);
        textView=findViewById(R.id.TextActiviy);


        getSupportFragmentManager().beginTransaction()
                .add( R.id.MainFrame, new HomeF()).commit();
        linearLayout.setVisibility(View.VISIBLE);
        Bundle bundle=new Bundle();
        bundle=getIntent().getExtras();
        if(bundle!=null){
            String msg=bundle.getString("masg");
            linearLayout.setVisibility(View.GONE);
            ActivityCOnt.setVisibility(View.VISIBLE);
            textView.setText(msg);


        }

    }
}
