package com.example.daniel.alarmclockapp;

import android.content.ClipData;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Tino on 02/05/2016.
 */
public class maths extends AppCompatActivity {
    TextView textout;
    String letter;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maths);

        findViewById(R.id.txt_maths_2).setOnLongClickListener(longListen);
        findViewById(R.id.txt_maths_5).setOnLongClickListener(longListen);
        findViewById(R.id.txt_maths_7).setOnLongClickListener(longListen);
        findViewById(R.id.txt_maths_times).setOnLongClickListener(longListen);
        findViewById(R.id.txt_maths_plus).setOnLongClickListener(longListen);
        findViewById(R.id.txtA1).setOnDragListener(dragListen1);
        findViewById(R.id.txtA2).setOnDragListener(dragListen2);
        findViewById(R.id.txtA3).setOnDragListener(dragListen3);
        findViewById(R.id.txtA4).setOnDragListener(dragListen4);
        findViewById(R.id.txtA5).setOnDragListener(dragListen5);

    }

    public void clearBoxes(View view) {
        letter = "";
        textout = (TextView) findViewById(R.id.txtA1);
        TextView textout2 = (TextView) findViewById(R.id.txtA2);
        TextView textout3 = (TextView) findViewById(R.id.txtA3);
        TextView textout4 = (TextView) findViewById(R.id.txtA4);
        TextView textout5 = (TextView) findViewById(R.id.txtA5);


        if((textout != null || !textout.getText().equals(""))
                && (textout2 != null || !textout2.getText().equals(""))
                && (textout3 != null || !textout3.getText().equals(""))
                && (textout4 != null || !textout4.getText().equals(""))
                && (textout5 != null || !textout5.getText().equals(""))
                ) {
            textout.setText(letter);
            textout2.setText(letter);
            textout3.setText(letter);
            textout4.setText(letter);
            textout5.setText(letter);
            Toast.makeText(getApplicationContext(), "Cleared",Toast.LENGTH_SHORT).show();
        }
    }

    public void back1(View view) {
        letter = "";
        textout = (TextView) findViewById(R.id.txtA1);
        TextView textout2 = (TextView) findViewById(R.id.txtA2);
        TextView textout3 = (TextView) findViewById(R.id.txtA3);
        TextView textout4 = (TextView) findViewById(R.id.txtA4);
        TextView textout5 = (TextView) findViewById(R.id.txtA5);

        if((textout != null || !textout.getText().equals("")) && (textout2 == null || textout2.getText().equals(""))){
            textout.setText(letter);
        }
        if((textout != null || !textout.getText().equals("")) && (textout2 != null || !textout2.getText().equals(""))  && (textout3 == null || textout3.getText().equals(""))){
            textout2.setText(letter);
        }
        if((textout != null || !textout.getText().equals("")) && (textout2 != null || !textout2.getText().equals(""))  && (textout3 != null || !textout3.getText().equals(""))
                && (textout4 == null || textout4.getText().equals("")) ){
            textout3.setText(letter);
        }
        if((textout != null || !textout.getText().equals("")) && (textout2 != null || !textout2.getText().equals(""))  && (textout3 != null || !textout3.getText().equals(""))
                && (textout4 != null || !textout4.getText().equals("")) && (textout5 == null || textout5.getText().equals("")) ){
            textout4.setText(letter);
        }
        if((textout != null || !textout.getText().equals("")) && (textout2 != null || !textout2.getText().equals(""))  && (textout3 != null || !textout3.getText().equals(""))
                && (textout4 != null || !textout4.getText().equals("")) && (textout5 != null || !textout5.getText().equals("")) ){
            textout5.setText(letter);
        }
    }

    View.OnLongClickListener longListen = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            DragShadow dragShadow = new DragShadow(v);
            ClipData data = ClipData.newPlainText("", "");
            v.startDrag(data, dragShadow, v, 0);
            return false;
        }
    };

    View.OnDragListener dragListen1 = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.i("Drag Event", "Entered");
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("Drag Event", "Exited");
                    break;
                case DragEvent.ACTION_DROP:
                    TextView target = (TextView) v;
                    TextView dragged = (TextView) event.getLocalState();
                    target.setText(dragged.getText());

                    break;
            }

            return true;
        }
    };

    View.OnDragListener dragListen2 = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.i("Drag Event", "Entered");
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("Drag Event", "Exited");
                    break;
                case DragEvent.ACTION_DROP:
                    TextView target = (TextView) v;
                    TextView dragged = (TextView) event.getLocalState();
                    target.setText(dragged.getText());

                    break;
            }

            return true;
        }
    };

    View.OnDragListener dragListen3 = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.i("Drag Event", "Entered");
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("Drag Event", "Exited");
                    break;
                case DragEvent.ACTION_DROP:
                    TextView target = (TextView) v;
                    TextView dragged = (TextView) event.getLocalState();
                    target.setText(dragged.getText());

                    break;
            }

            return true;
        }
    };

    View.OnDragListener dragListen4 = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.i("Drag Event", "Entered");
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("Drag Event", "Exited");
                    break;
                case DragEvent.ACTION_DROP:
                    TextView target = (TextView) v;
                    TextView dragged = (TextView) event.getLocalState();
                    target.setText(dragged.getText());

                    break;
            }

            return true;
        }
    };

    View.OnDragListener dragListen5 = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.i("Drag Event", "Entered");
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("Drag Event", "Exited");
                    break;
                case DragEvent.ACTION_DROP:
                    TextView target = (TextView) v;
                    TextView dragged = (TextView) event.getLocalState();
                    target.setText(dragged.getText());

                    break;
            }

            return true;
        }
    };

    private class DragShadow extends View.DragShadowBuilder {
        ColorDrawable geryBox;


        public DragShadow(View view) {
            super(view);
            geryBox = new ColorDrawable(Color.LTGRAY);
        }

        /*public DragShadow() {
            super();
        }*/

        @Override
        public void onDrawShadow(Canvas canvas) {
            geryBox.draw(canvas);

        }

        @Override
        public void onProvideShadowMetrics(Point shadowSize, Point shadowTouchPoint) {
            View v = getView();
            int height = 150;
            int width = 150;

            geryBox.setBounds(0, 0, width, height);
            shadowSize.set(width, height);
            shadowTouchPoint.set(width/2, height/2);
        }
    }
}
