package Controlador;

import Vista.VentanaExistencias;
import Vista.VentanaIncrementar;
import Vista.VentanaMinimos;
import Vista.VentanaPrincipal;
import Vista.VentanaProductos;
import Vista.VistaBeneficios;

public class Principal {
	
	VentanaPrincipal miVentanaPrincipal;
	VentanaProductos miVentanaProductos;
	VentanaExistencias miVentanaExistencias;
	VentanaIncrementar miVentanaIncrementar;
	VentanaMinimos miVentanaMinimos;
	VistaBeneficios miVistaBeneficios;
	Coordinador miCoordinador;

	public static void main(String[] args) {
		Principal miPrincipal=new Principal();
		miPrincipal.iniciar();

	}

	private void iniciar() {
		miVentanaPrincipal=new VentanaPrincipal();
		miVentanaProductos=new VentanaProductos();
		miVentanaExistencias=new VentanaExistencias();
		miVentanaIncrementar=new VentanaIncrementar();
		miVentanaMinimos=new VentanaMinimos();
		miVistaBeneficios= new VistaBeneficios();
		
		
		
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miVentanaProductos.setCoordinador(miCoordinador);
		miVentanaExistencias.setCoordinador(miCoordinador);
		miVentanaIncrementar.setCoordinador(miCoordinador);
		miVentanaMinimos.setCoordinador(miCoordinador);
		miVistaBeneficios.setCoordinador(miCoordinador);
		
		
		miCoordinador.setMiVentanaExistencias(miVentanaExistencias);
		miCoordinador.setMiVentanaIncrementar(miVentanaIncrementar);
		miCoordinador.setMiVentanaMinimos(miVentanaMinimos);
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMiVentanaProductos(miVentanaProductos);
		miCoordinador.setMiVistaBeneficios(miVistaBeneficios);
		
		
		miVentanaPrincipal.setVisible(true);
		
		
		
	}
	
	

}
