/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person leonardo = new Person("Leonardo", "Moncada", 1.79f, 23);
        Person belen = new Person("Belen", "Acuña", 1.63f, 20);
        Person maria = new Person("Maria", "Hernandez", 1.58f, 25);
        Person carlos = new Person("Carlos", "Bustamante", 1.65f, 38);
        Person humberto = new Person("Humberto", "Calder", 1.70f, 43);
        Person pablo = new Person("Pablo", "Moncada", 1.74f, 30);
        
        
        ArrayList<Person> people = new ArrayList<>();
        people.add(belen);
        people.add(leonardo);
        people.add(maria);
        people.add(carlos);
        people.add(humberto);
        people.add(pablo);
        
        for(Person person : people){
            System.out.println(person);
        }
    }
    
}
