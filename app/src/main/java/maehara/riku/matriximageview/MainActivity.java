package maehara.riku.matriximageview;

import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    Matrix matrix;
    final float mRotate=30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.mipmap.ic_launcher);
        matrix = new Matrix();
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                matrix.postRotate(mRotate, imageView.getDrawable().getBounds().width()/2,
                        imageView.getDrawable().getBounds().height()/2);

                imageView.setImageMatrix(matrix);
            }
        });
    }
}
