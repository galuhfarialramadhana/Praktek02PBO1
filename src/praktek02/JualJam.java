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
public class JualJam {
    int hrgjam;
    int jmlbelijam;
    
    void cetakInfo(){
        System.out.println("Harga Jam               : "+hrgjam);
        System.out.println("Jumlah Pembelian Jam    : "+jmlbelijam);
        
    }
    
    int totalbelijam(){
        int belijam;
        belijam = hrgjam * jmlbelijam;
        return belijam;
    }
}
