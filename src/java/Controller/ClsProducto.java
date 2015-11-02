/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import modell.producto;

/**
 *
 * @author docente05
 */
public class ClsProducto {
    public List<producto> read_Producto(){
        ArrayList a = new ArrayList();        
        
        for(int i=0;i<=5;i++){
            producto p = new producto(); 
            p.setId("001");
            p.setName("ssss");
            p.setDescription("asdasas");
            a.add(p);
        }        
    return a;
    }
}
