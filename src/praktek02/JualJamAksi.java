/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author lina
 */
public class JualJamAksi {
    public static void main(String[] args) {
    JualJam r1 = new JualJam(); 
    r1.hrgjam = 125000;
    r1.jmlbelijam = 4;
    
    r1.cetakInfo();
    System.out.println("Total Pembelian Jam : "+r1.totalbelijam());
    r1.cetakBelijam();
    
    JualJam r2 = new JualJam();
    r2.cetakInfo();
    
    
    JualJam r3 = new JualJam(200000,12);
    r3.cetakInfo();
  }
}
