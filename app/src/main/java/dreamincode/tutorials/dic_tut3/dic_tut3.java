package dreamincode.tutorials.dic_tut3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.CheckBox;

public class dic_tut3 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView sv = new ScrollView(this);
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        sv.addView(ll);
        
        TextView tv = new TextView(this);
        tv.setText("Dynamic layouts ftw!");
        ll.addView(tv);
        
        EditText et = new EditText(this);
        et.setText("weeeeeeeeeee~!");
        ll.addView(et);
        
        Button b = new Button(this);
        b.setText("I don't do anything, but I was added dynamically. :)");
        ll.addView(b);
        for(int i = 0; i < 20; i++) {
        CheckBox cb = new CheckBox(this);
        cb.setText("I'm dynamic!");
        ll.addView(cb);
        }
        this.setContentView(sv);
    }
}