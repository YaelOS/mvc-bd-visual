/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_bdvisual;

import Controlador.ControladorMDB;
import pkgModelo.MDB;
import vista.FrmUsuarios;

/**
 *
 * @author 980013684
 */
public class MVC_BDVisual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MDB objModelo=new MDB();
        
        FrmUsuarios objVista=new FrmUsuarios();
        ControladorMDB objController;
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
    }
    
}
