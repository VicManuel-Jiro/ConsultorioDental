package Control;

import GUI.VentanaAgregarPaciente;
import GUI.VentanaBuscarPaciente;
import GUI.VentanaCitas;
import GUI.VentanaCuestionario;
import GUI.VentanaPacientes;
import GUI.VentanaReportes;
import GUI.VentanaTablaReportes;
import GUI.citas2;
import GUI.lobby;
import GUI.buscar;
import GUI.buscarus;
import GUI.busquedaCita;
import GUI.busquedaCita1;
import GUI.creaus;
import GUI.login;
import GUI.usuarios;

public abstract interface ControlInter
{
  public abstract void setVentanaLogin(login c);
  public abstract void setVentanabusquedacita(busquedaCita c);  
  public abstract void muestraVentanaModificarCita(boolean b);
  public abstract void muestraVentanabusquedacita(boolean b);
  public abstract void setVentanabusquedacita1(busquedaCita1 c);  
  public abstract void muestraVentanabusquedacita1(boolean b);
  public abstract void muestraVentanaLogin(boolean b);
  
  public abstract void setVentanaBuscarP(buscar paramVentanaBuscarPaciente);
  
  public abstract void muestraVentanaBuscarP(boolean paramBoolean);
    
  public abstract void setVentanaLobby(lobby paramlobby);
  
  public abstract void muestraVentanaLobby(boolean paramBoolean);
  
  public abstract void setVentanaCitas(VentanaCitas paramVentanaCitas);
  
  public abstract void muestraVentanaCitas(boolean paramBoolean);
  
  public abstract void setVentanaPacientes(VentanaPacientes paramVentanaPacientes);
  
  public abstract void muestraVentanaPacientes(boolean paramBoolean);
  
  public abstract void setVentanaAgregarPaciente(VentanaAgregarPaciente paramVentanaAgregarPaciente);
  
  public abstract void muestraVentanaAgregarPacientes(boolean paramBoolean);
  
  public abstract void setVentanaAgregarCuestionario(VentanaCuestionario paramVentanaCuestionario);
  
  public abstract void muestraVentanaAgregarCuestionario(boolean paramBoolean);
  
  public abstract void setVentanaBuscarPaciente(VentanaBuscarPaciente paramVentanaBuscarPaciente);
  
  public abstract void muestraVentanaBuscarPacientes(boolean paramBoolean);
  
  public abstract void muestraVentanaEliminarPacientes(boolean paramBoolean);
  
  public abstract void muestraVentanaModificarPacientes(boolean paramBoolean);
  
  public abstract void setVentanaReportes(VentanaReportes paramVentanaReportes);
  
  public abstract void muestraVentanaReportes(boolean paramBoolean);
  
  public abstract void setVentanaTablaReportes(VentanaTablaReportes paramVentanaTablaReportes);
  
  public abstract void muestraTablaVentanaReportes(String paramString);
  
  public abstract void setcita(citas2 paramcitas2);
  
  public abstract void muestracita(boolean paramBoolean);
  
  public abstract void setClave(String paramString);
  
  public abstract String getClave();
  public abstract void setUser(String user);
  public abstract String getUser();
  
   public abstract void setVentanaus(usuarios c);

  public abstract void muestraVentanaus(boolean b);
  public abstract void setbuscarus(buscarus c);
  public abstract void muestrabuscarus(boolean b);
  public abstract void setcreaus(creaus c);
  public abstract void muestracreaus(boolean b);

}
