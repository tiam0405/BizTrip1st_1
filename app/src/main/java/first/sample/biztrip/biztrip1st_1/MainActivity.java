package first.sample.biztrip.biztrip1st_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View v) {


        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
        //Toast.makeText(this, "Hello!", Toast.LENGTH_LONG).show();

    }



}
