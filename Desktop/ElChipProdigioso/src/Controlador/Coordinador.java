package Controlador;

import Vista.VentanaExistencias;
import Vista.VentanaIncrementar;
import Vista.VentanaMinimos;
import Vista.VentanaPrincipal;
import Vista.VentanaProductos;
import Vista.VistaBeneficios;

public class Coordinador {
	private VentanaPrincipal miVentanaPrincipal;
	private VentanaProductos miVentanaProductos;
	private VentanaExistencias miVentanaExistencias;
	private VentanaIncrementar miVentanaIncrementar;
	private VentanaMinimos miVentanaMinimos;
	private VistaBeneficios miVistaBeneficios;
	
	
	
	
	public VentanaPrincipal getMiVentanaPrincipal() {
		return miVentanaPrincipal;
	}
	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	public VentanaProductos getMiVentanaProductos() {
		return miVentanaProductos;
	}
	public void setMiVentanaProductos(VentanaProductos miVentanaProductos) {
		this.miVentanaProductos = miVentanaProductos;
	}
	public VentanaExistencias getMiVentanaExistencias() {
		return miVentanaExistencias;
	}
	public void setMiVentanaExistencias(VentanaExistencias miVentanaExistencias) {
		this.miVentanaExistencias = miVentanaExistencias;
	}
	public VentanaIncrementar getMiVentanaIncrementar() {
		return miVentanaIncrementar;
	}
	public void setMiVentanaIncrementar(VentanaIncrementar miVentanaIncrementar) {
		this.miVentanaIncrementar = miVentanaIncrementar;
	}
	public VentanaMinimos getMiVentanaMinimos() {
		return miVentanaMinimos;
	}
	public void setMiVentanaMinimos(VentanaMinimos miVentanaMinimos) {
		this.miVentanaMinimos = miVentanaMinimos;
	}
	public VistaBeneficios getMiVistaBeneficios() {
		return miVistaBeneficios;
	}
	public void setMiVistaBeneficios(VistaBeneficios miVistaBeneficios) {
		this.miVistaBeneficios = miVistaBeneficios;
	}
	
	
	public void MostrarVentanaExistencias() {
		miVentanaExistencias.setVisible(true);
	}
	public void MostrarVentanaIncrementar() {
		miVentanaIncrementar.setVisible(true);
	}
	public void MostrarVentanaMinimos() {
		miVentanaMinimos.setVisible(true);
	}
	public void MostrarVentanaPrincipal() {
		miVentanaPrincipal.setVisible(true);
	}
	public void MostrarVentanaProductos() {
		miVentanaProductos.setVisible(true);
	}
	public void MostrarVistaBeneficios() {
		miVistaBeneficios.setVisible(true);
	}
	
	
}
