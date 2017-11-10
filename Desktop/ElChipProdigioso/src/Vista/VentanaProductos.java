package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;

import javax.swing.JLabel;

public class VentanaProductos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Coordinador miCoordinador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaProductos dialog = new VentanaProductos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaProductos() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNuevoProducto = new JButton("Nuevo");
		btnNuevoProducto.setBounds(21, 74, 89, 23);
		contentPanel.add(btnNuevoProducto);
		{
			JLabel lblNewLabel = new JLabel("Mantenimiento");
			lblNewLabel.setBounds(22, 49, 369, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JButton btnModificarProducto = new JButton("Modificar");
			btnModificarProducto.setBounds(120, 74, 89, 23);
			contentPanel.add(btnModificarProducto);
		}
		{
			JButton btnEliminarProducto = new JButton("Eliminar");
			btnEliminarProducto.setBounds(219, 74, 89, 23);
			contentPanel.add(btnEliminarProducto);
		}
		{
			JButton btnConsultaProducto = new JButton("Consultar");
			btnConsultaProducto.setBounds(318, 74, 89, 23);
			contentPanel.add(btnConsultaProducto);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("PRODUCTOS");
			lblNewLabel_1.setBounds(120, 11, 143, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblListados = new JLabel("Listados");
			lblListados.setBounds(31, 117, 46, 14);
			contentPanel.add(lblListados);
		}
		{
			JButton btnListarProducto = new JButton("Listado");
			btnListarProducto.setBounds(21, 142, 89, 23);
			contentPanel.add(btnListarProducto);
		}
		{
			JButton btnMinimoProducto = new JButton("Minimos");
			btnMinimoProducto.setBounds(174, 142, 89, 23);
			contentPanel.add(btnMinimoProducto);
		}
		{
			JButton btnBeneficioProducto = new JButton("Beneficio");
			btnBeneficioProducto.setBounds(318, 142, 89, 23);
			contentPanel.add(btnBeneficioProducto);
		}
		{
			JButton btnIncrementarPrecio = new JButton("Incrementar Precio");
			btnIncrementarPrecio.setBounds(21, 176, 158, 23);
			contentPanel.add(btnIncrementarPrecio);
		}
		{
			JButton btnValoracionExostencias = new JButton("ValoracionExistencias");
			btnValoracionExostencias.setBounds(249, 176, 158, 23);
			contentPanel.add(btnValoracionExostencias);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnSalir = new JButton("Salir");
				buttonPane.add(btnSalir);
			}
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}
}
