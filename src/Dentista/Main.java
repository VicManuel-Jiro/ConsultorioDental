package Dentista;

import Control.ControlApp;
import Control.ControlInter;
import GUI.VentanaAgregarPaciente;
import GUI.VentanaBuscarPaciente;
import GUI.VentanaCitas;
import GUI.VentanaCuestionario;
import GUI.VentanaPacientes;
import GUI.VentanaReportes;
import GUI.VentanaTablaReportes;
import GUI.buscar;
import GUI.buscarus;
import GUI.busquedaCita;
import GUI.busquedaCita1;
import GUI.citas2;
import GUI.creaus;
import GUI.lobby;
import GUI.login;
import GUI.usuarios;

public class Main
{
  public static void main(String[] args)
  {
    
    
    lobby vLobby = new lobby();
    VentanaPacientes vPaciente = new VentanaPacientes();
    VentanaCitas vCita = new VentanaCitas();
    VentanaBuscarPaciente vbPaciente = new VentanaBuscarPaciente();
    buscar vbuscar=new buscar();
    VentanaAgregarPaciente vaPaciente = new VentanaAgregarPaciente();
    VentanaCuestionario vCuestionario = new VentanaCuestionario();
    VentanaReportes vReportes = new VentanaReportes();
    VentanaTablaReportes vtReportes = new VentanaTablaReportes();
    login vpass=new login();
    citas2 cita = new citas2();
    busquedaCita bcita=new busquedaCita();
    busquedaCita1 bcita1=new busquedaCita1();
    usuarios u=new usuarios();
    buscarus b=new buscarus();
    creaus cu =new creaus();
    cu.pack();
    b.pack();
    u.pack();
    bcita.pack();
    bcita1.pack();
    cita.pack();
    vtReportes.pack();
    vReportes.pack();
    vCuestionario.pack();
    vaPaciente.pack();
    vbPaciente.pack();
    vbuscar.pack();
    vLobby.pack();
    vPaciente.pack();
    vCita.pack();
    vpass.pack();

    ControlInter ctrlPrincipal = new ControlApp();
    ctrlPrincipal.setVentanabusquedacita(bcita);
    
    ctrlPrincipal.setVentanabusquedacita1(bcita1);
    ctrlPrincipal.setVentanaLogin(vpass);
    ctrlPrincipal.setVentanaus(u);
    ctrlPrincipal.setVentanaBuscarP(vbuscar);
    ctrlPrincipal.setVentanaLobby(vLobby);
    ctrlPrincipal.setVentanaCitas(vCita);
    ctrlPrincipal.setbuscarus(b);
    ctrlPrincipal.setcreaus(cu);
    ctrlPrincipal.setVentanaPacientes(vPaciente);
    ctrlPrincipal.setVentanaBuscarPaciente(vbPaciente);
    ctrlPrincipal.setVentanaAgregarPaciente(vaPaciente);
    ctrlPrincipal.setVentanaAgregarCuestionario(vCuestionario);
    ctrlPrincipal.setVentanaReportes(vReportes);
    ctrlPrincipal.setVentanaTablaReportes(vtReportes);
    ctrlPrincipal.setcita(cita);
    
    ctrlPrincipal.muestraVentanaLogin(true);
  }
}