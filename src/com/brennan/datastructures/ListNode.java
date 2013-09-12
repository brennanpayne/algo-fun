package com.brennan.datastructures;

public class ListNode<E> extends Node<E> {
	private ListNode<E> next;
	
	public ListNode(E o) {
		super(o);
		next = null;
	}
	
	public ListNode() {
		super(null);
		next = null;
	}
	
	public boolean hasNext(){
		return next == null;
	}
	
	public ListNode<E> getNext(){
		return next;
	}
	
	public void setNext(ListNode<E> n){
		next = n;
	}
	
	public Object getData(){
		return this.data;
	}
}
