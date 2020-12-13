package dataStructures;
import java.util.*;
public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	Node temp=head;
	public  void insert(LinkedList ll,int data) {
		
		Node node=new Node(data);
		if(ll.head==null) {
			ll.head=node;
		}else {
			ll.temp.next=node;
		}
		ll.temp=node;
	}
	public void printList() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data+ " ");
			n=n.next;
		}
	}
	public LinkedList deleteNode(LinkedList ll,int key) {
		Node current=ll.head,pre=null;
		if(current!=null && current.data==key) {
			ll.head=current.next;
			System.out.println(key +" Found and deleted");
			return ll;
		}
		while(current!=null && current.data!=key) {
			pre=current;
			current=current.next;
		}
		if(current!=null) {
			pre.next=current.next;
			System.out.println(key + " found and deleted");
		}if(current==null) {
			System.out.println(key+" Key not found");
		}
		return ll;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		System.out.println("Number of Nodes");
		int n=sc.nextInt();
		System.out.println("Insert elements");
		for(int i=0;i<n;i++) {
			int data=sc.nextInt();
			ll.insert(ll,data);
		}
		ll.printList();
		System.out.println("Enter element to be deleted");
		int key=sc.nextInt();
		ll.deleteNode(ll,key);
		ll.printList();
		sc.close();
	}

}
