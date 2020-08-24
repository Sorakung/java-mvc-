/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author black
 */
public class Model {
    
    //private int numegg [][] = {{0,10000,5},{1,100000,4},{2,1000000,3},{3,10000000,2},{4,1000000,1
    private String list[];

    public String[] getList() {
        return list;
    }

    public void setList(String list) {
        for(int i = 0;i<100;i++){
        if(this.list[i].equals("")){
            this.list[i] = list;
            i = 100;
        }
        }
    }
    private String order;
    private int sum = 1000000;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    private int egg = 0;
    private int egg1 = 1;
    private int egg2 = 2;
    private int egg3 = 3;
    private int egg4 = 4;
    private int Numegg0 = 100000;
    private int Numegg1 = 100000;
    private int Numegg2 = 100000;
    private int Numegg3 = 100000;
    private int Numegg4 = 100000;
    private int total0 = 0;
    private int total1 = 0;
    private int total2 = 0;
    private int total3 = 0;
    private int total4 = 0;
    //public int[][] getNumegg() {
    //    return numegg;
   // }

    public int getTotal0() {
        return total0;
    }

    public void setTotal0(int total0) {
        this.total0 = total0;
    }

    public int getTotal1() {
        return total1;
    }

    public void setTotal1(int total1) {
        this.total1 = total1;
    }

    public int getTotal2() {
        return total2;
    }

    public void setTotal2(int total2) {
        this.total2 = total2;
    }

    public int getTotal3() {
        return total3;
    }

    public void setTotal3(int total3) {
        this.total3 = total3;
    }

    public int getTotal4() {
        return total4;
    }

    public void setTotal4(int total4) {
        this.total4 = total4;
    }

    //public void setNumegg(int[][] numegg) {
    //    this.numegg = numegg;
   // }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    public int getEgg1() {
        return egg1;
    }

    public void setEgg1(int egg1) {
        this.egg1 = egg1;
    }

    public int getEgg2() {
        return egg2;
    }

    public void setEgg2(int egg2) {
        this.egg2 = egg2;
    }

    public int getEgg3() {
        return egg3;
    }

    public void setEgg3(int egg3) {
        this.egg3 = egg3;
    }

    public int getEgg4() {
        return egg4;
    }

    public void setEgg4(int egg4) {
        this.egg4 = egg4;
    }

    public int getNumegg0() {
        return Numegg0;
    }

    public void setNumegg0(int Numegg) {
        this.Numegg0 = Numegg;
    }

    public int getNumegg1() {
        return Numegg1;
    }

    public void setNumegg1(int Numegg1) {
        this.Numegg1 = Numegg1;
    }

    public int getNumegg2() {
        return Numegg2;
    }

    public void setNumegg2(int Numegg2) {
        this.Numegg2 = Numegg2;
    }

    public int getNumegg3() {
        return Numegg3;
    }

    public void setNumegg3(int Numegg3) {
        this.Numegg3 = Numegg3;
    }

    public int getNumegg4() {
        return Numegg4;
    }

    public void setNumegg4(int Numegg4) {
        this.Numegg4 = Numegg4;
    }

    public void setegg(String order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
