/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daily.challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Ricky
 */
public class RackManagement1 {
    private String builder;
    private ArrayList<String> dict;
    
    public RackManagement1() {
        builder = "";
        dict = new ArrayList<String>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Downloads\\enable1.txt"));
            String line;
            while((line = reader.readLine()) != null)
            {
                dict.add(line);
            }
            //System.out.println("Successfully read file. Testing");
            //System.out.println(dict.get(200));
            reader.close();
        }
        catch (Exception e){
            System.err.format("Exception occured trying to read file.");
            e.printStackTrace();
        }
    }
    
    public boolean scrabble(String tiles, String word){
        builder = "";
        String tilesbak = tiles;
        for (int i = 0; i < word.length(); i++){      
            Character c = word.charAt(i);
            if (check(tiles, c)) {
                tiles = tiles.replaceFirst(c.toString(), "");
                //System.out.println(tiles);
                builder = builder.concat(c.toString());
                //System.out.println(builder);
            }
            else if (tiles.contains("?")){
                tiles = tiles.replaceFirst("\\?", "");
                builder = builder.concat(c.toString());
            }
            if (builder.equals(word)){
                //System.out.println("The word, " + word + ", is possible with the tiles: " + tilesbak);
                return true;
            }
        }
        //System.out.println("The word: " + word + " is not possible with the tiles: " + tilesbak);
        return false;
    }
    
    public boolean check(String tiles, Character letter){
        for (int j = 0; j < tiles.length(); j++){
                char c = tiles.charAt(j);
                if (c == letter) {
                    //System.out.println("Found a matching letter");
                    return true; 
                }
            }
        return false;
    }
    
    public boolean longest(String tiles){
        int longest = 0;
        String longestSoFar = "";
        for (String dict1 : dict) {
            if (scrabble(tiles, dict1)){
                if(builder.length() > longest){
                    longest = builder.length();
                    longestSoFar = builder;
                }
            }
        }
        System.out.println(longestSoFar);
        return false;
    }
}
