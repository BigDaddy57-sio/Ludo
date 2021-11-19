package fr.siomd.ludo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.text.InputFilter;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Random;
import android.widget.Button;
public class CalculerActivity extends AppCompatActivity {





        private int total = 0;
        private int score = 0;
        private int score2 = 0;
        private TextView tv;
        private TextView tv1;
        private TextView tv2;
        private TextView tv3;
        private TextView tv4;
        private TextView tv5;
        private TextView tv6;
        private TextView tv7;
        private TextView tv8;
        private TextView tv9;
        private TextView tv10;
        private TextView tv11;
        private TextView tv12;
        private TextView tv13;
        private TextView tv14;
        private TextView tvScore1;
        private int resultat = 0;
        private int resultat1 = 0;
        private int resultat2 = 0;
        private int resultat3 = 0;

        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);


            setContentView(R.layout.activity_main2);
            // Les variables TextView avec la valeur + affichage du TextView vide
            tvScore1 = (TextView) findViewById(R.id.textView);
            tvScore1.setText("");
            tv = (TextView) findViewById(R.id.textView2);
            tv.setText("");
            tv1 = (TextView) findViewById(R.id.textView3);
            tv1.setText("");
            tv2 = (TextView) findViewById(R.id.textView4);
            tv2.setText("");
            tv3 = (TextView) findViewById(R.id.textView5);
            tv3.setText("");
            tv5 = (TextView) findViewById(R.id.textView7);
            tv5.setText("");
            tv6 = (TextView) findViewById(R.id.textView8);
            tv6.setText("");
            tv7 = (TextView) findViewById(R.id.textView11);
            tv7.setText("");
            tv8 = (TextView) findViewById(R.id.textView12);
            tv8.setText("");
            tv9 = (TextView) findViewById(R.id.textView14);
            tv9.setText("");
            tv10 = (TextView) findViewById(R.id.textView17);
            tv10.setText("");
            tv11 = (TextView) findViewById(R.id.textView18);
            tv11.setText("");
            tv12 = (TextView) findViewById(R.id.textView9);
            tv12.setText("");
            tv13 = (TextView) findViewById(R.id.textView10);
            tv13.setText("");
            tv14 = (TextView) findViewById(R.id.textView13);
            tv14.setText("");

            // création des Boutons avec la valeur
            Button monBouton = (Button) findViewById(R.id.button);
            Button monBouton4 = (Button) findViewById(R.id.button4);
            Button monBouton3 = (Button) findViewById(R.id.button3);
            Button monBouton2 = (Button) findViewById(R.id.button2);
            Button monBouton5 = (Button) findViewById(R.id.button6);
            Button monBouton6 = (Button) findViewById(R.id.button5);
            EditText monText = (EditText) findViewById(R.id.editTextTextPersonName);

            // affichage des boutons en invisible
            monBouton.setVisibility(View.INVISIBLE);
            monBouton3.setVisibility(View.INVISIBLE);
            monBouton2.setVisibility(View.INVISIBLE);
            monBouton5.setVisibility(View.INVISIBLE);
            monBouton6.setVisibility(View.INVISIBLE);
            monText.setVisibility(View.INVISIBLE);

            //Bouton jouer permet d'accéder aux boutons permettant de jouer
            monBouton4.setOnClickListener((v)->{
                tvScore1.setText(String.format(Locale.getDefault(),"Score Joueur : %d    score lancer : %d", score, score2));
                monBouton.setVisibility(View.VISIBLE);
                monBouton2.setVisibility(View.VISIBLE);
                monBouton4.setVisibility(View.INVISIBLE);
                monBouton5.setVisibility(View.VISIBLE);
                tv6.setText("+");
                tv8.setText("+");
                tv7.setText("+");
                tv12.setText("");
                tv13.setText("");
                tv14.setText("");
                tv4 = (TextView) findViewById(R.id.textView6);
                tv4.setText("");
            });

            // Bouton lancer qui lance des chiffres aux hasards et puis les calculs
            monBouton.setOnClickListener((v)-> {
                if (monBouton5.getVisibility() == View.VISIBLE){
                    SecureRandom r = new SecureRandom();
                    int resultat = r.nextInt(10);
                    int resultat1 = r.nextInt(10);
                    int resultat2 = r.nextInt(10);
                    int resultat3 = r.nextInt(10);
                    tv.setText(String.valueOf(resultat));
                    tv1.setText(String.valueOf(resultat1));
                    tv2.setText(String.valueOf(resultat2));
                    tv3.setText(String.valueOf(resultat3));
                    monBouton3.setVisibility(View.VISIBLE);
                    monText.setVisibility(View.VISIBLE);
                    monText.setText("");
                    tv5.setText("=");
                    monBouton.setVisibility(View.INVISIBLE);
                    tv9 = (TextView) findViewById(R.id.textView14);
                    tv9.setText("");
                    tv10 = (TextView) findViewById(R.id.textView17);
                    tv10.setText("");
                    tv11 = (TextView) findViewById(R.id.textView18);
                    tv11.setText("");
                    total = resultat + resultat1 + resultat2 + resultat3;
                } else if (monBouton6.getVisibility() == View.VISIBLE){
                    SecureRandom r = new SecureRandom();
                    int resultat = r.nextInt(5);
                    int resultat1 = r.nextInt(5);
                    int resultat2 = r.nextInt(5);
                    int resultat3 = r.nextInt(5);
                    tv.setText(String.valueOf(resultat));
                    tv1.setText(String.valueOf(resultat1));
                    tv2.setText(String.valueOf(resultat2));
                    tv3.setText(String.valueOf(resultat3));
                    monBouton3.setVisibility(View.VISIBLE);
                    monText.setVisibility(View.VISIBLE);
                    monText.setText("");
                    tv5.setText("=");
                    monBouton.setVisibility(View.INVISIBLE);
                    tv9 = (TextView) findViewById(R.id.textView14);
                    tv9.setText("");
                    tv10 = (TextView) findViewById(R.id.textView17);
                    tv10.setText("");
                    tv11 = (TextView) findViewById(R.id.textView18);
                    tv11.setText("");
                    total = resultat * resultat1 * resultat2 * resultat3;
                }
            } );

            // Bouton nouvelle partie qui réinitialise le score du joueur
            monBouton2.setOnClickListener((v)-> {
                tv = (TextView) findViewById(R.id.textView2);
                tv.setText("");
                tv1 = (TextView) findViewById(R.id.textView3);
                tv1.setText("");
                tv2 = (TextView) findViewById(R.id.textView4);
                tv2.setText("");
                tv3 = (TextView) findViewById(R.id.textView5);
                tv3.setText("");
                tv5 = (TextView) findViewById(R.id.textView7);
                tv5.setText("");
                tvScore1.setText(String.format(Locale.getDefault(),"Score Joueur :  %d    score lancer : %d", score =0 , score2 = 0));
                monBouton.setVisibility(View.VISIBLE);
                monText.setVisibility(View.INVISIBLE);
                monText.setText("");
                monBouton3.setVisibility(View.INVISIBLE);
                monBouton4.setVisibility(View.INVISIBLE);
            });

            // Bouton validé
            monBouton3.setOnClickListener((V)->{
                tv11.setText("");
                tv9.setText("");
                tv10.setText("");
                // si la personne n'as rien écrit
                if (monText.getText().toString().isEmpty()){
                    tvScore1.setText(String.format(Locale.getDefault(),"Score joueur :  %d    score lancer : %d", score = score + 0, score2 = score2 + 0));
                    tv11 = (TextView) findViewById(R.id.textView18);
                    tv11.setText("Tu n'as rien écrit !!");
                    //si la réponse du joueur est corrcet
                } else if (Integer.parseInt(monText.getText().toString()) == total){
                    tvScore1.setText(String.format(Locale.getDefault(),"Score joueur :  %d    score lancer : %d", score = score + 1, score2 = score2 + 1));
                    monBouton.setVisibility(View.VISIBLE);
                    monText.setText("");
                    monBouton3.setVisibility(View.INVISIBLE);
                    tv9 = (TextView) findViewById(R.id.textView14);
                    tv9.setText(String.format(Locale.getDefault(),"Bravo !! Le résultat était : %d", total));
                    // si la réponse  du joueur est incorrect
                } else {
                    tvScore1.setText(String.format(Locale.getDefault(),"Score joueur :  %d    score lancer : %d", score = score + 0, score2 = score2 + 1));
                    monBouton.setVisibility(View.VISIBLE);
                    monText.setText("");
                    monBouton3.setVisibility(View.INVISIBLE);
                    tv10 = (TextView) findViewById(R.id.textView17);
                    tv10.setText(String.format(Locale.getDefault(),"Dommage :( Le résultat était : %d", total));
                }
            });

            // chamgement de jeux en multiplication
            monBouton5.setOnClickListener((V)->{
                tv6.setText("");
                tv7.setText("");
                tv8.setText("");
                tv12.setText("*");
                tv13.setText("*");
                tv14.setText("*");
                monBouton5.setVisibility(View.INVISIBLE);
                monBouton6.setVisibility(View.VISIBLE);
            });

            // chamgement de jeux en addition
            monBouton6.setOnClickListener((V)->{
                tv6.setText("+");
                tv7.setText("+");
                tv8.setText("+");
                tv12.setText("");
                tv13.setText("");
                tv14.setText("");
                monBouton5.setVisibility(View.VISIBLE);
                monBouton6.setVisibility(View.INVISIBLE);
            });

        }



    }
