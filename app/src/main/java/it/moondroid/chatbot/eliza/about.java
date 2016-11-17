package it.moondroid.chatbot.eliza;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import it.moondroid.chatbot.R;

/**
 * Created by itlab on 31/3/16.
 */
public class about extends Activity{

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        ImageView rg_fb_logo = (ImageView)findViewById(R.id.rg_fb);
        ImageView sk_fb_logo = (ImageView)findViewById(R.id.sk_fb);
        ImageView st_fb_logo = (ImageView)findViewById(R.id.st_fb);

        ImageView rg_in_logo = (ImageView)findViewById(R.id.rg_in);
        ImageView sk_in_logo = (ImageView)findViewById(R.id.sk_in);
        ImageView st_in_logo = (ImageView)findViewById(R.id.st_in);

        rg_fb_logo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/rushikeshgaidhani"));
                startActivity(intent);
            }
        });


        sk_fb_logo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/shubham.khandare.79"));
                startActivity(intent);
            }
        });


        st_fb_logo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/sagartade"));
                startActivity(intent);
            }
        });

        rg_in_logo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/rushikeshgaidhani"));
                startActivity(intent);
            }
        });

        sk_in_logo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/shubham-khandare-7b592911a"));
                startActivity(intent);
            }
        });

        st_in_logo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/sagartade"));
                startActivity(intent);
            }
        });





    }
}
