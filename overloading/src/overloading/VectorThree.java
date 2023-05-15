/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

/**
 *
 * @author yafiaryamaulana
 */
public class VectorThree {
     private int[] cost = new int[3];

    public VectorThree (int x, int y, int z) {
        this.cost[0] = x;
        this.cost[1] = y;
        this.cost[2] = z;
    }

    public void setCost (int in, int val) {
        this.cost[in] = val;
    }

    public int getCost (int in) {
        return this.cost[in];
    }

    public int increase (VectorThree vect) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(result+" + (" +this.cost[i] + "," +this.cost[i]+ ") = " );
            result += this.getCost(i) * vect.getCost(i);
            System.out.print(result);
        }
        return result;
    }

    public void display () {
        System.out.println("(" + this.cost[0] + ","+ this.cost[1] + ","+ this.cost[2] +")");
    }

    public VectorThree increase (int skalar) {
        VectorThree res = new VectorThree(0, 0, 0);
        for (int i = 0; i < 3; i++) {
            res.setCost(i, this.getCost(i) * skalar);
        }
        return res;
    }
}
