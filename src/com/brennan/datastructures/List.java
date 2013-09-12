package com.brennan.datastructures;

public class List<E> {
	private ListNode<E> head;
	private ListNode<E> tail;
	
	public List(){
		head = new ListNode<E>();
		tail = head;
	}
	
	public void setHead(ListNode<E> head){
		this.head = head;
	}
	
	public ListNode<E> getHead(){
		return head;
	}
	
	public void addNode(ListNode<E> node){
		this.tail.setNext(node);
		this.tail = node;
	}
	
	public void printList(){
		ListNode<E> tempHead = null;
		if(head.hasNext()){
			 tempHead = head.getNext();
		}
		while(tempHead != null){
			System.out.println(tempHead.getData());
			tempHead = tempHead.getNext();
		}
	}

}
