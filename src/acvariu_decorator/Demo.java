package acvariu_decorator;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.*;

public class Demo extends JFrame implements ActionListener,MouseListener  {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	//declarare JFrame
	JFrame frmAcvariu;
	
	//labels folosite pentru acvariu si fundal pentru frame
	JLabel lbAcvariu,  background;
	
	 /* lbCastel, lbStarfish, lbGoldfish, lbCoral, lbFish_food, lbScoici, lbScoici1;
	JLabel lbPesti, lbPesti1, lbPesti2, lbAlge, lbAlge1, lbTurtle, lbPearlshell, lbNemo, background; */
	
	//butoane pentru decorarea acvariului
	JButton btnAlge, btnCoral, btnStarfish, btnPearlshell, btnGoldfish, btnPesti, btnFish_food;
	JButton btnNemo, btnTurtle, btnScoici, btnCastel, btnPesti1, btnPesti2;
	
	//butoane pentru aparitia/disparitia elementelor in/din acvariu
	JButton desenCastel, desenStarfish, desenGoldfish, desenAlge, desenCoral, desenPesti, desenFish_food, desenNemo;
	JButton desenPesti1, desenPesti2, desenTurtle, desenScoici,desenPearlshell,desenAlge1,desenScoici1;
	
	//butoane de generare si resetare ale decorului acvariului
	JButton btnGenerare, btnResetare;
	
	//textArea pentru descrierea elementelor introduse in acvariu
	JTextArea textArea;
	
	
	//variabile ce reprezinta cate elemente sunt de fiecare
	int nr_pesti, nr_scoici, nr_nemo, nr_goldfish, nr_coral, nr_castel, nr_fish_food;
	int nr_alge, nr_starfish, nr_pearlshell, nr_turtle, nr_pesti1, nr_pesti2;
	

	/**
	 * Launch the application.
	 */
	//initializare acvariu
	Acvariu ac = new AcvariuImpl();

