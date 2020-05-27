/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loginjsf.beans;

import Loginjsf.controlador.ControladorUsuarios;
import Loginjsf.modelo.Usuario;
import com.listase.utilidades.JsfUtil;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author cesar.cardona
 */
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private boolean verPanelLogin = false;
    private String textoSaludo = "";
    private short contadorSaludos = 0;
    private String correo;
    private String contrasenia;
    private ControladorUsuarios controlUsuarios;

    public LoginBean() {
        controlUsuarios = new ControladorUsuarios();
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public short getContadorSaludos() {
        return contadorSaludos;
    }

    public void setContadorSaludos(short contadorSaludos) {
        this.contadorSaludos = contadorSaludos;
    }

    public String getTextoSaludo() {
        return textoSaludo;
    }

    public void setTextoSaludo(String textoSaludo) {
        this.textoSaludo = textoSaludo;
    }

    public boolean isVerPanelLogin() {
        return verPanelLogin;
    }

    public void setVerPanelLogin(boolean verPanelLogin) {
        this.verPanelLogin = verPanelLogin;
    }

    public void habilitarOdeshabilitarLogin() {
        verPanelLogin = !verPanelLogin;
    }

    public void aumentarSaludos() {
        contadorSaludos++;
    }

   
    public String ingresar() {
        Usuario usuarioEncontrado = controlUsuarios.encontrarUsuarioxCorreo(correo);
        if (usuarioEncontrado != null) {
            //encontro el usuario
            if (usuarioEncontrado.getContrasenia().equals(contrasenia)) 
            {
                return "desLogin";
            }

        } 
      
            JsfUtil.addErrorMessage("los datos ingresados no son correctos ");

        

        return null;
    }
}

