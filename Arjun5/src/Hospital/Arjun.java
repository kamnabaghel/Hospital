package Hospital;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

 class Arjun {

	JFrame frame;
	private JLabel lblPatientaddres;
	private JTextField txtNumberofTable;
	private JTextField txtStorageAdvice;
	private JLabel lblDateofbirth;
	private JLabel lblPatientname;
	private JTextField txtDose;
	private JLabel lblNhsnumber;
	private JTextField txtPossibleSideEffect;
	private JTextField txtDailyDose;
	private JLabel lblPatientid;
	private JLabel lblHowtousemedition;
	private JTextField txtFurtherinfo;
	private JLabel lblFurtherinfo;
	private JTextField txtIssuedDate;
	private JLabel lblStorageadvice;
	private JTextField txtReferenceNo;
	private JTextField txtexpDate;
	private JLabel lblNameoftable;
	private JComboBox jcmbTablets;
	private JLabel lblRefrenceno;
	private JTextField txtHowtouseMedition;
	private JLabel label_11;
	private JTextField txtDateofBirth;
	private JLabel lblNumberoftble;
	private JTextField txtPatientaddres;
	private JLabel lblIssueddate;
	private JTextField txtNHSNumber;
	private JLabel lblExpdate;
	private JTextField txtPatientName;
	private JLabel lblDailyDose;
	private JTextField txtPatientID;
	private JLabel lblPossiblesideeffect;
	private JTable table_1;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	Arjun() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1350, 759);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBorder(new MatteBorder(10, 10, 10, 10, new Color(0, 0, 0)));
		panel.setBounds(23, 11, 1314, 92);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblBirlaInstituteOf = new JLabel("BIRLA  HOSPITAL MANAGEMENT");
		lblBirlaInstituteOf.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblBirlaInstituteOf.setBounds(206, 11, 674, 70);
		panel.add(lblBirlaInstituteOf);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaption);
		panel_2.setBorder(new MatteBorder(4, 4, 4, 4, new Color(0, 0, 0)));
		panel_2.setBounds(10, 124, 1301, 594);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		lblPatientaddres = new JLabel("Patient_addres");
		lblPatientaddres.setBounds(477, 321, 177, 25);
		lblPatientaddres.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblPatientaddres);

		txtNumberofTable = new JTextField();
		txtNumberofTable.setBounds(252, 323, 215, 29);
		txtNumberofTable.setColumns(10);
		panel_2.add(txtNumberofTable);

		txtStorageAdvice = new JTextField();
		txtStorageAdvice.setBounds(672, 59, 215, 29);
		txtStorageAdvice.setColumns(10);
		panel_2.add(txtStorageAdvice);

		lblDateofbirth = new JLabel("Date _of _Birth");
		lblDateofbirth.setBounds(478, 372, 176, 25);
		lblDateofbirth.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblDateofbirth);

		lblPatientname = new JLabel("Patient _Name:");
		lblPatientname.setBounds(485, 284, 177, 25);
		lblPatientname.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblPatientname);

		txtDose = new JTextField();
		txtDose.setBounds(672, 99, 215, 29);
		txtDose.setColumns(10);
		panel_2.add(txtDose);

		lblNhsnumber = new JLabel("NHS _Number");
		lblNhsnumber.setBounds(49, 268, 156, 25);
		lblNhsnumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblNhsnumber);

		txtPossibleSideEffect = new JTextField();
		txtPossibleSideEffect.setBounds(252, 151, 215, 29);
		txtPossibleSideEffect.setColumns(10);
		panel_2.add(txtPossibleSideEffect);

		txtDailyDose = new JTextField();
		txtDailyDose.setBounds(672, 15, 215, 29);
		txtDailyDose.setColumns(10);
		panel_2.add(txtDailyDose);

		lblPatientid = new JLabel("Patient _ID:");
		lblPatientid.setBounds(506, 229, 146, 25);
		lblPatientid.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblPatientid);

		lblHowtousemedition = new JLabel("How _to _use_Medition");
		lblHowtousemedition.setBounds(41, 207, 206, 25);
		lblHowtousemedition.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblHowtousemedition);

		txtFurtherinfo = new JTextField();
		txtFurtherinfo.setBounds(672, 151, 215, 29);
		txtFurtherinfo.setColumns(10);
		panel_2.add(txtFurtherinfo);

		lblFurtherinfo = new JLabel("Further_info");
		lblFurtherinfo.setBounds(486, 149, 167, 25);
		lblFurtherinfo.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblFurtherinfo);

		txtIssuedDate = new JTextField();
		txtIssuedDate.setBounds(672, 191, 215, 29);
		txtIssuedDate.setColumns(10);
		panel_2.add(txtIssuedDate);

		lblStorageadvice = new JLabel("Storage_Advice");
		lblStorageadvice.setBounds(486, 63, 176, 25);
		lblStorageadvice.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblStorageadvice);

		txtReferenceNo = new JTextField();
		txtReferenceNo.setBounds(252, 59, 215, 29);
		txtReferenceNo.setColumns(10);
		panel_2.add(txtReferenceNo);

		txtexpDate = new JTextField();
		txtexpDate.setBounds(252, 99, 215, 29);
		txtexpDate.setColumns(10);
		panel_2.add(txtexpDate);

		lblNameoftable = new JLabel("Name_of_table");
		lblNameoftable.setBounds(33, 13, 172, 25);
		lblNameoftable.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblNameoftable);
		String country[] = { "Ibuprofen", "Perasitamol", "crocine", "disprin", "Amlodophin" };
		jcmbTablets = new JComboBox(country);
		jcmbTablets.setBounds(252, 14, 215, 30);
		jcmbTablets.setEditable(true);
		jcmbTablets.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jcmbTablets.setBackground(UIManager.getColor("Button.background"));
		jcmbTablets.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (jcmbTablets.getSelectedItem().equals("Ibuprofen")) {

					txtReferenceNo.setText("arj6786");
					// txtPatientaddres.setText("GWALIOR");
					txtexpDate.setText("MARCH 2020");

					// txtPatientName.setText("ARJUN");
					txtHowtouseMedition.setText("USE WATER NO ALCOHAL");
					// txtDateofBirth.setText("04/17/1299");
					txtNHSNumber.setText("");
					txtPatientID.setText("P67879");

					txtDailyDose.setText("2");
					txtStorageAdvice.setText("no spesial storage");
					txtDose.setText("5");
					// txtDailyDose.setText("5");
					txtFurtherinfo.setText("protect from sunlight");
					txtIssuedDate.setText("30/85/2019");
					txtNumberofTable.setText("45");
					txtPossibleSideEffect.setText("npo sode effect");
				} else if (jcmbTablets.getSelectedItem().equals("Perasitamol")) {

					txtReferenceNo.setText("arj6786");
					// txtPatientaddres.setText("GWALIOR");
					txtexpDate.setText("MARCH 2020");

					// txtPatientName.setText("ARJUN");
					txtHowtouseMedition.setText("USE WATER NO ALCOHAL");
					// txtDateofBirth.setText("04/07/1299");
					txtNHSNumber.setText("7894656");
					txtPatientID.setText("P67879");

					txtDailyDose.setText("2");
					txtStorageAdvice.setText("no spesial storage");
					txtDose.setText("5");
					txtFurtherinfo.setText(" keep away from child");
					txtIssuedDate.setText("30/02/2019");
					txtNumberofTable.setText("89");
					txtPossibleSideEffect.setText("minor side effect");
				} else if (jcmbTablets.getSelectedItem().equals("Perasitamol")) {
				}
			}
		});
		panel_2.add(jcmbTablets);

		lblRefrenceno = new JLabel("Refrence_no.");
		lblRefrenceno.setBounds(49, 63, 174, 25);
		lblRefrenceno.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblRefrenceno);

		txtHowtouseMedition = new JTextField();
		txtHowtouseMedition.setBounds(252, 209, 215, 29);
		txtHowtouseMedition.setColumns(10);
		panel_2.add(txtHowtouseMedition);

		label_11 = new JLabel("Dose (mg)");
		label_11.setBounds(506, 97, 141, 25);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(label_11);

		txtDateofBirth = new JTextField();
		txtDateofBirth.setBounds(672, 374, 215, 29);
		txtDateofBirth.setColumns(10);
		panel_2.add(txtDateofBirth);

		lblNumberoftble = new JLabel("Number_of_Tble");
		lblNumberoftble.setBounds(41, 337, 194, 25);
		lblNumberoftble.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblNumberoftble);

		txtPatientaddres = new JTextField();
		txtPatientaddres.setBounds(672, 323, 213, 29);
		txtPatientaddres.setColumns(10);
		panel_2.add(txtPatientaddres);

		lblIssueddate = new JLabel("Issued_Date:");
		lblIssueddate.setBounds(477, 189, 177, 25);
		lblIssueddate.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblIssueddate);

		txtNHSNumber = new JTextField();
		txtNHSNumber.setBounds(252, 270, 206, 29);
		txtNHSNumber.setColumns(10);
		panel_2.add(txtNHSNumber);

		lblExpdate = new JLabel("Exp _Date:");
		lblExpdate.setBounds(65, 103, 143, 25);
		lblExpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblExpdate);

		txtPatientName = new JTextField();
		txtPatientName.setBounds(672, 283, 213, 29);
		txtPatientName.setColumns(10);
		panel_2.add(txtPatientName);

		lblDailyDose = new JLabel("Daily_Dose");
		lblDailyDose.setBounds(500, 19, 177, 25);
		lblDailyDose.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblDailyDose);

		txtPatientID = new JTextField();
		txtPatientID.setBounds(672, 231, 215, 29);
		txtPatientID.setColumns(10);
		panel_2.add(txtPatientID);

		JTextArea txtPrescriptyion = new JTextArea();
		txtPrescriptyion.setBounds(926, 17, 365, 420);
		panel_2.add(txtPrescriptyion);
		txtPrescriptyion.setLineWrap(true);
		txtPrescriptyion.setColumns(43);
		txtPrescriptyion.setRows(24);
		txtPrescriptyion.setWrapStyleWord(true);

		lblPossiblesideeffect = new JLabel("Possible_side_effect");
		lblPossiblesideeffect.setBounds(33, 151, 194, 25);
		lblPossiblesideeffect.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblPossiblesideeffect);

		JButton button = new JButton("Update ");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

