package mx.edu.ittepic.dadm_u3_ejercicio2a_alejandragrande;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class LienzoCirculos extends View {
    Circulo c1, c2, c3, c4;


    public LienzoCirculos(Context context) {
        super(context);
        c1=new Circulo(300, 400, this, 50);
        c1.mover(20);

        c2= new Circulo(400, 700, this, 80);
        c2.mover(10);

        c3= new Circulo( 500, 300, this, 40);
        c3.mover(12);

        c4=new Circulo(200, 500, this, 100);
        c4.mover(8);
    }


    public void onDraw (Canvas c)
    {
        super.onDraw(c);

        Paint p= new Paint();
        c.drawColor(Color.WHITE);
        p.setColor(Color.parseColor("#98FAF8"));
        c1.pintar(c,p);
        p.setColor(Color.parseColor("#C598FA"));
        c2.pintar(c,p);
        p.setColor(Color.parseColor("#3BCB59"));
        c3.pintar(c,p);
        p.setColor(Color.parseColor("#F581FF"));
        c4.pintar(c,p);

    }
}
