/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cagubcublinkedlisttest;
import java.util.LinkedList;
/**
 *
 * @author Raine
 */
public class CagubcubLinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> arcades = new LinkedList<>();
        
        arcades.add("Quantum");
        arcades.add("Round1");
        arcades.add("ClubSega");
        arcades.add("TaitoStation");
        arcades.add("QuantumPS");
        
        System.out.println("List of random Arcades:"+arcades);
        
        arcades.add(3,"SegaAkihabara1");
        System.out.println("List of random Arcades:"+arcades);
        
        String PH = arcades.get(0);
        System.out.println("Arcade in the Philippines: "+PH);
        
        arcades.set(1, "Round1US");
        System.out.println("updated list: "+arcades);
        
        String removed = arcades.remove(5);
        System.out.println("duplicate that is removed: "+removed);
        System.out.println("list of random arcades: "+arcades);
        
        arcades.addFirst("GIGOakihabara");
        System.out.println("Updated list "+arcades);
        
        arcades.addLast("Namco");
        System.out.println("Updated list "+arcades);
        
        arcades.removeFirst();
        arcades.removeLast();
        System.out.print(arcades);
    }
    
}
