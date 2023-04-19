import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Main {
    public static void main(String[] args) {
        new password();
    }
}

class password extends JFrame
{
    public static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public static int windowwidth = (int)size.getWidth();
    public static int windowheight = (int)size.getHeight();
    Label bg;
    password()
    {
        setLayout(null);
        setLocation(0,0);
        setSize(windowwidth,windowheight);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Label l1=new Label("Welcome to our ATM ");
        l1.setBounds(windowwidth/2-150,50,600,100);
        l1.setBackground(new Color(0x00B2FF));
        l1.setFont(new Font("Arial",Font.BOLD,40));
        l1.setForeground(new Color(0xFFFFFF));
        add(l1);

        Label l4=new Label("your name :");
        l4.setBounds(windowwidth/2-250,150,600,50);
        l4.setBackground(new Color(0x00B2FF));
        l4.setFont(new Font("Arial",Font.BOLD,20));
        l4.setForeground(new Color(0xFFFFFF));
        add(l4);

        JTextField t3=new JTextField();
        t3.setBounds(windowwidth/2-250,220,300,35);
        t3.setFont(new Font("Arial",Font.PLAIN,16));
        t3.setBorder(new LineBorder(new Color(0x2200FF),2));
        add(t3);


        Label l2=new Label("card number :");
        l2.setBounds(windowwidth/2-250,200+100,600,50);
        l2.setBackground(new Color(0x00B2FF));
        l2.setFont(new Font("Arial",Font.BOLD,20));
        l2.setForeground(new Color(0xFFFFFF));
        add(l2);

        JTextField t1=new JTextField(12);
        t1.setBounds(windowwidth/2-250,260+100,300,35);
        t1.setFont(new Font("Arial",Font.PLAIN,16));
        t1.setBorder(new LineBorder(new Color(0x2200FF),2));
        add(t1);

        Label l3 =new Label("pin :");
        l3.setBounds(windowwidth/2-250,300+100,600,50);
        l3.setBackground(new Color(0x00B2FF));
        l3.setFont(new Font("Arial",Font.BOLD,20));
        l3.setForeground(new Color(0xFFFFFF));
        add(l3);

        JTextField t2 =new JPasswordField(4);
        t2.setBounds(windowwidth/2-250,360+100,300,35);
        t2.setFont(new Font("Arial",Font.PLAIN,16));
        t2.setBorder(new LineBorder(new Color(0x2200FF),2));
        add(t2);

        JButton login=new JButton("login");
        login.setBounds(windowwidth/2-250,450+100,200,30);
        login.setBackground(new Color(0x13F7FF));
        login.setBorder(new LineBorder(new Color(0x13A5FF),2));
        login.setFocusPainted(false);
        login.setBorderPainted(false);
        add(login);
        login.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                login.setBackground(new Color(0x13A5FF));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                login.setBackground(new Color(0x13F7FF));

            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new home(t3.getText(),t1.getText(),t2.getText());
                dispose();
            }
        });

        bg=new Label("");
        bg.setBackground(new Color(0x00B2FF));
        bg.setBounds(0,0,windowwidth,windowheight);
        add(bg);
        setVisible(true);
    }
}

