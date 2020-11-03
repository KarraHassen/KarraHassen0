package TotalPrice;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		//PRODUIT :
		
		Vector <Produit> vec = new Vector <Produit> (10);
		Produit a = new Produit(0,"a", 10);
		Produit b = new Produit(1,"b", 5);
		Produit c = new Produit(1,"c", 3);
		vec.add(a);
		vec.add(b);
		vec.add(c);
		System.out.println(vec.elementAt(0).getNom());
		//System.out.println(vec.remove(a));
		
		// UTILISATEUR :
		
		Vector <Utilisateur> vec1 = new Vector <Utilisateur> (10);
		Utilisateur ab = new Utilisateur(0, "a", "b");
		Utilisateur ac = new Utilisateur(0, "a", "c");
		Utilisateur ad = new Utilisateur(0, "a", "d");
		vec1.add(ab);
		vec1.add(ac);
		vec1.add(ad);
		System.out.println(vec.elementAt(1).getNom());
		
		// COMMANDER
		 Vector <LigneCde> vec2 = new Vector <LigneCde>(10);
		 LigneCde l = new LigneCde(a, 3);
		 LigneCde l1 = new LigneCde(b, 3);
		 vec2.add(l1);
		 vec2.add(l1);
		 float s = l.CalculerPrixTotale();
		 float s1 = l1.CalculerPrixTotale();
		 
		 System.out.println(s);
		 System.out.println(s1);
		
		
		
		

	}

}