	public static void main(String[] args) {
		System.out.println("Hello\n");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo window = new Demo();
					window.frmAcvariu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		//initializare frame
		frmAcvariu = new JFrame();
		frmAcvariu.setTitle("Acvariu");
		frmAcvariu.setBounds(100, 100, 1350, 780);
		frmAcvariu.setResizable(false);
		frmAcvariu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAcvariu.getContentPane().setLayout(null);

		//definire butoane, peste care am adaugat icons (idem pentru toate celelalte butoane)
		//butonul pentru alge poate fi apasat de 2 ori, si vor aparea 2 perechi de alge in acvariu, in locatii diferite (idem si pentru Scoici)
		btnAlge = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/alge_ic.png")));
		btnAlge.setBounds(948, 208, 95, 56);
		frmAcvariu.getContentPane().add(btnAlge);

		btnPesti = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/fish_ic.png")));
		btnPesti.setBounds(948, 10, 95, 56);
		frmAcvariu.getContentPane().add(btnPesti);

		btnNemo = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/nemo_ic.png")));
		btnNemo.setBounds(1074, 76, 95, 56);
		frmAcvariu.getContentPane().add(btnNemo);

		btnGoldfish = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/goldfish_ic.png")));
		btnGoldfish.setBounds(948, 76, 95, 56);
		frmAcvariu.getContentPane().add(btnGoldfish);

		btnStarfish = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/starfish_ic.png")));
		btnStarfish.setBounds(948, 142, 95, 56);
		frmAcvariu.getContentPane().add(btnStarfish);
		

		btnCastel = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/castel_ic.png")));
		btnCastel.setBounds(1204, 208, 95, 56);
		frmAcvariu.getContentPane().add(btnCastel);

		btnPearlshell = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/pearlshell_ic.png")));
		btnPearlshell.setBounds(1204, 142, 95, 56);
		frmAcvariu.getContentPane().add(btnPearlshell);

		btnFish_food = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/fish_food_ic.png")));
		btnFish_food.setBounds(948, 274, 95, 56);
		frmAcvariu.getContentPane().add(btnFish_food);

		btnScoici = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/scoici_ic.png")));
		btnScoici.setBounds(1074, 142, 95, 56);
		frmAcvariu.getContentPane().add(btnScoici);

		btnCoral = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/coral_ic.png")));
		btnCoral.setBounds(1074, 208, 95, 56);
		frmAcvariu.getContentPane().add(btnCoral);

		btnTurtle = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/turtle_ic.png")));
		btnTurtle.setBounds(1204, 76, 95, 56);
		frmAcvariu.getContentPane().add(btnTurtle);

		btnPesti1 = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/fish1_ic.png")));
		btnPesti1.setBounds(1074, 10, 95, 56);
		frmAcvariu.getContentPane().add(btnPesti1);

		btnPesti2 = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/fish2_ic.png")));
		btnPesti2.setBounds(1204, 10, 95, 56);
		frmAcvariu.getContentPane().add(btnPesti2);

		btnGenerare = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/gear_ic.png")));
		btnGenerare.setBounds(1074, 274, 95, 56);
		frmAcvariu.getContentPane().add(btnGenerare);

		btnResetare = new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/reset_ic.png")));
		btnResetare.setEnabled(true);
		btnResetare.setBounds(1204, 274, 95, 56);
		frmAcvariu.getContentPane().add(btnResetare);
	
		//labels ajutatoare pentru imaginile care vor aparea in acvariu in urma apasarii butoanelor definite mai sus (idem pt toate celelalte)
		//initial nu se afiseaza nicio imagine in acvariu
		desenCastel=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/castel.png")));
		desenCastel.setBounds(355, 419, 170, 252);
		desenCastel.setBorder(null);
		desenCastel.setBorderPainted(false);
		desenCastel.setContentAreaFilled(false);
		desenCastel.setOpaque(false);
		frmAcvariu.getContentPane().add(desenCastel);
		desenCastel.setVisible(false);
		
		desenStarfish=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/starfish_rs.png")));
		desenStarfish.setBounds(384, 99, 127, 154);
		desenStarfish.setBorder(null);
		desenStarfish.setBorderPainted(false);
		desenStarfish.setContentAreaFilled(false);
		desenStarfish.setOpaque(false);
		frmAcvariu.getContentPane().add(desenStarfish);
		desenStarfish.setVisible(false);

		desenAlge=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/alge_rs1.png")));
		desenAlge.setBounds(726, 403, 151, 283);
		desenAlge.setBorder(null);
		desenAlge.setBorderPainted(false);
		desenAlge.setContentAreaFilled(false);
		desenAlge.setOpaque(false);
		frmAcvariu.getContentPane().add(desenAlge);
		desenAlge.setVisible(false);

		desenAlge1=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/alge_rs1.png")));
		desenAlge1.setBounds(43, 399, 151, 272);
		desenAlge1.setBorder(null);
		desenAlge1.setBorderPainted(false);
		desenAlge1.setContentAreaFilled(false);
		desenAlge1.setOpaque(false);
		frmAcvariu.getContentPane().add(desenAlge1);
		desenAlge1.setVisible(false);

		desenCoral=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/coral_rs.png")));
		desenCoral.setBounds(598, 506, 127, 154);
		desenCoral.setBorder(null);
		desenCoral.setBorderPainted(false);
		desenCoral.setContentAreaFilled(false);
		desenCoral.setOpaque(false);
		frmAcvariu.getContentPane().add(desenCoral);
		desenCoral.setVisible(false);

		desenGoldfish=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/goldfish_rs.png")));
		desenGoldfish.setBounds(509, 238, 127, 154);
		desenGoldfish.setBorder(null);
		desenGoldfish.setBorderPainted(false);
		desenGoldfish.setContentAreaFilled(false);
		desenGoldfish.setOpaque(false);
		frmAcvariu.getContentPane().add(desenGoldfish);
		desenGoldfish.setVisible(false);

		desenNemo=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/nemo_rs.png")));
		desenNemo.setBounds(141, 238, 153, 154);
		desenNemo.setBorder(null);
		desenNemo.setBorderPainted(false);
		desenNemo.setContentAreaFilled(false);
		desenNemo.setOpaque(false);
		frmAcvariu.getContentPane().add(desenNemo);
		desenNemo.setVisible(false);

		desenPearlshell=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/pearlshell_rs.png")));
		desenPearlshell.setBounds(372, 329, 127, 154);
		desenPearlshell.setBorder(null);
		desenPearlshell.setBorderPainted(false);
		desenPearlshell.setContentAreaFilled(false);
		desenPearlshell.setOpaque(false);
		frmAcvariu.getContentPane().add(desenPearlshell);
		desenPearlshell.setVisible(false);

		desenScoici=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/scoici_rs.png")));
		desenScoici.setBounds(491, 587, 108, 110);
		desenScoici.setBorder(null);
		desenScoici.setBorderPainted(false);
		desenScoici.setContentAreaFilled(false);
		desenScoici.setOpaque(false);
		frmAcvariu.getContentPane().add(desenScoici);
		desenScoici.setVisible(false);

		desenScoici1=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/scoici1_rs.png")));
		desenScoici1.setBounds(239, 587, 127, 99);
		desenScoici1.setBorder(null);
		desenScoici1.setBorderPainted(false);
		desenScoici1.setContentAreaFilled(false);
		desenScoici1.setOpaque(false);
		frmAcvariu.getContentPane().add(desenScoici1);
		desenScoici1.setVisible(false);

		desenPesti=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/fish_rs.png")));
		desenPesti.setBounds(634, 342, 127, 154);
		desenPesti.setBorder(null);
		desenPesti.setBorderPainted(false);
		desenPesti.setContentAreaFilled(false);
		desenPesti.setOpaque(false);
		frmAcvariu.getContentPane().add(desenPesti);
		desenPesti.setVisible(false);

		desenPesti1=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/fish1_rs.png")));
		desenPesti1.setBounds(219, 99, 127, 154);
		desenPesti1.setBorder(null);
		desenPesti1.setBorderPainted(false);
		desenPesti1.setContentAreaFilled(false);
		desenPesti1.setOpaque(false);
		frmAcvariu.getContentPane().add(desenPesti1);
		desenPesti1.setVisible(false);

		desenPesti2=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/fish2_rs.png")));
		desenPesti2.setBounds(646, 99, 127, 154);
		desenPesti2.setBorder(null);
		desenPesti2.setBorderPainted(false);
		desenPesti2.setContentAreaFilled(false);
		desenPesti2.setOpaque(false);
		frmAcvariu.getContentPane().add(desenPesti2);
		desenPesti2.setVisible(false);

		desenFish_food=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/fish_food.png")));
		desenFish_food.setBounds(859, 596, 127, 137);
		desenFish_food.setBorder(null);
		desenFish_food.setBorderPainted(false);
		desenFish_food.setContentAreaFilled(false);
		desenFish_food.setOpaque(false);
		frmAcvariu.getContentPane().add(desenFish_food);
		desenFish_food.setVisible(false);

		desenTurtle=new JButton(new ImageIcon(Demo.class.getResource("/imagini_acvariu/turle_rs.png")));
		desenTurtle.setBounds(204, 361, 162, 231);
		desenTurtle.setBorder(null);
		desenTurtle.setBorderPainted(false);
		desenTurtle.setContentAreaFilled(false);
		desenTurtle.setOpaque(false);
		frmAcvariu.getContentPane().add(desenTurtle);
		desenTurtle.setVisible(false);

		//label pentru acvariu (in care vor aparea ulterior imaginile generate de butoane)
		lbAcvariu = new JLabel("");
		lbAcvariu.setIcon(new ImageIcon(new ImageIcon(Demo.class.getResource("/imagini_acvariu/acvariu_mare_final.png")).getImage()
				.getScaledInstance(892, 750, Image.SCALE_SMOOTH)));
		lbAcvariu.setBounds(10, 0, 892, 750);
		frmAcvariu.getContentPane().add(lbAcvariu);
		lbAcvariu.setVisible(true);

		//initializare textArea pentru descrierea elementelor adaugte in acvariu
		textArea = new JTextArea();
		textArea.setBounds(1033, 340, 293, 380);
		textArea.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		frmAcvariu.getContentPane().add(textArea);
		textArea.setOpaque(false);
		textArea.setVisible(true);
		textArea.setEditable(false);

		//label pentru fundalul frame-ului
		background= new JLabel("");
		background.setIcon(new ImageIcon(new ImageIcon(Demo.class.getResource("/imagini_acvariu/fundal1_final.png")).getImage()
				.getScaledInstance(1350, 780, Image.SCALE_SMOOTH)));
		background.setBounds(0,0, 1350, 780);
		frmAcvariu.getContentPane().add(background);
		background.setVisible(true);

		//adaugarea unui singur ascultator pentru toate butoanele
		btnAlge.addActionListener(this);
		btnCastel.addActionListener(this);
		btnCoral.addActionListener(this);
		btnFish_food.addActionListener(this);
		btnGoldfish.addActionListener(this);
		btnNemo.addActionListener(this);
		btnPearlshell.addActionListener(this);
		btnPesti.addActionListener(this);
		btnPesti1.addActionListener(this);
		btnPesti2.addActionListener(this);
		btnScoici.addActionListener(this);
		btnStarfish.addActionListener(this);
		btnTurtle.addActionListener(this);
		btnGenerare.addActionListener(this);
		btnResetare.addActionListener(this);

		//adaugare unui singur mouseListener pentru toate butoanele ce reprezeinta elementele adaugate sau scoase din acvariu
		desenCastel.addMouseListener(this);
		desenStarfish.addMouseListener(this);
		desenGoldfish.addMouseListener(this);
		desenCoral.addMouseListener(this);
		desenFish_food.addMouseListener(this);
		desenNemo.addMouseListener(this);
		desenScoici.addMouseListener(this);
		desenScoici1.addMouseListener(this);
		desenPearlshell.addMouseListener(this);
		desenPesti.addMouseListener(this);
		desenPesti1.addMouseListener(this);
		desenPesti2.addMouseListener(this);
		desenAlge.addMouseListener(this);
		desenAlge1.addMouseListener(this);
		desenTurtle.addMouseListener(this);
	}

	
	//implementarea asculatorului pentru toate butoanele
	//sursa evenimentului este comparata in fiecare if cu butoanele
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//verificare nr_alge
		//daca nr_alge este 0, va aparea o pereche de alge in coltul din stanga al acvariului, cu setare label sa fie vizibil
		//daca nr_alge este 1, va aparea o pereche de alge in coltul din dreapta al acvariului, cu setare label sa fie vizibil
		if (e.getSource() == btnAlge) {
			if (nr_alge == 0) {
				nr_alge++;
				desenAlge.setVisible(true);
			} else if (nr_alge == 1) {
				nr_alge++;
				desenAlge1.setVisible(true);
			}
		}
		