//int i=0;    
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				model.addRow(
						new Object[] { txtPatientID.getText(), txtPatientName.getText(), txtPatientaddres.getText(),

								txtPatientID.getText(), jcmbTablets.getSelectedItem().toString(),

								txtHowtouseMedition.getText(), txtDateofBirth.getText(), txtReferenceNo.getText(),
								txtDose.getText(), txtDailyDose.getText(), txtIssuedDate.getText(),
								txtPossibleSideEffect.getText(), txtFurtherinfo.getText(),
			 					txtPossibleSideEffect.getText(), txtStorageAdvice.getText(), txtexpDate.getText(),
								txtIssuedDate.getText(), txtHowtouseMedition.getText(), });
				// }
			}
		});
		button.setBounds(10, 414, 77, 23);
		panel_2.add(button);

		JButton button_1 = new JButton("Delete");
		button_1.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				// if (table_1.getSelectedRow() == -1) {
				try {
					int SelectedRowIndex = table_1.getSelectedRow();

					model.removeRow(SelectedRowIndex);
					JOptionPane.showMessageDialog(null, "No data to delete", " hospitamanagemenet system",
							JOptionPane.OK_OPTION);
					System.out.println("");
				} catch (Exception e) {

					// TODO: handle exception
				}

			}
		});
		button_1.setBounds(97, 414, 83, 23);
		panel_2.add(button_1);

		JButton button_2 = new JButton("Doctore");
		button_2.setBounds(190, 414, 83, 23);
		panel_2.add(button_2);

		JButton button_3 = new JButton("GP Appointment");
		button_3.setBounds(283, 414, 109, 23);
		panel_2.add(button_3);

		JButton button_4 = new JButton("Patient");
		button_4.setBounds(402, 414, 83, 23);
		panel_2.add(button_4);

		JButton button_5 = new JButton("Reset");
		button_5.setBounds(501, 414, 83, 23);
		panel_2.add(button_5);

		JButton btnPrescription = new JButton("prescription");
		btnPrescription.setBounds(594, 414, 89, 23);
		btnPrescription.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				String Qty1 = (txtReferenceNo.getText());
				// String Qty2 = (txtNameofTablet.getText());
				String Qty3 = (txtPatientaddres.getText());
				String Qty4 = (txtexpDate.getText());

				String Qty5 = (txtPatientName.getText());
				String Qty6 = (txtHowtouseMedition.getText());
				String Qty7 = (txtDateofBirth.getText());
				String Qty8 = (txtPatientID.getText());

				String Qty9 = (txtDailyDose.getText());
				String Qty11 = (txtDose.getText());
				String Qty12 = (txtIssuedDate.getText());
				String Qty13 = (txtFurtherinfo.getText());
				String Qty14 = (txtStorageAdvice.getText());
				String Qty15 = (txtPossibleSideEffect.getText());
				String Qty16 = "";
				if (jcmbTablets.getSelectedItem().equals("Ibuprofen")) {

					Qty16 = "Ibuprofen";
				} else if (jcmbTablets.getSelectedItem().equals("Perasitamol")) {

					Qty16 = "Perasitamol";
				} else if (jcmbTablets.getSelectedItem().equals("")) {

					Qty16 = "gfdgh";
				}
				// JPanel el_4 = new JPanel();
				txtPrescriptyion.setText("");
				txtPrescriptyion.append("\t\t\n HOSPITAL MANAGEMENT SYSTEM\n" +

						"+\n\t=================================\t" + "\n  PATIENT NAME\t\t" + Qty5
						+ "\n PATIENT ID \t\t" + Qty8 + "\n DATE OF BIRTH\t\t" + Qty7 + "\n PATIENT ADRESS\t\t" + Qty3
						+ "\n PRESCRIPTION\t\t" + "\n EXP.DATE\t\t" + Qty4 + "\n REFRRENCE NO.\t\t" + Qty1
						+ "\n DOSE \t\t" + Qty11 + "\n DAILY DOSE\t\t" + Qty9 + "\n NO OF TABLET\t\t" + "\n LOT\t\t"
						+ Qty1 + "\n POSSIBLE SIDE EFFECTS\t\t" + Qty15 + "\n FURTHER INFORMATION\t\t" + Qty13
						+ "\n HOW TO USE MEDITION\t\t" + Qty6 + "\n Tablet name \t\t" + Qty16 + "\nIssuedDate\t\t"
						+ Qty12 + "\n STORAGE ADVICE\t\t" + Qty14
				// "\nDate\t"+Tdate.format(timer.getTime())+
				// "\nDate\t"+Tdate.format(timer.getTime())+
						+ "\n\n\n\t THANK YOU");
			}
		});
		panel_2.add(btnPrescription);

		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(693, 414, 100, 23);
		btnPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					boolean complete = txtPrescriptyion.print();
					if (complete) {
						JOptionPane.showMessageDialog(null, "DONE printing ", "Information",
								JOptionPane.INFORMATION_MESSAGE);
					} else {

						JOptionPane.showMessageDialog(null, "printing", "printer", JOptionPane.ERROR_MESSAGE);
					}

				} catch (PrinterException e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}

			// }
		});
		panel_2.add(btnPrint);

		JButton button_9 = new JButton("Exit");
		button_9.setBounds(813, 414, 83, 23);
		button_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "confirm if  you want to exity", "billing system",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}

		});
		;
		panel_2.add(button_9);
		button_9.setBackground(Color.WHITE);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 448, 1247, 97);
		panel_2.add(scrollPane_1);

		table_1 = new JTable();
		table_1.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentRemoved(ContainerEvent arg0) {
			}
		});
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "patient_id", "patient_name", "patient address", "patient id", "tablet name",
						"no of tablet", "dose", "daily dose", "side effect", "refrence no", "exp date", "issue date",
						"how to use" }));

		JButton btnNewButton = new JButton("projectinfo");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					SAXParserFactory factory = SAXParserFactory.newInstance();
					SAXParser saxParser = factory.newSAXParser();

					DefaultHandler handler = new DefaultHandler() {

						boolean bname = false;

						boolean broll = false;
						boolean bclass = false;

						@Override
						public void startElement(String uri, String localName, String qName, Attributes attributes)
								throws SAXException {

							/// System.out.println("Start Element :" + qName);

							if (qName.equalsIgnoreCase("NAME")) {
								bname = true;
							}

							if (qName.equalsIgnoreCase("Roll_NO.")) {
								broll = true;
							}

							if (qName.equalsIgnoreCase("Class")) {
								bclass = true;
							}

						}

						@Override
						public void endElement(String uri, String localName, String qName) throws SAXException {

							// System.out.println("");

						}

						@Override
						public void characters(char ch[], int start, int length) throws SAXException {

							if (bname) {
								System.out.println(" Name : " + new String(ch, start, length));
								bname = false;
							}

							if (broll) {
								System.out.println("Roll_No : " + new String(ch, start, length));
								broll = false;
							}

							if (bclass) {
								System.out.println("Class : " + new String(ch, start, length));
								bclass = false;
							}

						}

					};

					saxParser.parse("C:/Users/arjun/Desktop/ProjectTeam.xml", handler);

				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(662, 556, 131, 27);
		panel_2.add(btnNewButton);

		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");
					Statement stmt = Con.createStatement();
					// String sid = "'12'";
					// String sname = "'ssss'";
					// String sroll = "'124'";
					String sql = "INSERT INTO `patient`(`patient_id`, `patient_name`, `patient_addr` )VALUES ("
							+ txtPatientID.getText() + ", '" + txtPatientName.getText() + "', '"
							+ txtPatientaddres.getText() + "')";

					// String sql = "INSERT INTO data " + "(`id`, `name`, `roll_no`)" + "VALUES
					// ('sid', 'sname', 'sroll')";
					stmt.executeUpdate(sql);  
				} catch (Exception e) { 

					System.out.println(e);// TODO: handle exception
				}
			}
		});
		btnSubmit.setBounds(216, 377, 89, 23);
		panel_2.add(btnSubmit);

		button_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// txtDailyDose.setText(null);
				txtReferenceNo.setText(null);
				txtPatientaddres.setText(null);
				txtexpDate.setText(null);
				txtPrescriptyion.setText(null);
				txtPatientName.setText(null);
				txtNHSNumber.setText(null);
				txtHowtouseMedition.setText(null);
				txtDateofBirth.setText(null);
				txtPatientID.setText(null);
				// txtPatientID.
				txtDailyDose.setText(null);
				txtStorageAdvice.setText(null);
				txtDose.setText(null);
				txtFurtherinfo.setText(null);
				txtIssuedDate.setText(null);
				txtNumberofTable.setText(null);
				txtPossibleSideEffect.setText(null);
			}
		});
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		return;
	}

	
}
