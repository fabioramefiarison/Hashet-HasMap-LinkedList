/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hasset.linkedlist.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
/**
 *
 * @author fabio
 */
public class HasSetLinkedListArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // Tableau
     ArrayList<String> animaux = new ArrayList<String>();
     
     //méthode add() ajout dans le tableau
     animaux.add("cannard");
     animaux.add("serpent");
     animaux.add("lion");
     animaux.add("chat");
     
     //meéthode sort() permet de trier par ordre alphabet
     Collections.sort(animaux);
     //méthode get() permet de prendre    
     //String index = animaux.get(0);
     
     //méthode set() permet de remplacer un élément 
     //animaux.set(2, "eléphant");
     //remove() permet de supprimer un elément
     //clear() permet de supprimer tous les eléments
     //size() permet d'afficher la longeur du tableau
     /*for (int i=0; i<animaux.size(); i++){
        System.out.println(animaux.get(i)); 
     }*/
     
//liste chainée
     LinkedList<String> voitures = new LinkedList<String>();
     voitures.add("camion");
     voitures.addFirst("Mustang");
     voitures.addLast("Mazda");
     //System.out.println(voitures);
     
     // Table de hachage les valeurs associés avec des clés
    HashMap<String, String> couleurs = new HashMap<>();
    
    //méthde put() pour ajouter clés avec une valeur 
    couleurs.put("manga","mangue");
    couleurs.put("paoma","pomme");
    couleurs.put("paiso","pèche");
    
    /*KeySet() permet de prendre la clé
    for(String i : couleurs.keySet()){
        System.out.println("clé: " + i + " valeur: " + couleurs.get(i));
    }*/
    
    /*values() permet de prendre la valeur
    for(String i : couleurs.values()){
        System.out.println(i);
    }*/
    
    //utiliser HashSet pour éviter les doublons
    HashSet<String> matiere = new HashSet<String>();
    matiere.add("Français");
    matiere.add("Malagasy");
    matiere.add("Mathématique");
    matiere.add("Physique");
    matiere.add("Français");
    
    //contains() pour chéquer que l'élement est bien présent
    System.out.println(matiere.contains("Malagasy"));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
