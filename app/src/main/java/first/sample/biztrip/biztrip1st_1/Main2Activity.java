package first.sample.biztrip.biztrip1st_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClickButton2(View view) {

        Toast.makeText(this, "Welcom!", Toast.LENGTH_LONG).show();
    }
}
