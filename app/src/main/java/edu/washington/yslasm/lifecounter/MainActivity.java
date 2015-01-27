package edu.washington.yslasm.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int p1life = 20;
    int p2life = 20;
    int p3life = 20;
    int p4life = 20;
    String loser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView player1 = (TextView) findViewById(R.id.player1life);
        TextView player2 = (TextView) findViewById(R.id.player2life);
        TextView player3 = (TextView) findViewById(R.id.player3life);
        TextView player4 = (TextView) findViewById(R.id.player4life);
        TextView losers = (TextView) findViewById(R.id.losers);
        if(savedInstanceState!=null) {
            p1life = savedInstanceState.getInt("Player1life");
            p2life = savedInstanceState.getInt("Player2life");
            p3life = savedInstanceState.getInt("Player3life");
            p4life = savedInstanceState.getInt("Player4life");
            player1.setText("" + p1life);
            player2.setText("" + p2life);
            player3.setText("" + p3life);
            player4.setText("" + p4life);
            losers.setText(savedInstanceState.getString("losers"));
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("Player1life", p1life);
        savedInstanceState.putInt("Player2life", p2life);
        savedInstanceState.putInt("Player3life", p3life);
        savedInstanceState.putInt("Player4life", p4life);
        savedInstanceState.putString("losers", loser);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void changeLife(View v) {
        TextView player1 = (TextView) findViewById(R.id.player1life);
        TextView player2 = (TextView) findViewById(R.id.player2life);
        TextView player3 = (TextView) findViewById(R.id.player3life);
        TextView player4 = (TextView) findViewById(R.id.player4life);
        TextView losers = (TextView) findViewById(R.id.losers);
        switch (v.getId()) {
            case R.id.p1plus1:
                p1life = p1life + 1;
                player1.setText("" + p1life);
                break;
            case R.id.p1plus5:
                p1life = p1life + 5;
                player1.setText("" + p1life);
                break;
            case R.id.p1minus1:
                p1life = p1life - 1;
                if (p1life < 1) {
                    p1life = 0;
                    losers.setText(losers.getText().toString() + " Player 1 Loses!");
                    loser = "" + losers.getText();
                }
                player1.setText("" + p1life);
                break;
            case R.id.p1minus5:
                p1life = p1life - 5;
                if (p1life < 1) {
                    p1life = 0;
                    losers.setText(losers.getText().toString() + " Player 1 Loses!");
                    loser = "" + losers.getText();
                }
                player1.setText("" + p1life);
                break;
            case R.id.p2plus1:
                p2life = p2life + 1;
                player2.setText("" + p2life);
                break;
            case R.id.p2plus5:
                p2life = p2life + 5;
                player2.setText("" + p2life);
                break;
            case R.id.p2minus1:
                p2life = p2life - 1;
                if (p2life < 1) {
                    p2life = 0;
                    losers.setText(losers.getText().toString() + " Player 2 Loses!");
                    loser = "" + losers.getText();
                }
                player2.setText("" + p2life);
                break;
            case R.id.p2minus5:
                p2life = p2life - 5;
                if (p2life < 1) {
                    p2life = 0;
                    losers.setText(losers.getText().toString() + " Player 2 Loses!");
                    loser = "" + losers.getText();
                }
                player2.setText("" + p2life);
                break;
            case R.id.p3plus1:
                p3life = p3life + 1;
                player3.setText("" + p3life);
                break;
            case R.id.p3plus5:
                p3life = p3life + 5;
                player3.setText("" + p3life);
                break;
            case R.id.p3minus1:
                p3life = p3life - 1;
                if (p3life < 1) {
                    p3life = 0;
                    losers.setText(losers.getText().toString() + " Player 3 Loses!");
                    loser = "" + losers.getText();
                }
                player3.setText("" + p3life);
                break;
            case R.id.p3minus5:
                p3life = p3life - 5;
                if (p3life < 1) {
                    p3life = 0;
                    losers.setText(losers.getText().toString() + " Player 3 Loses!");
                    loser = "" + losers.getText();
                }
                player3.setText("" + p3life);
                break;
            case R.id.p4plus1:
                p4life = p4life + 1;
                player4.setText("" + p4life);
                break;
            case R.id.p4plus5:
                p4life = p4life + 5;
                player4.setText("" + p4life);
                break;
            case R.id.p4minus1:
                p4life = p4life - 1;
                if (p4life < 1) {
                    p4life = 0;
                    losers.setText(losers.getText().toString() + " Player 4 Loses!");
                    loser = "" + losers.getText();
                }
                player4.setText("" + p4life);
                break;
            case R.id.p4minus5:
                p4life = p4life - 5;
                if (p4life < 1) {
                    p4life = 0;
                    losers.setText(losers.getText().toString() + " Player 4 Loses!");
                    loser = "" + losers.getText();
                }
                player4.setText("" + p4life);
                break;

        }
    }
}
