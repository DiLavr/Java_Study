/**
 * 28.12 (Variation of the nine tails problem)
 *  In the nine tails problem, when you flip a coin, the horizontal and vertical neighboring 
 *  cells are also flipped.
 *  Rewrite the program, assuming that all neighboring cells including the diagonal
 *  neighbors are also flipped.
 *  
 */


package ex_28_12;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Lavruk_28_12 extends JApplet {

 static class NineTailPanel extends JPanel {
  private static final long serialVersionUID = 1L;
  private int matrixSize = 3;
  private int coinSize = 50;
  private char[] initialNode = new char[matrixSize * matrixSize];
  private char[] previous = new char[matrixSize * matrixSize];
  
  public NineTailPanel() {
   for (int i = 0; i < initialNode.length; i++) {
    initialNode[i] = 'H';
   }
   previous = null;
   addMouseListener(new MouseAdapter() {
    
    @Override
    public void mouseReleased(MouseEvent e) {
     changeState((e.getX() / coinSize) * matrixSize + (e.getY() / coinSize));
    }
   });
  }
  
  public NineTailPanel(char[] initialNode, char[] previous) {
   for (int i = 0; i < initialNode.length; i++) {
    this.initialNode[i] = initialNode[i];
    this.previous[i] = previous[i];
   }
  }
  
  void changeState(int i) {
   if(initialNode[i] == 'H') {
    initialNode[i] = 'T';
   } else {
    initialNode[i] = 'H';
   }
   repaint();
  }
  
  public char[] getInitialNode() {
   return initialNode;
  }
  @Override
  public Dimension getPreferredSize() {
   return new Dimension(matrixSize * coinSize + 1, matrixSize * coinSize + 1);
  }
  
  // putting some live to your problem
  @Override
  protected void paintComponent(Graphics g) {
   super.paintComponent(g);
   g.setFont(new Font("Monospaced", Font.BOLD, 26));
   for (int i = 0; i < matrixSize; i++) {
    for (int j = 0; j < matrixSize; j++) {
     g.drawRect(i * coinSize, j * coinSize, coinSize, coinSize);
     if((previous != null) && (initialNode[i * matrixSize + j] != previous[i * matrixSize + j])) {
      g.setColor(Color.GREEN);
      g.drawString(initialNode[i * matrixSize + j] + "", i * coinSize + coinSize / 3, j * coinSize + 2 * (coinSize / 3));
      g.setColor(Color.BLUE);
     } else {
      g.drawString(initialNode[i * matrixSize + j] + "", i * coinSize + coinSize / 3, j * coinSize + 2 * (coinSize / 3));
     }
    }
   }
   
  }
 }
 private static final long serialVersionUID = 1L;
 public static void main(String[] args) {
  JFrame frame = new JFrame("Lavruk_28_12"); //create Jframe
  JApplet applet = new Lavruk_28_12(); // new applet
  frame.add(applet);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default CLOSE window
  frame.setSize(600, 800); //size of frame
  frame.setMinimumSize(new Dimension(frame.getWidth(), frame.getHeight()));
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);
 }
 
 private NineTailPanel nineTailPanel = new NineTailPanel();

 private JPanel jPanel1 = new JPanel(new FlowLayout());

 public Lavruk_28_12() {
	 
  jPanel1.add(nineTailPanel);
  setLayout(new BorderLayout());
  add(jPanel1, BorderLayout.CENTER);
  JPanel jPanel2 = new JPanel(new FlowLayout());
  JButton jButton1 = new JButton("Solve");
  JButton jButton2 = new JButton("Start Over");
  jPanel2.add(jButton1);
  jPanel2.add(jButton2);
  add(jPanel2, BorderLayout.SOUTH);
  jButton1.addActionListener(new ActionListener() {   
   @Override
   public void actionPerformed(ActionEvent e) {
    char[] initialNode = nineTailPanel.getInitialNode();


    NineTailModel model = new NineTailModel();
    java.util.List<Integer> path = model.getShortestPath(NineTailModel.getIndex(initialNode));

    for (int i = 1; i < path.size(); i++) {
     jPanel1.add(new NineTailPanel(NineTailModel.getNode(path.get(i).intValue()), NineTailModel.getNode(path.get(i - 1).intValue())));
    }
    jPanel1.updateUI();
   }
  });
  jButton2.addActionListener(new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent e) {
    jPanel1.removeAll();
    nineTailPanel = new NineTailPanel();
    jPanel1.add(nineTailPanel);
    jPanel1.updateUI();
   }
  });
 }
}