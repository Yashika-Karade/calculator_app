import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton button1;
    private JButton a1Button;
    private JButton a4Button1;
    private JButton a5Button;
    private JButton a1Button2;
    private JButton a7Button1;
    private JButton button5;
    private JButton a00Button;
    private JButton a8Button;
    private JButton a5Button1;
    private JButton a2Button1;
    private JButton a0Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button19;
    private JButton button9;
    private JButton button10;
    private JButton xButton;
    private JButton button20;

    double a,b,result;
    String op;

    //generate->form main()

    public Calculator() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
        a7Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a7Button1.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a8Button.getText());
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a9Button.getText());
            }
        });
        a4Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a4Button1.getText());
            }
        });
        a5Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a5Button1.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a6Button.getText());
            }
        });
        a1Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a1Button2.getText());
            }
        });
        a2Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a2Button1.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a3Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a00Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a0Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtDisplay.getText().contains(".")){
                    double p=Double.parseDouble(txtDisplay.getText());
                    p=p*-1;
                    txtDisplay.setText(String.valueOf(p));
                }
                else{
                    long l=Long.parseLong(txtDisplay.getText());
                    l=l*-1;
                    txtDisplay.setText(String.valueOf(l));
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains(".")){
                    txtDisplay.setText(txtDisplay.getText()+button5.getText());
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="+";
                txtDisplay.setText("");
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="-";
                txtDisplay.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="*";
                txtDisplay.setText("");
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="/";
                txtDisplay.setText("");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace=null;
                if(txtDisplay.getText().length()>0){
                    StringBuilder sb=new StringBuilder(txtDisplay.getText());
                    sb.deleteCharAt(txtDisplay.getText().length()-1);
                    backspace=String.valueOf(sb);
                    txtDisplay.setText(backspace);
                }
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b=Double.parseDouble(txtDisplay.getText());
                if(op=="+"){
                    result=a+b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op=="-") {
                    result=a-b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op=="*") {
                    result=a*b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op=="/") {
                    result=a/b;
                    txtDisplay.setText(String.valueOf(result));

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
