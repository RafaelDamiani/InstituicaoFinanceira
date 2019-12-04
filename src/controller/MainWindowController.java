/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author rfabini
 */
public class MainWindowController {
    public void initView(){
        java.awt.EventQueue.invokeLater(() -> {
            new view.MainWindowView().setVisible(true);
        });
    }
}