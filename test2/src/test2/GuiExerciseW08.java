package test2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.JButton;
import javax.swing.JFrame;

class GuiExerciseW08
{
  private String buttonLabel;
  private String minusLabel;
  private JFrame jf;
  private JButton jb;
  private JButton jbminus;
  private int sum;

  public GuiExerciseW08(String paramString1, String paramString2)
  {
    this.buttonLabel = paramString1;
    this.minusLabel = paramString2;

    this.jf = new JFrame("GUI Exercise");
    this.jb = new JButton(this.buttonLabel);
    this.jbminus = new JButton(this.minusLabel);

    this.jf.setSize(300, 150);

    Container localContainer = this.jf.getContentPane();

    localContainer.setLayout(new FlowLayout());

    localContainer.add(this.jb); localContainer.add(this.jbminus);

    this.jf.setVisible(true);

    handleEvent();
  }

  private void handleEvent()
  {
    this.jb.addActionListener(new GuiExerciseW08.HelloHandler(this.buttonLabel));
    this.jbminus.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent paramActionEvent) {
        System.out.println(GuiExerciseW08.this.minusLabel + "," + "sum = " + GuiExerciseW08.this.sum);
      }
    });
    this.jf.setDefaultCloseOperation(3);
  }

  class HelloHandler
    implements ActionListener
  {
    private String label;
    private int increment;

    public HelloHandler(String arg2)
    {
      this.label = arg2;
      this.increment = Integer.parseInt(this.label);
    }

    public void actionPerformed(ActionEvent paramActionEvent) {
      System.out.println(this.label + "," + "sum = " + GuiExerciseW08.this.sum);
    }
  }
}