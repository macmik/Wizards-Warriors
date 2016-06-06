package com.example.maciej.wizardwarriors;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Maciej on 06.06.2016.
 */
public class MainGamePanel extends SurfaceView implements SurfaceHolder.Callback {

    public MainGamePanel(Context context)
    {
        super(context);
        getHolder().addCallback(this);
        setFocusable(true);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height)
    {
    }
    @Override
    public void surfaceDestroyed(SurfaceHolder holder)
    {
        boolean retry = true;
        while(retry)
        {
            //thread.setRunning(false);
        }
    }
    @Override
    public void surfaceCreated(SurfaceHolder holder)
    {
    }
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        return super.onTouchEvent(event);
    }
    public void update()
    {
    }

    @Override
    public void draw(Canvas canvas)
    {
        super.draw(canvas);
    }

}
