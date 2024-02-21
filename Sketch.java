import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Draw Head
    fill(255,255,0);
    ellipse(200, 80, 100, 100);

    // Draw Body
    fill(0);
    rect(195, 130, 10, 100);

    // Draw Legs
    stroke(0);
    line(200, 230, 150, 300);
    line(200, 230, 250, 300);

    // Draw Arms
    line(200, 180, 150, 200);
    line(200, 180, 250, 150);

    // Draw Sun
    fill(255, 255, 0);
    ellipse(0, 0, 100, 100);

    // Foreground grass
    fill(0, 200, 0);
    rect(0, 300, 400, 100);

  }
  
}