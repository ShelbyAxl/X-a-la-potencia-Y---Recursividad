/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potenciaxy;

public class PotenciaXY {
    public static int potencia(int x, int y){
      return y==1? x : x * potencia(x,y-1);
    }
}
