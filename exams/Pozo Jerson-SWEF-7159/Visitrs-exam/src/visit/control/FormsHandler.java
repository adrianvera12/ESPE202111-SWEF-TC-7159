/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visit.control;

import javax.swing.JFrame;
import visit.viem.Ticket;


/**
 *
 * @author Sebastian PC
 */
public class FormsHandler {
     public static void goToMainScreen(JFrame jFrameToClose){
       Ticket ticket  = new Ticket();
        jFrameToClose.setVisible(false);
       
     }  
}
