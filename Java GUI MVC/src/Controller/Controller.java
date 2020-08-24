/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.View;

/**
 *
 * @author black
 */
public class Controller implements ActionListener{
    private Model m;
    private View v;

    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;
        v.setVisible(true);
        
        v.getBtnEnter1().setActionCommand("Enter");
        v.getBtnClear().setActionCommand("Clear");
        
        v.getBtnEnter1().addActionListener(this);
        v.getBtnClear().addActionListener(this);
    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
        String comman = e.getActionCommand();
        if(comman.equals("Enter")){
        String order = v.getTxtName3().getText();
        System.out.print(order);
            if(!order.equals("")){
                m.setOrder(order);
                //เบอร์ไข่
                int egg = Integer.parseInt(order.substring(0,1));
                System.out.print(egg);
                //จำนวน
                int numegg = Integer.parseInt(order.substring(2,order.length()-2));
                System.out.print(numegg);
                if(order.substring(1,2).equals("#")){
                    if(egg == 0){
                        int onumegg = m.getNumegg0();
                        int price = Integer.parseInt(order.substring(order.length()-1));
                        int oprice = m.getTotal0();
                        price = price * numegg ;
                        oprice = oprice - price;
                        m.setTotal0(oprice);
                        numegg = numegg + onumegg;
                        m.setNumegg0(numegg);
                    }
                    else if(egg == 1){
                        int onumegg = m.getNumegg1();
                        int price = Integer.parseInt(order.substring(order.length()-1));
                        int oprice = m.getTotal1();
                        price = price * numegg ;
                        oprice = oprice - price;
                        m.setTotal1(oprice);
                        numegg = numegg + onumegg;
                        m.setNumegg1(numegg);
                    }
                    else if(egg == 2){
                        int onumegg = m.getNumegg2();
                        int price = Integer.parseInt(order.substring(order.length()-1));
                        int oprice = m.getTotal2();
                        price = price * numegg ;
                        oprice = oprice - price;
                        m.setTotal2(oprice);
                        numegg = numegg + onumegg;
                        m.setNumegg2(numegg);
                    }
                    else if(egg == 3){
                        int onumegg = m.getNumegg3();
                        int price = Integer.parseInt(order.substring(order.length()-1));
                        int oprice = m.getTotal3();
                        price = price * numegg ;
                        oprice = oprice - price;
                        m.setTotal3(oprice);
                        numegg = numegg + onumegg;
                        m.setNumegg3(numegg);
                    }
                    else if(egg == 4){
                        int onumegg = m.getNumegg4();
                        int price = Integer.parseInt(order.substring(order.length()-1));
                        int oprice = m.getTotal4();
                        price = price * numegg ;
                        oprice = oprice - price;
                        m.setTotal4(oprice);
                        numegg = numegg + onumegg;
                        m.setNumegg4(numegg);
                    }
                }
                if(order.substring(1,2).equals("*")){
                    if(egg == 0){
                        int onumegg = m.getNumegg0();
                        if(onumegg>numegg){
                        numegg = numegg - onumegg;
                        int price = Integer.parseInt(order.substring(order.length()-1));
                        int oprice = m.getTotal0();
                        price = price * numegg ;
                        oprice = oprice + price;
                        m.setTotal0(oprice);
                        m.setNumegg0(numegg);}
                    }
                    else if(egg == 1){
                        int onumegg = m.getNumegg1();
                        if(onumegg>numegg){
                        numegg = numegg - onumegg;
                        int price = Integer.parseInt(order.substring(order.length()-1));
                        int oprice = m.getTotal1();
                        price = price * numegg ;
                        oprice = oprice + price;
                        m.setTotal1(oprice);
                        m.setNumegg1(numegg);}
                    }
                    else if(egg == 2){
                        int onumegg = m.getNumegg2();
                        if(onumegg>numegg){
                        numegg = numegg - onumegg;
                        int price = Integer.parseInt(order.substring(order.length()-1));
                        int oprice = m.getTotal2();
                        price = price * numegg ;
                        oprice = oprice + price;
                        m.setTotal2(oprice);
                        m.setNumegg2(numegg);}
                    }
                    if(egg == 3){
                        int onumegg = m.getNumegg3();
                        if(onumegg>numegg){
                        numegg = numegg - onumegg;
                        int price = Integer.parseInt(order.substring(order.length()-1));
                        int oprice = m.getTotal3();
                        price = price * numegg ;
                        oprice = oprice + price;
                        m.setTotal3(oprice);
                        m.setNumegg3(numegg);}
                    }
                    if(egg == 4){
                        int onumegg = m.getNumegg4();
                       if(onumegg>numegg){
                        numegg = numegg - onumegg;
                        int price = Integer.parseInt(order.substring(order.length()-1));
                        int oprice = m.getTotal4();
                        price = price * numegg ;
                        oprice = oprice + price;
                        m.setTotal4(oprice);
                        m.setNumegg4(numegg);}
                    }
        }
        //v.show(m);
        //v.getTxtName3().setText("");
                if(order.length()== 3){//#*0
                    if(order.substring(2,2).equals("0")){
                        int total = m.getTotal0();
                        String name = String(total);
                        if(total > 0) v.getTxtName3().setText("ได้กำไร"+name);
                        v.getTxtName3().setText("ขาดทุน"+name);
                    }
                    if(order.substring(2,2).equals("1")){
                        int total = m.getTotal1();
                        String name = String(total);
                        if(total > 0) v.getTxtName3().setText("ได้กำไร"+name);
                        v.getTxtName3().setText("ขาดทุน"+name);
                    }
                    if(order.substring(2,2).equals("2")){
                        int total = m.getTotal2();
                        String name = String(total);
                        if(total > 0) v.getTxtName3().setText("ได้กำไร"+name);
                        v.getTxtName3().setText("ขาดทุน"+name);
                    }
                    if(order.substring(2,2).equals("3")){
                        int total = m.getTotal3();
                        String name = String(total);
                        if(total > 0) v.getTxtName3().setText("ได้กำไร"+name);
                        v.getTxtName3().setText("ขาดทุน"+name);
                    }
                    if(order.substring(2,2).equals("4")){
                        int total = m.getTotal4();
                        String name = String(total);
                        if(total > 0) v.getTxtName3().setText("ได้กำไร"+name);
                        v.getTxtName3().setText("ขาดทุน"+name);
                    }
        }
        }
        if(comman.equals("Clear")){
        
        v.getTxtName3().setText("");
        }
      }
    
    
    }

    private String String(int total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