		//verificare nr_pesti
		//daca nr_pesti este 0, va aparea un peste in acvariu, cu setare label sa fie vizibil
		//idem si pentru butoanele: Castel,Coral,Starfish,Goldfish,Pesti1,Pesti2,Pearlshell,Nemo,Fish_food,Turtle
		if (e.getSource() == btnPesti) {
			if (nr_pesti == 0) {
				nr_pesti++;
				desenPesti.setVisible(true);
			}
		}

		if (e.getSource() == btnNemo) {
			if (nr_nemo == 0) {
				nr_nemo ++;
				desenNemo.setVisible(true);
			}

		}

		if (e.getSource() == btnGoldfish) {
			if (nr_goldfish == 0) {
				nr_goldfish ++;
				desenGoldfish.setVisible(true);
			}

		}

		if (e.getSource() == btnStarfish) {
			if (nr_starfish == 0) {
				nr_starfish ++;
				desenStarfish.setVisible(true);
			}

		}

		if (e.getSource() == btnCastel) {
			if (nr_castel == 0) {
				nr_castel ++;
				desenCastel.setVisible(true);
			}

		}

		if (e.getSource() == btnPearlshell) {
			if (nr_pearlshell == 0) {
				nr_pearlshell ++;
				desenPearlshell.setVisible(true);
			}

		}

