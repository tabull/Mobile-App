package com.example.daniel.alarmclockapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class categories extends AppCompatActivity{
    TextView textout;
    String letter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);
    }

    public void go(View view) {
        letter = "";
        textout = (TextView) findViewById(R.id.L1);
        TextView textout2 = (TextView) findViewById(R.id.L2);
        TextView textout3 = (TextView) findViewById(R.id.L3);
        TextView textout4 = (TextView) findViewById(R.id.L4);
        TextView textout5 = (TextView) findViewById(R.id.L5);
        TextView textout6 = (TextView) findViewById(R.id.L6);
        TextView textout7 = (TextView) findViewById(R.id.L7);

        if(textout.getText().equals("E")
                && textout2.getText().equals("N")
                && textout3.getText().equals("G")
                && textout4.getText().equals("L")
                && textout5.getText().equals("A")
                && textout6.getText().equals("N")
                && textout7.getText().equals("D")
                ) {
            Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, alarmList.class);
            startActivity(intent);

        } else{
            Toast.makeText(getApplicationContext(), "Incorrect",Toast.LENGTH_SHORT).show();
        }
    }

    public void clear(View view) {
        letter = "";
        textout = (TextView) findViewById(R.id.L1);
        TextView textout2 = (TextView) findViewById(R.id.L2);
        TextView textout3 = (TextView) findViewById(R.id.L3);
        TextView textout4 = (TextView) findViewById(R.id.L4);
        TextView textout5 = (TextView) findViewById(R.id.L5);
        TextView textout6 = (TextView) findViewById(R.id.L6);
        TextView textout7 = (TextView) findViewById(R.id.L7);

        if((textout != null || !textout.getText().equals(""))
                && (textout2 != null || !textout2.getText().equals(""))
                && (textout3 != null || !textout3.getText().equals(""))
                && (textout4 != null || !textout4.getText().equals(""))
                && (textout5 != null || !textout5.getText().equals(""))
                && (textout6 != null || !textout6.getText().equals(""))
                && (textout7 != null || !textout7.getText().equals(""))
                ) {
            textout.setText(letter);
            textout2.setText(letter);
            textout3.setText(letter);
            textout4.setText(letter);
            textout5.setText(letter);
            textout6.setText(letter);
            textout7.setText(letter);
            Toast.makeText(getApplicationContext(), "Cleared",Toast.LENGTH_SHORT).show();
        }
    }

    public void click(View view) {
        if( view == findViewById(R.id.K)){
            letter = "K";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "K",Toast.LENGTH_SHORT).show();
            if(textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if(textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if( textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if( textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            }else if( textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            }else if( textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            }else if( textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.D)){
            letter = "D";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "D",Toast.LENGTH_SHORT).show();
            if(textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if(textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if( textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if( textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            }else if( textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            }else if( textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            }else if( textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.E)){
            letter = "E";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "E",Toast.LENGTH_SHORT).show();
            if(textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if(textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if( textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if( textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            }else if( textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            }else if( textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            }else if( textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.space)){
            letter = " ";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "Space",Toast.LENGTH_SHORT).show();
            if(textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if(textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if( textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if( textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            }else if( textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            }else if( textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            }else if( textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.O) || view == findViewById(R.id.LO)) {
            letter = "O";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "O", Toast.LENGTH_SHORT).show();
            if (textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if (textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if (textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if (textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            } else if (textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            } else if (textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            } else if (textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.G)) {
            letter = "G";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "G", Toast.LENGTH_SHORT).show();
            if (textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if (textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if (textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if (textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            } else if (textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            } else if (textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            } else if (textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.C)) {
            letter = "C";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "C", Toast.LENGTH_SHORT).show();
            if (textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if (textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if (textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if (textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            } else if (textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            } else if (textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            } else if (textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.R)) {
            letter = "R";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "R", Toast.LENGTH_SHORT).show();
            if (textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if (textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if (textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if (textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            } else if (textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            } else if (textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            } else if (textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.N) || view == findViewById(R.id.LN) ) {
            letter = "N";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "N", Toast.LENGTH_SHORT).show();
            if (textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if (textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if (textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if (textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            } else if (textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            } else if (textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            } else if (textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.L)) {
            letter = "L";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "L", Toast.LENGTH_SHORT).show();
            if (textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if (textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if (textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if (textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            } else if (textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            } else if (textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            } else if (textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.H)) {
            letter = "H";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "H", Toast.LENGTH_SHORT).show();
            if (textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if (textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if (textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if (textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            } else if (textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            } else if (textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            } else if (textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.P)) {
            letter = "P";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "P", Toast.LENGTH_SHORT).show();
            if (textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if (textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if (textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if (textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            } else if (textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            } else if (textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            } else if (textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.M)) {
            letter = "M";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "M", Toast.LENGTH_SHORT).show();
            if (textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if (textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if (textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if (textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            } else if (textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            } else if (textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            } else if (textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.A)) {
            letter = "A";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "A", Toast.LENGTH_SHORT).show();
            if (textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if (textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if (textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if (textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            } else if (textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            } else if (textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            } else if (textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }else if( view == findViewById(R.id.J)) {
            letter = "J";
            textout = (TextView) findViewById(R.id.L1);
            TextView textout2 = (TextView) findViewById(R.id.L2);
            TextView textout3 = (TextView) findViewById(R.id.L3);
            TextView textout4 = (TextView) findViewById(R.id.L4);
            TextView textout5 = (TextView) findViewById(R.id.L5);
            TextView textout6 = (TextView) findViewById(R.id.L6);
            TextView textout7 = (TextView) findViewById(R.id.L7);
            Toast.makeText(getApplicationContext(), "J", Toast.LENGTH_SHORT).show();
            if (textout == null || textout.getText().equals("")) {
                textout.setText(letter);
            } else if (textout != null && (textout2 == null || textout2.getText().equals(""))) {
                textout2.setText(letter);
            } else if (textout2 != null && (textout3 == null || textout3.getText().equals(""))) {
                textout3.setText(letter);
            } else if (textout3 != null && (textout4 == null || textout4.getText().equals(""))) {
                textout4.setText(letter);
            } else if (textout4 != null && (textout5 == null || textout5.getText().equals(""))) {
                textout5.setText(letter);
            } else if (textout5 != null && (textout6 == null || textout6.getText().equals(""))) {
                textout6.setText(letter);
            } else if (textout6 != null && (textout7 == null || textout7.getText().equals(""))) {
                textout7.setText(letter);
            }
        }


    }

}
