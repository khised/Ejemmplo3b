package alberto.aguado.ejemmplo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("estados","6- Estoy en el metodo Destroy");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("estados", "4- Estoy en el metodo stop");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("estados", "6- Estoy en el metodo pause");
    }
    @Override
    protected void onStart() {
        super.onStart();
   ;
        Log.e("estados", "1- Estoy en el metodo start");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}