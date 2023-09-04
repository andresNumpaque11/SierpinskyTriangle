package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Andres Numpaque
 */
public class SierpinskyTriangle extends JFrame {

    private Points pointOne;
    private Points pointTwo;
    private Points point1Three;
    
    private int depth = 0;

    public SierpinskyTriangle() {
        this.setSize(500, 500);
        this.setVisible(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        System.out.println("ancho" + this.getWidth());
        System.out.println("alto" + this.getHeight());
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);
        pointOne = new Points(this.getWidth() / 2, 50);
        pointTwo = new Points(50, this.getWidth() - 50);
        point1Three = new Points(this.getWidth() - 50, getWidth() - 50);

        drawSierpinski(g, pointOne, pointTwo, point1Three, depth);
        System.out.println("Pintando"+ pointOne.getX());

    }

    private void drawSierpinski(Graphics g, Points p1, Points p2, Points p3, int depth) {
        if (depth == 0) {
            int[] xPoints = {p1.getX(), p2.getX(), p3.getX()};
            int[] yPoints = {p1.getY(), p2.getY(), p3.getY()};
            g.setColor(Color.blue);
            g.drawPolygon(xPoints, yPoints, 3);
        } else {
            Points mid1 = midpoint(p1, p2);
            Points mid2 = midpoint(p2, p3);
            Points mid3 = midpoint(p1, p3);

            drawSierpinski(g, p1, mid1, mid3, depth - 1);
            drawSierpinski(g, mid1, p2, mid2, depth - 1);
            drawSierpinski(g, mid3, mid2, p3, depth - 1);
        }
    }

    private Points midpoint(Points p1, Points p2) {
        return new Points((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    

}
