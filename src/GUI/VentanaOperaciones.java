package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.ConversionMonedas;
import modelo.ConversionTemperatura;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class VentanaOperaciones extends JFrame {

	private JPanel PanelPrincipal;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOperaciones frame = new VentanaOperaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaOperaciones() {
		setTitle("APP CONVERSOR");
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 420);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);
				
		//Panel de conversion de Monedas		
		JPanel panelMonedas = new JPanel();
		panelMonedas.setBackground(new Color(255, 255, 255));
		panelMonedas.setBounds(100, 82, 550, 280);
		panelMonedas.setVisible(false);
		PanelPrincipal.add(panelMonedas);
		panelMonedas.setLayout(null);
		
		JLabel labelTituloMonedas = new JLabel("Conversor de Monedas");
		labelTituloMonedas.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelTituloMonedas.setBounds(185, 22, 180, 20);
		panelMonedas.add(labelTituloMonedas);
		
		JComboBox<String> comboBoxMonedas_1 = new JComboBox<>();
		comboBoxMonedas_1.setBounds(84, 90, 240, 30);
		comboBoxMonedas_1.addItem("Seleccione");
		comboBoxMonedas_1.addItem("Dólar estadounidense");
		comboBoxMonedas_1.addItem("Peso argentino");
		comboBoxMonedas_1.addItem("Sol peruano");
		comboBoxMonedas_1.addItem("Euro");
		panelMonedas.add(comboBoxMonedas_1);
		
		JLabel labelEleccionMoneda_1 = new JLabel("Eliga el tipo de moneda e ingrese un valor:");
		labelEleccionMoneda_1.setBounds(84, 67, 250, 13);
		panelMonedas.add(labelEleccionMoneda_1);
		
		JTextField textoIngresoMonedas = new JTextField();
		textoIngresoMonedas.setBounds(336, 90, 100, 30);
		panelMonedas.add(textoIngresoMonedas);
		textoIngresoMonedas.setColumns(10);
		
		JLabel lblEleccionMoneda_1 = new JLabel("Eliga el tipo de cambio:");
		lblEleccionMoneda_1.setBounds(84, 142, 242, 13);
		panelMonedas.add(lblEleccionMoneda_1);
		
		JComboBox<String> comboBoxMonedas_2 = new JComboBox<String>();
		comboBoxMonedas_2.setBounds(84, 165, 240, 30);
		comboBoxMonedas_2.addItem("Seleccione");
		comboBoxMonedas_2.addItem("Dólar estadounidense");
		comboBoxMonedas_2.addItem("Peso argentino");
		comboBoxMonedas_2.addItem("Sol peruano");
		comboBoxMonedas_2.addItem("Euro");
		panelMonedas.add(comboBoxMonedas_2);
		
		JTextField textoResultadoMonedas = new JTextField();
		textoResultadoMonedas.setEditable(false);
		textoResultadoMonedas.setColumns(10);
		textoResultadoMonedas.setBounds(336, 165, 100, 30);
		panelMonedas.add(textoResultadoMonedas);
		
		JButton btnConvertirMonedas = new JButton("CONVERTIR");
		btnConvertirMonedas.setBackground(UIManager.getColor("Button.darkShadow"));
		btnConvertirMonedas.setBounds(204, 220, 120, 21);
		btnConvertirMonedas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Obtener los valores seleccionados en los JComboBox
				String tipoConversion = comboBoxMonedas_1.getSelectedItem().toString();
				String tipoCambio = comboBoxMonedas_2.getSelectedItem().toString();
				
				// Obtener la cantidad a convertir desde el JTextField
				double cantidad = Double.parseDouble(textoIngresoMonedas.getText());
								
				ConversionMonedas resultado2 = new ConversionMonedas(tipoConversion, tipoCambio, cantidad);
				double resultadoSinFormato = resultado2.ConvertirMonedas(tipoConversion, tipoCambio, cantidad);
				
				DecimalFormat resultadoFormateado = new DecimalFormat("#,##0.00");
				textoResultadoMonedas.setText(resultadoFormateado.format(resultadoSinFormato));
				
			}
		});
		panelMonedas.add(btnConvertirMonedas);
		
		JLabel lblFondoMonedas = new JLabel("");
		lblFondoMonedas.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/Imagenes/FondoConversorMonedas.jpg")));
		lblFondoMonedas.setBounds(0, 0, 550, 280);
		panelMonedas.add(lblFondoMonedas);
		
		
		
		//Panel Conversor de Temperatura
		JPanel panelTemperatura = new JPanel();
		panelTemperatura.setBackground(new Color(255, 255, 255));
		panelTemperatura.setBounds(100, 82, 550, 280);
		panelTemperatura.setVisible(false);
		PanelPrincipal.add(panelTemperatura);
		panelTemperatura.setLayout(null);
		
		JLabel labelTituloTemp = new JLabel("Conversor de Temperatura");
		labelTituloTemp.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelTituloTemp.setBounds(180, 22, 220, 20);
		panelTemperatura.add(labelTituloTemp);
		
		JComboBox<String> comboBoxTemp_1 = new JComboBox<>();
		comboBoxTemp_1.setBounds(84, 90, 240, 30);
		comboBoxTemp_1.addItem("Seleccione");
		comboBoxTemp_1.addItem("Celsius");
		comboBoxTemp_1.addItem("Fahrenheit");
		comboBoxTemp_1.addItem("Kelvin");
		comboBoxTemp_1.addItem("Rankine");
		panelTemperatura.add(comboBoxTemp_1);
		
		JLabel labelEleccionTemp_1 = new JLabel("Eliga el tipo de temperatura e ingrese un valor:");
		labelEleccionTemp_1.setBounds(84, 67, 270, 13);
		panelTemperatura.add(labelEleccionTemp_1);
		
		JTextField textoIngresoTemp = new JTextField();
		textoIngresoTemp.setBounds(336, 90, 100, 30);
		panelTemperatura.add(textoIngresoTemp);
		textoIngresoTemp.setColumns(10);
		
		JLabel labelEleccionTemp_2 = new JLabel("Eliga el tipo de cambio:");
		labelEleccionTemp_2.setBounds(84, 142, 242, 13);
		panelTemperatura.add(labelEleccionTemp_2);
		
		JComboBox<String> comboBoxTemp_2 = new JComboBox<String>();
		comboBoxTemp_2.setBounds(84, 165, 240, 30);
		comboBoxTemp_2.addItem("Seleccione");
		comboBoxTemp_2.addItem("Celsius");
		comboBoxTemp_2.addItem("Fahrenheit");
		comboBoxTemp_2.addItem("Kelvin");
		comboBoxTemp_2.addItem("Rankine");
		panelTemperatura.add(comboBoxTemp_2);
		
		JTextField textoResultadoTemp = new JTextField();
		textoResultadoTemp.setEditable(false);
		textoResultadoTemp.setColumns(10);
		textoResultadoTemp.setBounds(336, 165, 100, 30);
		panelTemperatura.add(textoResultadoTemp);
		
		JButton btnConvertirTemp = new JButton("CONVERTIR");
		btnConvertirTemp.setBackground(UIManager.getColor("Button.darkShadow"));
		btnConvertirTemp.setBounds(204, 220, 120, 21);
		btnConvertirTemp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Obtener los valores seleccionados en los JComboBox
				String tipoConversion = comboBoxTemp_1.getSelectedItem().toString();
				String tipoCambio = comboBoxTemp_2.getSelectedItem().toString();
				
				// Obtener la cantidad a convertir desde el JTextField
				double cantidad = Double.parseDouble(textoIngresoTemp.getText());
								
				ConversionTemperatura resultado3 = new ConversionTemperatura(tipoConversion, tipoCambio, cantidad);
				double resultadoSinFormato = resultado3.ConvertirTemperaturas(tipoConversion, tipoCambio, cantidad);
				
				DecimalFormat resultadoFormateado = new DecimalFormat("#0.00");
								
				textoResultadoTemp.setText(resultadoFormateado.format(resultadoSinFormato));
				
			}
		});
		panelTemperatura.add(btnConvertirTemp);
		
		JLabel lblFondoTemp = new JLabel("");
		lblFondoTemp.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/Imagenes/FondoConversorTemperatura.jpg")));
		lblFondoTemp.setBounds(0, 0, 550, 280);
		panelTemperatura.add(lblFondoTemp);
		
		
		//Configuracion Botones de Barra
		JButton btnMonedas = new JButton("Conversor de Monedas");
		btnMonedas.setBackground(new Color(255, 255, 255));
		btnMonedas.setFont(new Font("Garamond", Font.BOLD, 14));
		btnMonedas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMonedas.setVisible(true);
				panelTemperatura.setVisible(false);
				
				}
		});
		btnMonedas.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/Imagenes/icons8-cambio-de-divisas-40.png")));
		btnMonedas.setBounds(100, 10, 270, 60);
		PanelPrincipal.add(btnMonedas);
		
		JButton btnTemperatura = new JButton("Conversor de Temperatura");
		btnTemperatura.setBackground(new Color(255, 255, 255));
		btnTemperatura.setFont(new Font("Garamond", Font.BOLD, 14));
		btnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMonedas.setVisible(false);
				panelTemperatura.setVisible(true);
			}
		});
		btnTemperatura.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/Imagenes/icons8-temperatura-64.png")));
		btnTemperatura.setBounds(380, 10, 270, 60);
		PanelPrincipal.add(btnTemperatura);
	}
}
