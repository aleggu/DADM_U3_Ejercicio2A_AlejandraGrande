package mx.edu.ittepic.dadm_u3_ejercicio2a_alejandragrande;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Circulo
{
    float x, y;
    int desplazamientox, desplazamientoy, r;
    CountDownTimer timer;
    public  Circulo (int posx, int posy, final LienzoCirculos l, int radio)
    {
        x=posx;
        y=posy;
        r=radio;
        timer=new CountDownTimer(1000, 50) {
            @Override
            public void onTick(long millisUntilFinished) {
                x+=desplazamientox;
                if (x >= l.getWidth()-r)
                {
                    desplazamientox *= -1;
                }
                if (x <=r)
                {
                    desplazamientox *= -1;
                }
                y+=desplazamientoy;
                if(y>=l.getHeight()-r)
                {
                    desplazamientoy *= -1;
                }
                if(y<=r)
                {
                    desplazamientoy *= -1;
                }
                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };
    }

    public void pintar(Canvas c, Paint p)
    {
        c.drawCircle(x, y, r, p);
    }
    public void mover(int desplaza)
    {
        desplazamientox= desplaza;
        desplazamientoy=desplaza;
        timer.start();
    }
}
