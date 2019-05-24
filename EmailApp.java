/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saad
 */
public class EmailApp
{
    public static void main(String [] args)
    {
        Email em1 = new Email("Arya", "Stark" );
        
        //em1.setAlternateEmail("thegame@saad.Game.com");
        //System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());
    }
    
}