		if (e.getSource() == btnFish_food) {
			if (nr_fish_food == 0) {
				nr_fish_food ++;
				desenFish_food.setVisible(true);
			}

		}

		//verificare nr_alge
		//daca nr_alge este 0, va aparea o scoica in dreapta castelului, cu setare label sa fie vizibil
		//daca nr_alge este 1, va aparea o scoica in stanga castelului, cu setare label sa fie vizibil
		if (e.getSource() == btnScoici) {
			if (nr_scoici == 0) {
				nr_scoici++;
				desenScoici.setVisible(true);
			} else if (nr_scoici == 1) {
				nr_scoici++;
				desenScoici1.setVisible(true);
			}

		}

		if (e.getSource() == btnCoral) {
			if (nr_coral == 0) {
				nr_coral ++;
				desenCoral.setVisible(true);
			}

		}

		if (e.getSource() == btnTurtle) {
			if (nr_turtle == 0) {
				nr_turtle ++;
				desenTurtle.setVisible(true);
			}

		}

		if (e.getSource() == btnPesti1) {
			if (nr_pesti1 == 0) {
				nr_pesti1++;
				desenPesti1.setVisible(true);
			}

		}

		if (e.getSource() == btnPesti2) {
			if (nr_pesti2 == 0) {
				nr_pesti2++;
				desenPesti2.setVisible(true);
			}

		}
		
		
		//pentru fiecare nr de elemente in parte, se creeaza un obiect corespunzator clasei elementului pe care vrem sa-l adaugam in acvariu
		//la apasarea mai multor butoane (nu obligatoriu toate) se actualizeaza ac
		//de exemplu, daca se apasa butonul pentru Castel si butonul pentru Pearlshell, efectul este urmatorul:
		//ac=new Pearlshell(new Castel(new AcvariuImpl()))
		if (e.getSource() == btnGenerare) {
			if (nr_pesti == 1) {
				ac = new Pesti(ac);
			}
			if (nr_nemo == 1) {
				ac = new Nemo(ac);
			}
			if (nr_goldfish == 1) {
				ac = new Goldfish(ac);
			}
			if (nr_coral == 1) {
				ac = new Coral(ac);
			}
			if (nr_castel == 1) {
				ac = new Castel(ac);
			}
			if (nr_fish_food == 1) {
				ac = new Fish_food(ac);
			}
			if (nr_starfish == 1) {
				ac = new Starfish(ac);
			}
			if (nr_turtle == 1) {
				ac = new Turtle(ac);
			}
			if (nr_pesti1 == 1) {
				ac = new Pesti1(ac);
			}
			if (nr_pesti2 == 1) {
				ac = new Pesti2(ac);
			}
			if (nr_pearlshell == 1) {
				ac = new Pearlshell(ac);
			}
			int nr_scoici_copy = nr_scoici;
			while (nr_scoici_copy > 0) {
				ac = new Scoici(ac);
				nr_scoici_copy--;
			}
			int nr_alge_copy = nr_alge;
			while (nr_alge_copy > 0) {
				ac = new Alge(ac);
				nr_alge_copy--;
			}
			//System.out.println(ac.adauga_in_acvariu());
			//setare text pe null, pentru a pastra doar ultimele modificari, impreuna cu cele de dinainte, o singura data
			textArea.setText(null);
			textArea.setText(ac.adauga_in_acvariu().toString());
			//reinitializare acvariu
			ac = new AcvariuImpl();

		}
		