class home extends JFrame
{
    public static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public static int windowwidth = (int)size.getWidth();
    public static int windowheight = (int)size.getHeight();
    Label bg;
    int n=124500;
    home(String name,String cn,String pin)
    {
        setLayout(null);
        setLocation(0,0);
        setSize(windowwidth,windowheight);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Label atm=new Label("ATM");
        atm.setBounds(50,10,300,100);
        atm.setFont(new Font("Arial", Font.BOLD,30));
        atm.setBackground(new Color(0x0049B0));
        atm.setForeground(new Color(0xffffff));
        add(atm);

        Label l1=new Label("welcome : ");
        l1.setBackground(new Color(0x0049B0));
        l1.setForeground(new Color(0x6FB7FF));
        l1.setFont(new Font("Arial", Font.PLAIN,18));
        l1.setBounds(50,300,400,30);
        add(l1);

        Label l2 =new Label(name);
        l2.setBackground(new Color(0x0049B0));
        l2.setForeground(new Color(0xFFFFFF));
        l2.setFont(new Font("Arial", Font.BOLD,24));
        l2.setBounds(50,330,400,50);
        add(l2);

        Label l3 =new Label("savings #");
        l3.setBackground(new Color(0x0049B0));
        l3.setForeground(new Color(0x6FB7FF));
        l3.setFont(new Font("Arial", Font.PLAIN,18));
        l3.setBounds(50,400,400,30);
        add(l3);


        Label l4 =new Label("$124500");
        l4.setBackground(new Color(0x0049B0));
        l4.setForeground(new Color(0xFFFFFF));
        l4.setFont(new Font("Arial", Font.BOLD,30));
        l4.setBounds(50,430,400,50);
        add(l4);

        JButton b1=new JButton("Deposit");
        b1.setBounds(windowwidth/2-200,200,300,100);
        b1.setFont(new Font("Arial",Font.PLAIN,18));
        b1.setForeground(new Color(0xffffff));
        b1.setFocusPainted(false);
        b1.setBorderPainted(false);
        b1.setBackground(new Color(0x3AD8FD));
        add(b1);
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b1.setBackground(new Color(0x02BCFF));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                b1.setBackground(new Color(0x3AD8FD));

            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f= new JFrame("deposit");
                f.setLocation(windowwidth/2-150,windowheight/2-250);
                f.setSize(300,500);
                f.setResizable(false);

                Label l1=new Label("enter amount : ");
                l1.setForeground(new Color(0xffffff));
                l1.setFont(new Font("Arial", Font.PLAIN,18));
                l1.setBackground(new Color(0x0049B0));
                l1.setBounds(30,40,200,50);
                f.add(l1);

                JTextField t1=new JTextField();
                t1.setBounds(30,100,240,30);
                t1.setBackground(new Color(0x0049B0));
                t1.setBorder(new LineBorder(new Color(0xffffff),2));
                t1.setFont(new Font("Arial", Font.PLAIN,16));
                t1.setForeground(new Color(0xffffff));
                f.add(t1);

                Label l2 =new Label("Re-enter amount : ");
                l2.setForeground(new Color(0xffffff));
                l2.setFont(new Font("Arial", Font.PLAIN,18));
                l2.setBackground(new Color(0x0049B0));
                l2.setBounds(30,140,200,50);
                f.add(l2);

                JTextField t2 =new JTextField();
                t2.setBounds(30,200,240,30);
                t2.setBackground(new Color(0x0049B0));
                t2.setBorder(new LineBorder(new Color(0xffffff),2));
                t2.setFont(new Font("Arial", Font.PLAIN,16));
                t2.setForeground(new Color(0xffffff));
                f.add(t2);

                JButton dep=new JButton("Deposit");
                dep.setBounds(30,270,240,30);
                dep.setBackground(new Color(0x02BCFF));
                dep.setForeground(new Color(0xffffff));
                dep.setFont(new Font("Arial", Font.PLAIN,20));
                dep.setFocusPainted(false);
                dep.setBorderPainted(false);
                f.add(dep);
                dep.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        dep.setBackground(new Color(0x02BCFF));

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        dep.setBackground(new Color(0x02BCFF));

                    }
                });
                dep.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(t1.getText().equals(t2.getText()))
                        {
                            JOptionPane.showMessageDialog(null,"your amount is successfully deposited.");
                            n+= Integer.parseInt(t1.getText());
                            l4.setText("$"+n);
                            f.dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"enter same amount in both fields.");
                        }
                    }
                });


                Label bg=new Label("");
                bg.setBounds(0,0,300,400);
                bg.setBackground(new Color(0x0049B0));
                f.add(bg);
                f.setVisible(true);
            }
        });

        JButton b2 =new JButton("Change Password");
        b2.setBounds(windowwidth/2+200,200,300,100);
        b2.setFont(new Font("Arial",Font.PLAIN,18));
        b2.setForeground(new Color(0xffffff));
        b2.setFocusPainted(false);
        b2.setBorderPainted(false);
        b2.setBackground(new Color(0x3AD8FD));
        add(b2);
        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b2.setBackground(new Color(0x02BCFF));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                b2.setBackground(new Color(0x3AD8FD));

            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f= new JFrame("deposit");
                f.setLocation(windowwidth/2-150,windowheight/2-250);
                f.setSize(300,500);
                f.setResizable(false);

                Label l1=new Label("enter new pin : ");
                l1.setForeground(new Color(0xffffff));
                l1.setFont(new Font("Arial", Font.PLAIN,18));
                l1.setBackground(new Color(0x0049B0));
                l1.setBounds(30,40,200,50);
                f.add(l1);

                JTextField t1=new JPasswordField();
                t1.setBounds(30,100,240,30);
                t1.setBackground(new Color(0x0049B0));
                t1.setBorder(new LineBorder(new Color(0xffffff),2));
                t1.setFont(new Font("Arial", Font.PLAIN,16));
                t1.setForeground(new Color(0xffffff));
                f.add(t1);

                Label l2 =new Label("Re-enter pin : ");
                l2.setForeground(new Color(0xffffff));
                l2.setFont(new Font("Arial", Font.PLAIN,18));
                l2.setBackground(new Color(0x0049B0));
                l2.setBounds(30,140,200,50);
                f.add(l2);

                JTextField t2 =new JPasswordField();
                t2.setBounds(30,200,240,30);
                t2.setBackground(new Color(0x0049B0));
                t2.setBorder(new LineBorder(new Color(0xffffff),2));
                t2.setFont(new Font("Arial", Font.PLAIN,16));
                t2.setForeground(new Color(0xffffff));
                f.add(t2);

                JButton dep=new JButton("Change");
                dep.setBounds(30,270,240,30);
                dep.setBackground(new Color(0x02BCFF));
                dep.setForeground(new Color(0xffffff));
                dep.setFont(new Font("Arial", Font.PLAIN,20));
                dep.setFocusPainted(false);
                dep.setBorderPainted(false);
                f.add(dep);
                dep.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        dep.setBackground(new Color(0x02BCFF));

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        dep.setBackground(new Color(0x02BCFF));

                    }
                });
                dep.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(t1.getText().equals(t2.getText()))
                        {
                            JOptionPane.showMessageDialog(null,"your password is successfully changed.");
                            f.dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"enter same pin in both fields.");
                        }
                    }
                });


                Label bg=new Label("");
                bg.setBounds(0,0,300,400);
                bg.setBackground(new Color(0x0049B0));
                f.add(bg);
                f.setVisible(true);
            }
        });

        JButton b3 =new JButton("Withdraw");
        b3.setBounds(windowwidth/2-200,350,300,100);
        b3.setFont(new Font("Arial",Font.PLAIN,18));
        b3.setForeground(new Color(0xffffff));
        b3.setFocusPainted(false);
        b3.setBorderPainted(false);
        b3.setBackground(new Color(0x3AD8FD));
        add(b3);
        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b3.setBackground(new Color(0x02BCFF));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                b3.setBackground(new Color(0x3AD8FD));

            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f= new JFrame("deposit");
                f.setLocation(windowwidth/2-150,windowheight/2-250);
                f.setSize(300,500);
                f.setResizable(false);

                Label l1=new Label("enter amount : ");
                l1.setForeground(new Color(0xffffff));
                l1.setFont(new Font("Arial", Font.PLAIN,18));
                l1.setBackground(new Color(0x0049B0));
                l1.setBounds(30,40,200,50);
                f.add(l1);

                JTextField t1=new JTextField();
                t1.setBounds(30,100,240,30);
                t1.setBackground(new Color(0x0049B0));
                t1.setBorder(new LineBorder(new Color(0xffffff),2));
                t1.setFont(new Font("Arial", Font.PLAIN,16));
                t1.setForeground(new Color(0xffffff));
                f.add(t1);

                Label l2 =new Label("Re-enter amount : ");
                l2.setForeground(new Color(0xffffff));
                l2.setFont(new Font("Arial", Font.PLAIN,18));
                l2.setBackground(new Color(0x0049B0));
                l2.setBounds(30,140,200,50);
                f.add(l2);

                JTextField t2 =new JTextField();
                t2.setBounds(30,200,240,30);
                t2.setBackground(new Color(0x0049B0));
                t2.setBorder(new LineBorder(new Color(0xffffff),2));
                t2.setFont(new Font("Arial", Font.PLAIN,16));
                t2.setForeground(new Color(0xffffff));
                f.add(t2);

                JButton dep=new JButton("Withdraw");
                dep.setBounds(30,270,240,30);
                dep.setBackground(new Color(0x02BCFF));
                dep.setForeground(new Color(0xffffff));
                dep.setFont(new Font("Arial", Font.PLAIN,20));
                dep.setFocusPainted(false);
                dep.setBorderPainted(false);
                f.add(dep);
                dep.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        dep.setBackground(new Color(0x02BCFF));

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        dep.setBackground(new Color(0x02BCFF));

                    }
                });
                dep.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(t1.getText().equals(t2.getText()))
                        {
                            if(Integer.parseInt(t1.getText())<=40000) {
                                JOptionPane.showMessageDialog(null, "your can take cash from the ATM.");
                                n -= Integer.parseInt(t1.getText());
                                l4.setText("$" + n);
                                f.dispose();
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"ATM limit is 40000rs a day");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"enter same amount in both fields.");
                        }
                    }
                });


                Label bg=new Label("");
                bg.setBounds(0,0,300,400);
                bg.setBackground(new Color(0x0049B0));
                f.add(bg);
                f.setVisible(true);
            }
        });

        JButton b4 =new JButton("Balance Transfer");
        b4.setBounds(windowwidth/2+200,350,300,100);
        b4.setFont(new Font("Arial",Font.PLAIN,18));
        b4.setForeground(new Color(0xffffff));
        b4.setFocusPainted(false);
        b4.setBorderPainted(false);
        b4.setBackground(new Color(0x3AD8FD));
        add(b4);
        b4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b4.setBackground(new Color(0x02BCFF));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                b4.setBackground(new Color(0x3AD8FD));

            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f= new JFrame("deposit");
                f.setLocation(windowwidth/2-150,windowheight/2-275);
                f.setSize(300,550);
                f.setResizable(false);

                Label m=new Label("");
                m.setBounds(0,0,300,20);
                m.setBackground(new Color(0x0049B0));
                m.setFont(new Font("Arial", Font.BOLD,16));
                m.setForeground(new Color(0xffffff));
                f.add(m);

                Label l1=new Label("enter account number : ");
                l1.setForeground(new Color(0xffffff));
                l1.setFont(new Font("Arial", Font.PLAIN,18));
                l1.setBackground(new Color(0x0049B0));
                l1.setBounds(30,40,200,50);
                f.add(l1);

                JTextField t1=new JTextField();
                t1.setBounds(30,100,240,30);
                t1.setBackground(new Color(0x0049B0));
                t1.setBorder(new LineBorder(new Color(0xffffff),2));
                t1.setFont(new Font("Arial", Font.PLAIN,16));
                t1.setForeground(new Color(0xffffff));
                f.add(t1);

                Label l2 =new Label("enter amount : ");
                l2.setForeground(new Color(0xffffff));
                l2.setFont(new Font("Arial", Font.PLAIN,18));
                l2.setBackground(new Color(0x0049B0));
                l2.setBounds(30,140,200,50);
                f.add(l2);

                JTextField t2 =new JTextField();
                t2.setBounds(30,200,240,30);
                t2.setBackground(new Color(0x0049B0));
                t2.setBorder(new LineBorder(new Color(0xffffff),2));
                t2.setFont(new Font("Arial", Font.PLAIN,16));
                t2.setForeground(new Color(0xffffff));
                f.add(t2);

                Label l3 =new Label("enter OTP : ");
                l3.setForeground(new Color(0xffffff));
                l3.setFont(new Font("Arial", Font.PLAIN,18));
                l3.setBackground(new Color(0x0049B0));
                l3.setBounds(30,310,200,50);
                f.add(l3);

                JTextField t3 =new JTextField();
                t3.setBounds(30,370,240,30);
                t3.setBackground(new Color(0x0049B0));
                t3.setBorder(new LineBorder(new Color(0xffffff),2));
                t3.setFont(new Font("Arial", Font.PLAIN,16));
                t3.setEditable(false);
                t3.setForeground(new Color(0xffffff));
                f.add(t3);

                final int[] num = new int[1];
                JButton dep1 =new JButton("Transfer");
                dep1.setBounds(30,430,240,30);
                dep1.setBackground(new Color(0x02BCFF));
                dep1.setForeground(new Color(0xffffff));
                dep1.setFont(new Font("Arial", Font.PLAIN,20));
                dep1.setFocusPainted(false);
                dep1.setBorderPainted(false);
                dep1.setEnabled(false);
                f.add(dep1);
                dep1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(Integer.parseInt(t3.getText())==num[0])
                        {
                            JOptionPane.showMessageDialog(null,"Amount transfered successfully");
                            n-=Integer.parseInt(t2.getText());
                            l4.setText("$" + n);
                            f.dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"wrong OTP");
                            Random random = new Random();
                            num[0] = random.nextInt(9000) + 1000;
                            m.setText("     your OTP : " + num[0]);

                        }
                    }
                });

                JButton dep=new JButton("generate OTP");
                dep.setBounds(30,270,240,30);
                dep.setBackground(new Color(0x02BCFF));
                dep.setForeground(new Color(0xffffff));
                dep.setFont(new Font("Arial", Font.PLAIN,20));
                dep.setFocusPainted(false);
                dep.setBorderPainted(false);
                f.add(dep);
                dep.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        dep.setBackground(new Color(0x02BCFF));

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        dep.setBackground(new Color(0x02BCFF));

                    }
                });
                dep.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(Integer.parseInt(t2.getText())<=n) {
                            t3.setEditable(true);
                            dep1.setEnabled(true);
                            Random random = new Random();
                            num[0] = random.nextInt(9000) + 1000;
                            m.setBackground(new Color(0xFF1616));
                            m.setText("     your OTP : " + num[0]);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"exceeded your current balance.");
                        }
                    }
                });


                Label bg=new Label("");
                bg.setBounds(0,0,300,400);
                bg.setBackground(new Color(0x0049B0));
                f.add(bg);
                f.setVisible(true);
            }
        });

        JButton b5 =new JButton("Account Settings");
        b5.setBounds(windowwidth/2-200,500,300,100);
        b5.setFont(new Font("Arial",Font.PLAIN,18));
        b5.setForeground(new Color(0xffffff));
        b5.setFocusPainted(false);
        b5.setBorderPainted(false);
        b5.setBackground(new Color(0x3AD8FD));
        add(b5);
        b5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b5.setBackground(new Color(0x02BCFF));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                b5.setBackground(new Color(0x3AD8FD));

            }
        });

        JButton b6 =new JButton("Other");
        b6.setBounds(windowwidth/2+200,500,300,100);
        b6.setFont(new Font("Arial",Font.PLAIN,18));
        b6.setForeground(new Color(0xffffff));
        b6.setFocusPainted(false);
        b6.setBorderPainted(false);
        b6.setBackground(new Color(0x3AD8FD));
        add(b6);
        b6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b6.setBackground(new Color(0x02BCFF));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                b6.setBackground(new Color(0x3AD8FD));

            }
        });

        Label l5=new Label("2500rs");
        l5.setBackground(new Color(0xFF447C));
        l5.setForeground(new Color(0xffffff));
        l5.setFont(new Font("Arial",Font.BOLD,24));
        l5.setBounds(windowwidth/2-150,760,100,20);
        add(l5);


        JButton b7 =new JButton("                             Quick Cash   >");
        b7.setBounds(windowwidth/2-200,750,700,40);
        b7.setFont(new Font("Arial",Font.PLAIN,18));
        b7.setForeground(new Color(0xffffff));
        b7.setFocusPainted(false);
        b7.setBorderPainted(false);
        b7.setBackground(new Color(0xFF447C));
        add(b7);
        b7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b7.setBackground(new Color(0xFF1616));
                l5.setBackground(new Color(0xFF1616));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                b7.setBackground(new Color(0xFF447C));
                l5.setBackground(new Color(0xFF447C));

            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(n>=2500) {
                    JOptionPane.showMessageDialog(null, "your transaction is successful");
                    n -= 2500;
                    l4.setText("$" + n);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"insufficient balance");
                }
            }
        });



        bg=new Label("");
        bg.setBackground(new Color(0x0049B0));
        bg.setBounds(0,0,windowwidth,windowheight);
        add(bg);
        setVisible(true);
    }
    String fun(String s)
    {
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(i>=3 && i<=c.length-3)
            {
                c[i]='*';
            }
        }
        String r=new String(c);
        return r;
    }
}