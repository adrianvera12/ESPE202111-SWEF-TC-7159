/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.employeespayroll.controller;

import ec.edu.espe.employeespayroll.view.FrmMain;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class FormsHandler {
    public static void goToMainScreen(JFrame jFrameToClose){
        FrmMain frmMain = new FrmMain();
        jFrameToClose.setVisible(false);
        frmMain.setVisible(true);
    }
}