		//reinitializare acvariu
		//setare butoane sa nu fie vizibile, acvariul va fi golit, revenind la starea initiala
		//se reseteaza de asemenea si numarul corespunzator fiecarui element in parte, iar textul continand elementele adaugate anterior va disparea
		if (e.getSource() == btnResetare) {
			ac = new AcvariuImpl();
			desenCastel.setVisible(false);
			desenCoral.setVisible(false);
			desenAlge.setVisible(false);
			desenAlge1.setVisible(false);
			desenPesti1.setVisible(false);
			desenPesti2.setVisible(false);
			desenPesti.setVisible(false);
			desenFish_food.setVisible(false);
			desenNemo.setVisible(false);
			desenStarfish.setVisible(false);
			desenPearlshell.setVisible(false);
			desenScoici.setVisible(false);
			desenScoici1.setVisible(false);
			desenGoldfish.setVisible(false);
			desenTurtle.setVisible(false);
			nr_pesti = nr_scoici = nr_nemo = nr_goldfish = nr_coral = nr_castel = nr_fish_food = nr_alge = nr_starfish = nr_pearlshell = nr_turtle = nr_pesti1 = nr_pesti2 = 0;
			textArea.setText(null);

		}

	}
	
	//implementarea unui singur MouseListener pentru toate butoanele de decorare ale acvariului
	//sursa evenimentului este comparata in fiecare if cu butoanele
	//un element din acvariu va disparea daca se da click pe imaginea sa corespunzatoare
	//de asemenea, va fi decrementat numarul de elemente din fiecare buton/desen
	//butonul corespunzator va fi setat sa nu fie vizibil
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == desenStarfish) {
			desenStarfish.setVisible(false);
			nr_starfish--;
		}
		if (e.getSource() == desenCastel) {
			desenCastel.setVisible(false);
			nr_castel--;
		}
		if (e.getSource() == desenStarfish) {
			desenStarfish.setVisible(false);
			nr_starfish--;
		}
		if (e.getSource() == desenCoral) {
			desenCoral.setVisible(false);
			nr_coral--;
		}
		if (e.getSource() == desenFish_food) {
			desenFish_food.setVisible(false);
			nr_fish_food--;
		}
		if (e.getSource() == desenNemo) {
			desenNemo.setVisible(false);
			nr_nemo--;
		}
		if (e.getSource() == desenScoici) {
			desenScoici.setVisible(false);
			nr_scoici--;
		}
		if (e.getSource() == desenScoici1) {
			desenScoici1.setVisible(false);
			nr_scoici--;
		}
		if (e.getSource() == desenPearlshell) {
			desenPearlshell.setVisible(false);
			nr_pearlshell--;
		}
		if (e.getSource() == desenPesti) {
			desenPesti.setVisible(false);
			nr_pesti--;
		}
		if (e.getSource() == desenPesti1) {
			desenPesti1.setVisible(false);
			nr_pesti1--;
		}
		if (e.getSource() == desenPesti2) {
			desenPesti2.setVisible(false);
			nr_pesti2--;
		}
		if (e.getSource() == desenAlge) {
			desenAlge.setVisible(false);
			nr_alge--;
		}
		if (e.getSource() == desenAlge1) {
			desenAlge1.setVisible(false);
			nr_alge--;
		}
		if (e.getSource() == desenTurtle) {
			desenTurtle.setVisible(false);
			nr_turtle--;
		}
		if (e.getSource() == desenGoldfish) {
			desenGoldfish.setVisible(false);
			nr_goldfish--;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
