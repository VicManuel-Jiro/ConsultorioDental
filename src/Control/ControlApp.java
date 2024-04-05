package Control;

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

public class ControlApp
  implements ControlInter
{
    private busquedaCita vbcita;
    private busquedaCita1 vbcita1;
  private VentanaCitas vcitas;
  private VentanaPacientes vpaciente;
  private VentanaAgregarPaciente vapaciente;
  private VentanaBuscarPaciente vbpaciente;
  private VentanaCuestionario vCuestionario;
  private VentanaReportes vReportes;
  private VentanaTablaReportes vtReportes;
  private buscar vbuscar;
  private citas2 cita;
  private lobby vlobby;
  private String clave;
  private String user="user";
  private login vpass;
  private usuarios usuarios;
  private buscarus b;
  private creaus u;
  public void setVentanaus(usuarios c)
  {
    this.usuarios = c;
    this.usuarios.setSuperCtrl(this);
  }
  
  public void muestraVentanaus(boolean b)
  {
    this.vlobby.setVisible(!b);
    this.b.setVisible(!b);
    this.u.setVisible(!b);
    this.usuarios.setVisible(b);
  }
  public void setbuscarus(buscarus c)
  {
    this.b = c;
    this.b.setSuperCtrl(this);
  }
  
  public void muestrabuscarus(boolean b)
  {
    this.usuarios.setVisible(!b);
    this.b.setVisible(b);
  }
  public void setcreaus(creaus c)
  {
    this.u = c;
    this.u.setSuperCtrl(this);
  }
  
  public void muestracreaus(boolean b)
  {
    this.usuarios.setVisible(!b);
    this.u.setVisible(b);
  }
   public void setVentanaLogin(login c)
  {
    this.vpass = c;
    this.vpass.setSuperCtrl(this);
  }
  
  public void muestraVentanaLogin(boolean b)
  {
    this.vpass.setVisible(b);
  }
  
  public void setVentanaLobby(lobby c)
  {
    this.vlobby = c;
    this.vlobby.setSuperCtrl(this);
  }
  
  public void muestraVentanaLobby(boolean b)
  {
    this.vcitas.setVisible(!b);
    this.cita.setVisible(!b);
    this.vpaciente.setVisible(!b);
    this.vReportes.setVisible(!b);
    this.vpass.setVisible(!b);
    this.vlobby.setVisible(b);
    this.vlobby.consulta();
    this.usuarios.setVisible(!b);
  }
  

  
  public void setVentanaPacientes(VentanaPacientes c)
  {
    this.vpaciente = c;
    this.vpaciente.setSuperCtrl(this);
  }
  
  public void muestraVentanaPacientes(boolean b)
  {
    this.vlobby.setVisible(!b);
    this.vpaciente.consulta();
    this.vpaciente.setVisible(b);
    this.vapaciente.setVisible(!b);
    this.vbpaciente.setVisible(!b);
    this.vbuscar.setVisible(!b);
    this.vCuestionario.setVisible(!b);
  }
  
  public void setVentanaAgregarPaciente(VentanaAgregarPaciente c)
  {
    this.vapaciente = c;
    this.vapaciente.setSuperCtrl(this);
  }
  
  public void muestraVentanaAgregarPacientes(boolean b)
  {
    this.vapaciente.setVisible(b);
    this.vpaciente.setVisible(!b);
    this.vapaciente.agregar();
  }
  
  public void setVentanaBuscarPaciente(VentanaBuscarPaciente c)
  {
    this.vbpaciente = c;
    this.vbpaciente.setSuperCtrl(this);
  }
  
  public void muestraVentanaBuscarPacientes(boolean b)
  {
    this.vbpaciente.setVisible(b);
    this.vpaciente.setVisible(!b);
    this.vbpaciente.buscar(b);
  }
  public void setVentanaBuscarP(buscar c)
  {
    this.vbuscar = c;
    this.vbuscar.setSuperCtrl(this);
  }
  
  public void muestraVentanaBuscarP(boolean b)
  {
    this.vbuscar.setVisible(b);
    this.vpaciente.setVisible(!b);
    //this.vbuscar.buscar(b);
  }
  public void muestraVentanaEliminarPacientes(boolean b)
  {
    this.vbpaciente.eliminar(b);
    this.vbpaciente.setVisible(b);
    this.vpaciente.setVisible(!b);
  }
  
  public void muestraVentanaModificarPacientes(boolean b)
  {
    if (b)
    {
      //this.vbpaciente.modificar(b);
      
      //this.vbpaciente.setVisible(b);
      this.vbuscar.setVisible(b);
      this.vpaciente.setVisible(!b);
      this.vapaciente.setVisible(!b);
    }
    else
    {
      //this.vbpaciente.setVisible(b);
      this.vbuscar.setVisible(b);
      this.vapaciente.modificar();
      this.vapaciente.setVisible(!b);
      this.vpaciente.setVisible(b);
    }
  }
  
  public void setClave(String clave)
  {
    this.clave = clave;
  }
  
  public String getClave()
  {
    return this.clave;
  }
  public void setUser(String user)
  {
    this.user = user;
  }
  
  public String getUser()
  {
    return this.user;
  }
  public void setVentanaAgregarCuestionario(VentanaCuestionario c)
  {
    this.vCuestionario = c;
    this.vCuestionario.setSuperCtrl(this);
  }
  
  public void muestraVentanaAgregarCuestionario(boolean b)
  {
    if (b)
    {
      this.vapaciente.setVisible(!b);
      this.vCuestionario.setVisible(b);
    }
    else
    {
      this.vCuestionario.setVisible(b);
      muestraVentanaPacientes(!b);
    }
  }
  
  public void setVentanaReportes(VentanaReportes c)
  {
    this.vReportes = c;
    this.vReportes.setSuperCtrl(this);
  }
  
  public void muestraVentanaReportes(boolean b)
  {
    this.vlobby.setVisible(!b);
    this.vtReportes.setVisible(!b);
    this.vReportes.setVisible(b);
  }
  
  public void setVentanaTablaReportes(VentanaTablaReportes c)
  {
    this.vtReportes = c;
    this.vtReportes.setSuperCtrl(this);
  }
  
  public void muestraTablaVentanaReportes(String ventana)
  {
      ///*
    if (ventana != null) {
      switch (ventana)
      {
      case "pacientes" -> {
          this.vtReportes.paciente();
          this.vReportes.setVisible(false);
          this.vtReportes.setVisible(true);
            }
      case "adeudo" -> {
          this.vtReportes.adeudo();
          this.vReportes.setVisible(false);
          this.vtReportes.setVisible(true);
            }
      case "cita1" -> {
          this.vtReportes.citas();
          this.vReportes.setVisible(false);
          this.vtReportes.setVisible(true);
            }
      case "cita2" -> {
          this.vtReportes.citasxfecha();
          this.vReportes.setVisible(false);
          this.vtReportes.setVisible(true);
            }
      }
    }
    
    //*/
  }
  
  public void setcita(citas2 c)
  {
    this.cita = c;
    this.cita.setSuperCtrl(this);
  }
  
  public void muestracita(boolean b)
  {
    //this.vlobby.setVisible(!b);
      this.vcitas.setVisible(!b);
      //this.vbcita.setVisible(!b);
      this.vbcita1.setVisible(!b);
      this.cita.agregar();
      this.cita.setVisible(b);
    
  }
 public void muestraVentanaModificarCita(boolean b)
  {
    if (b)
    {
      this.vbcita.setVisible(!b);
      this.vbcita1.setVisible(!b);
      this.cita.modificar();
      this.cita.setVisible(b);
    }
    /*else
    {
      //this.vbpaciente.setVisible(b);
      this.vbuscar.setVisible(b);
      this.vapaciente.modificar();
      this.vapaciente.setVisible(!b);
      this.vpaciente.setVisible(b);
    }//*/
  }
public void setVentanabusquedacita(busquedaCita c)
  {
    this.vbcita = c;
    this.vbcita.setSuperCtrl(this);
  }
  
  public void muestraVentanabusquedacita(boolean b)
  {
      this.vcitas.setVisible(!b);
    this.vbcita.setVisible(b);
  }
    public void setVentanabusquedacita1(busquedaCita1 c)
  {
    this.vbcita1 = c;
    this.vbcita1.setSuperCtrl(this);
  }
  
  public void muestraVentanabusquedacita1(boolean b)
  {
      this.vcitas.setVisible(!b);
    this.vbcita1.setVisible(b);
  }
  public void setVentanaCitas(VentanaCitas c)
  {
    this.vcitas = c;
    this.vcitas.setSuperCtrl(this);
    
  }
  
  public void muestraVentanaCitas(boolean b)
  {
    this.vcitas.setVisible(b);
    this.cita.setVisible(!b);
    this.vbcita.setVisible(!b);
    this.vbcita1.setVisible(!b);
    this.vlobby.setVisible(!b);
    
  }
}