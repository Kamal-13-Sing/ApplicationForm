package projectAWT;

import java.awt.*;
import java.awt.event.*;
public class ApplicationForm {

	public static void main(String[] args) {

//-----------------------Frame----------------------------------------------
		Frame f = new Frame("Java Application Form");
		f.setSize(1380,700);
		f.setLayout(null);
		f.setVisible(true);
	//--------------------window Closing---------------------
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
//------------------------------MenuBar and MenuItem-----------------------------------
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("File"); Menu m2 = new Menu("Edit");
		Menu m3 = new Menu("Source"); Menu m4 = new Menu("Faculty");
		Menu m5 = new Menu("Search"); Menu m6 = new Menu("Help");
		f.setMenuBar(mb); 
		mb.add(m1); mb.add(m2); mb.add(m3); mb.add(m4); mb.add(m5); mb.add(m6);
		
		MenuItem mt1 = new MenuItem("BHM");
		MenuItem mt2 = new MenuItem("BIM");
		
		MenuItem mt3 = new MenuItem("New");
		MenuItem mt4 = new MenuItem("Open File From");
		MenuItem mt5 = new MenuItem ("Recent Files");
		MenuItem mt6 = new MenuItem("Exit");
		
		MenuItem mt7 = new MenuItem("Cut");
		MenuItem mt8 = new MenuItem("Copy");
		MenuItem mt9 = new MenuItem("Paste");
		
		m2.add(mt7);m2.add(mt8);m2.add(mt9);
		m1.add(mt3);m1.add(mt4);m1.add(mt5);m1.add(mt6);
		m4.add(mt1); m4.add(mt2);
		
//-------------------University name / header-----------------------------------
		Label lbt = new Label("TRIBHUVAN UNIVERSITY");
		lbt.setBounds(515,70,380,50); //lbt.setBackground(Color.red);
		lbt.setFont(new Font("Arial",Font.BOLD,30));
		
		Label lbf = new Label("FACULTY OF MANAGEMENT");
		lbf.setBounds(565,115,280,30); //lbf.setBackground(Color.green);
		lbf.setFont(new Font("Arial",Font.BOLD,20));
		
		Label lbo = new Label("OFFICE OF THE DEAN");
		lbo.setBounds(595,145,225,20); //lbo.setBackground(Color.yellow);
		lbo.setFont(new Font("Arial",Font.BOLD,20));
		
		Label lba = new Label("Application Form for the Examination of");
		lba.setBounds(555,165,310,20); //lba.setBackground(Color.gray);
		lba.setFont(new Font("Arial",Font.BOLD,16));
		
		Label lbb = new Label("Bachelor of Information Management(BIM)");
		lbb.setBounds(465,185,335,20); //lbb.setBackground(Color.green);
		lbb.setFont(new Font("Arial",Font.BOLD,17));
		TextField tfb = new TextField();
		tfb.setBounds(800,185,140,22);
		
		Label lbn = new Label("Name of the Campus/College");
		lbn.setBounds(460,207,230,20); //lbn.setBackground(Color.green);
		lbn.setFont(new Font("Arial",Font.BOLD,17));
		TextField tfn = new TextField();
		tfn.setBounds(690,207,250,22);
		
		f.add(lbt); f.add(lbf); f.add(lbo); f.add(lba);
		f.add(lbb); f.add(tfb); f.add(lbn); f.add(tfn);

//---------------------------Photo Panel--------------------------------
		Panel pn = new Panel();
		pn.setBounds(1000,145,150,175);
		pn.setBackground(Color.yellow);
		f.add(pn);
				
		Label lbp = new Label("PP Size Photo");
		lbp.setBounds(30,70,100,30);
		lbp.setFont(new Font("Arial", Font.BOLD,13));
		pn.add(lbp);
				
	//--------------------Button for image---------------------------
		Button btp = new Button("Upload");
		btp.setFont(new Font("Arial", Font.BOLD,18));
		btp.setBackground(Color.GREEN);
		btp.setBounds(1035,320,80,25);
		f.add(btp);
				
	//----------------file Dialog for Button-------------------------
		FileDialog fd = new FileDialog(f,"File Dialog");
				
		btp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setVisible(true);
				}
			});
		
