package pl.edu.agh.kt.demowifi;


import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class settings_page2 extends Fragment {


    private LayoutInflater menuInflater;

    public static settings_page2 newInstance() {
        settings_page2 fragment = new settings_page2();
        return fragment;
    }

    public settings_page2() {
    }

    Button open;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.settings_page2, container, false);
        open = (Button) rootView.findViewById(R.id.open);
        open.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                final Intent intent = new Intent(Intent.ACTION_MAIN, null);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                final ComponentName cn = new ComponentName("com.android.settings", "com.android.settings.wifi.WifiSettings");
                intent.setComponent(cn);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }


        });
        return rootView;
    }

}
