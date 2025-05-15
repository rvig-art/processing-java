package art.rvig.processing;

import processing.core.PApplet;

import java.lang.invoke.MethodHandles;

public class SketchTemplate extends PApplet{

    int x,y;

    public void settings(){
        size(600, 600, P2D);
    }

    public void setup() {
        x = width/2;
        y = height/2;
    }


    public void draw(){
        background(0xffff8000);
        circle(x,y,width/3f);
    }

    public void mousePressed(){
        System.out.println("mousePressed");
        x = mouseX;
        y = mouseY;
    }
    static public void main(String[] passedArgs) {
        String[] appletArgs = new String[] { MethodHandles.lookup().lookupClass().getName() }; // look for current class
        if (passedArgs != null) {
            PApplet.main(concat(appletArgs, passedArgs));
        } else {
            PApplet.main(appletArgs);
        }
    }
}
