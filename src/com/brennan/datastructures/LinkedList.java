package com.brennan.datastructures;

public class LinkedList<E> extends List<E>  {
	private ListNode<E> head;
	private ListNode<E> tail;
	
	public LinkedList(){
		head = new ListNode<E>();
		tail = head;
	}
	
	public void setHead(ListNode<E> head){
		this.head = head;
	}
	
	public ListNode<E> getHead(){
		return head;
	}
	
	public int size(){
		return size;
	}
	
	public void addNode(ListNode<E> node){
		this.tail.setNext(node);
		this.tail = node;
		size++;
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
