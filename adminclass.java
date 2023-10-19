package railwayrail;
import java.awt.Color;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
@SuppressWarnings("serial")
public class adminclass extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JTextField txtsno;
	private JTextField txtsname;
	private JTextField txtcourse;
    private Image backgroundImage; // Store the background image
	JCheckBox checkBox1,checkBox2;
	JLabel lblNewLabel_tr1,lblNewLabel_tr2;
	JButton btnNewButton,btnNewButton_1,btnNewButton_2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminclass frame = new adminclass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public adminclass() {
		setBounds(0, 0, 1600, 860);
        contentPane = new BackgroundPanel(); // Use the custom JPanel for the content pane
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 

		JLabel lblNewLabel = new JLabel("ADMIN PAGE");
		lblNewLabel.setForeground(new Color(0, 0, 204));
		lblNewLabel.setBounds(650, 27, 700, 47);
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 45));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Boarding from: ");
		lblNewLabel_1.setFont(new Font("Lucida Fax", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(new Color(0, 0, 204));
		lblNewLabel_1.setBounds(75, 118, 200, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Destination to: ");
		lblNewLabel_2.setFont(new Font("Lucida Fax", Font.PLAIN, 25));
		lblNewLabel_2.setForeground(new Color(0, 0, 204));
		lblNewLabel_2.setBounds(75, 250, 200, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date(dd-mm-yyyy): ");
		lblNewLabel_3.setFont(new Font("Lucida Fax", Font.PLAIN, 25));
		lblNewLabel_3.setForeground(new Color(0, 0, 204));
		lblNewLabel_3.setBounds(75, 370, 300, 34);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_tr1 = new JLabel();
		lblNewLabel_tr1.setForeground(new Color(0, 0, 204));
		lblNewLabel_tr1.setBounds(1000, 180, 500, 36);
		lblNewLabel_tr1.setFont(new Font("Lucida Fax", Font.PLAIN, 30));
		contentPane.add(lblNewLabel_tr1);
		
        lblNewLabel_tr2 = new JLabel();
		lblNewLabel_tr2.setForeground(new Color(0, 0, 204));
		lblNewLabel_tr2.setBounds(1000, 240, 500, 36);
		lblNewLabel_tr2.setFont(new Font("Lucida Fax", Font.PLAIN, 30));
		contentPane.add(lblNewLabel_tr2);
	
		txtsno = new JTextField();
		txtsno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtsno.setToolTipText("");
		txtsno.setBounds(75, 194, 157, 34);
		contentPane.add(txtsno);
		txtsno.setColumns(10);

		txtsname = new JTextField();
		txtsname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtsname.setColumns(10);
		txtsname.setBounds(75, 320, 157, 34);
		contentPane.add(txtsname);
		
		txtcourse = new JTextField();
		txtcourse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtcourse.setColumns(10);
		txtcourse.setBounds(75, 420, 157, 34);
		contentPane.add(txtcourse);


		btnNewButton_1 = new JButton("SEARCH TRAINS");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Lucida Fax", Font.PLAIN, 25));
		btnNewButton_1.setBounds(1050, 120, 300, 36);
		btnNewButton_1.setFocusable(false);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Book Ticket!");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setFont(new Font("Lucida Fax", Font.PLAIN, 25));
		btnNewButton_2.setBounds(1050, 370, 300, 36);
		btnNewButton_2.setFocusable(false);
		contentPane.add(btnNewButton_2);
		
		checkBox1 = new JCheckBox();
        checkBox1.setBounds(950, 185, 20, 20);
        checkBox2 = new JCheckBox();
        checkBox2.setBounds(950, 245, 20, 20);
        contentPane.add(checkBox1);
        contentPane.add(checkBox2);
        
		setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class BackgroundPanel extends JPanel {
        public BackgroundPanel() {
            ImageIcon imageIcon = new ImageIcon("C:\\Users\\Joel\\Downloads\\Untitled design (11).png"); // Provide the path to your background image
            backgroundImage = imageIcon.getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
	        lblNewLabel_tr1.setText("Krishna express             17406");
	        lblNewLabel_tr2.setText("Pinakini express            12711");
	    }
		else if(e.getSource() == btnNewButton_2) {
			String from=txtsno.getText();
			String to=txtsname.getText();
			String date=txtcourse.getText();
			System.out.println(from+" "+to+" "+date+" "+checkBox1.isSelected()+checkBox2.isSelected());
		    this.insertrows();

		}
	}
	public void insertrows() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sys","root","joel"); 			
			String from=txtsno.getText();
			String to=txtsname.getText();
			String date=txtcourse.getText();
			int tnum=0;
			if (checkBox1.isSelected()) {
				tnum=17406;
			}
			else if (checkBox2.isSelected()) {
				tnum=12711;
			}
			con.createStatement().executeUpdate("insert into railway values('"+from+"','"+to+"','"+date+"',"+tnum+")"); 
		    JOptionPane.showMessageDialog(this,"Ticket Booked Successfully!!.");  
		}
		catch(Exception e) {
			System.out.println(e);
		    JOptionPane.showMessageDialog(getParent(), "Duplication Not Allowed!!");
		}
	}
	
}


