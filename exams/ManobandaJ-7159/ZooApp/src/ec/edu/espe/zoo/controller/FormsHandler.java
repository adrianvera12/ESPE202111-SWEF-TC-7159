/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.controller;


import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class FormsHandler {
    public static void goToMainScreen(JFrame jFrameToClose){
        FrmZooApp frmZooApp = new FrmZooApp();
        jFrameToClose.setVisible(false);
        frmZooApp.setVisible(true);
    }
}