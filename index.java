package railwayrail;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class index extends JFrame implements ActionListener {
	private JPanel contentPane;
    private JButton btnNewButton_1;
    private Image backgroundImage; // Store the background image
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public index() {
		setBounds(0, 0, 1600, 860);
        contentPane = new BackgroundPanel(); // Use the custom JPanel for the content pane
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
	    
		JLabel lblNewLabel = new JLabel("RAILWAY MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(new Color(0, 0, 204));
		lblNewLabel.setBounds(450, 27, 700, 47);
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 45));
		contentPane.add(lblNewLabel);

		

		btnNewButton_1 = new JButton("ADMIN LOGIN");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Lucida Fax", Font.PLAIN, 35));
		btnNewButton_1.setBounds(550, 170, 300, 36);
		btnNewButton_1.setFocusable(false);
		contentPane.add(btnNewButton_1);
		
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
	    if(e.getSource()==btnNewButton_1){
		    	//SIGNUP
			System.out.println("Admin class");
		    	new adminclass();
		    }
		}
	
}