//-----------------------Middle Form / personal Info-----------------------------
		Label lbfn = new Label("Full Name in Block Letter:");
		lbfn.setBounds(352,280,203,25); //lbfn.setBackground(Color.yellow);
		lbfn.setFont(new Font("Arial",Font.BOLD,17));
		TextField tffn = new TextField();
		tffn.setBounds(558,280,340,25);
		f.add(lbfn); f.add(tffn);
		
		Label lbfd = new Label("Full Name in Devanagiri:");
		lbfd.setBounds(352,320,190,25); //lbfd.setBackground(Color.green);
		lbfd.setFont(new Font("Arial",Font.BOLD,17));
		TextField tffd = new TextField();
		tffd.setBounds(546,320,330,25);
		f.add(lbfd); f.add(tffd);
		
	//---------Nationality/DOB/Gender--------------------------
		Label lbnt = new Label("Nationality:");
		lbnt.setBounds(352,360,89,25);
		lbnt.setFont(new Font("Arial",Font.BOLD,17));
		TextField tfnt = new TextField();
		tfnt.setBounds(443,360,100,25);
		
		Label lbdb = new Label("Date of Birth:");
		lbdb.setBounds(550,360,110,25);
		lbdb.setFont(new Font("Arial",Font.BOLD,17));
		TextField tfdb = new TextField();
		tfdb.setBounds(660,360,110,25);
		
	//---------------------Gender---------------------------
		Label lbgn = new Label("Gender:");
		lbgn.setBounds(780,360,70,25);
		lbgn.setFont(new Font("Arial",Font.BOLD,17));
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cbg1 = new Checkbox("Male",false,cbg);
		cbg1.setBounds(850,360,50,25); cbg1.setFont(new Font("Arial",Font.BOLD,15));
		Checkbox cbg2 = new Checkbox("FeMale",false,cbg);
		cbg2.setBounds(910,360,70,25); cbg2.setFont(new Font("Arial",Font.BOLD,15));
		
		f.add(lbnt); f.add(tfnt); f.add(lbdb); f.add(tfdb);
		f.add(lbgn); f.add(cbg1); f.add(cbg2);
		
	//--------------------Father's name------------------------
		Label lbfsn = new Label("Father's Name:");
		lbfsn.setBounds(352,400,120,25);
		lbfsn.setFont(new Font("Arial",Font.BOLD,17));
		TextField tffsn = new TextField();
		tffsn.setBounds(480,400,290,25);	
		f.add(tffsn); f.add(lbfsn);
	
	//---------------------Mailing Address-----------------------
		Label lbma = new Label("Mailing Address:");
		lbma.setBounds(352,440,130,25);
		lbma.setFont(new Font("Arial",Font.BOLD,17));
		TextField tfma = new TextField();
		tfma.setBounds(490,440,330,25);	
		f.add(tfma); f.add(lbma);
		
	//--------------------Telephone No---------------------------
		Label lbtn = new Label("Telephone No.:");
		lbtn.setBounds(825,440,130,25);
		lbtn.setFont(new Font("Arial",Font.BOLD,17));
		TextField tftn = new TextField();
		tftn.setBounds(950,440,120,25);	
		f.add(tftn); f.add(lbtn);
		
	//------------------ Tu_Registration/Exam RollNo------------------
		Label lbtu = new Label("T.U.Registration No:");
		lbtu.setBounds(352,480,170,25);
		lbtu.setFont(new Font("Arial",Font.BOLD,17));
		TextField tftu = new TextField();
		tftu.setBounds(525,480,170,25);
		
		Label lber = new Label("Exam Roll No:-");
		lber.setBounds(720,480,120,25);
		lber.setFont(new Font("Arial",Font.BOLD,17));
		TextField tfer = new TextField();
		tfer.setBounds(850,480,120,25);
		f.add(lbtu); f.add(tftu); f.add(lber); f.add(tfer);
		
//------------------------Submit Button-------------------------------------------
		Button bt = new Button("Submit");
		bt.setFont(new Font("Arial", Font.BOLD,18));
		bt.setBackground(Color.GREEN);
		bt.setBounds(1020,550,100,30);
		f.add(bt);
		
	//----------------Dialog box for submit-------------------------
		Dialog dg = new Dialog(f,"dialog");
		dg.setSize(300,150);
		dg.setLayout(null);
		dg.setLocationRelativeTo(f);
		
		Label lbd = new Label("Are You Sure To Submit?");
		
		//dg.setLayout(new GridLayout(2,1,70,20));
		lbd.setFont(new Font("Arial", Font.BOLD,18));
		lbd.setBounds(30,50,225,25);
		dg.add(lbd); 
		
		Button btc = new Button("Cancel");
		Button bts = new Button("Submit");
		btc.setBounds(30,100,80,25);
		bts.setBounds(190,100,80,25);
		
		btc.setFont(new Font("Arial", Font.BOLD,18));
		btc.setBackground(Color.red);
		bts.setFont(new Font("Arial", Font.BOLD,18));
		bts.setBackground(Color.green);
		
		dg.add(btc); dg.add(bts); 
		
	//-----------------------ActionListener for Cancel and Submit------------------
		bts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent w) {
				dg.dispose();
			}
		});
		btc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent w) {
				dg.dispose();
			}
		});
		
	//--------------------Button action for Submit----------------------------
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				dg.setVisible(true);
			}
		});
		
		
		dg.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dg.dispose();
			}
		});
		
		
	}

}
