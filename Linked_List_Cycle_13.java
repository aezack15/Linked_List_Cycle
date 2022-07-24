//Grind 75 problem # 13
//Linked List Cycle. Dins if a cycle can be created with the tail and a user defined pos

import java.util.*;

class Linked_List_Cycle_13{

	public node head;
	
	private class node{
		public int val;
		public node next;
		public node(int val){
			this.val =val;
			this.next = null;
		}	
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter list [x,y,z] > ");
		String s = in.nextLine();
		System.out.print("Enter pos > ");
		int pos = in.nextInt();
		s = s.substring(1, s.indexOf("]"));
		String[] sa = s.split(",");
		Linked_List_Cycle_13 llc = new Linked_List_Cycle_13();
		llc.makeList(sa, pos);
	}
	
	private void makeList(String[] sa, int pos){
		LinkedList<node> ll = new LinkedList<node>();
		for(int i=0; i<sa.length; i++){
			node temp = new node(Integer.parseInt(sa[i]));
			ll.push(temp);
		}
		
		if(pos >= 0 && pos < ll.size()){
			if(ll.get(pos) != null){ 
				node temp = ll.getLast();
				temp.next = ll.get(pos);
				System.out.println(true);
				System.out.println(temp.next.val);
			}
		}
		else{
			System.out.println(false);
		}
	}
}
