/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daily.challenges;

/**
 *
 * @author Ricky
 */
public class DailyChallenges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RackManagement1 scrabbleTest = new RackManagement1();
        System.out.println(scrabbleTest.scrabble("ladilmy", "daily"));
        System.out.println(scrabbleTest.scrabble("eerriin", "eerie"));
        System.out.println(scrabbleTest.scrabble("orrpgma", "program"));
        System.out.println(scrabbleTest.scrabble("orppgma", "program"));
        System.out.println(scrabbleTest.scrabble("pizza??", "pizzazz"));
        System.out.println(scrabbleTest.scrabble("piizza?", "pizzazz"));
        System.out.println(scrabbleTest.scrabble("a??????", "program"));
        System.out.println(scrabbleTest.scrabble("b??????", "program"));
        scrabbleTest.longest("dcthoyueorza");
        scrabbleTest.longest("uruqrnytrois");
        scrabbleTest.longest("rryqeiaegicgeo??");
        scrabbleTest.longest("udosjanyuiuebr??");
        scrabbleTest.longest("vaakojeaietg????????");
    }
    
}
    
