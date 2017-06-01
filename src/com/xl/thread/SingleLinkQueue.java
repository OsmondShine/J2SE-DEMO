package com.xl.thread;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-8
 * @description 
 * @version 1.0
 */

public class SingleLinkQueue<E> {
	class Cell{
		private Cell next;
		private E element;
		
		public Cell(E element){
			this.element = element;
		}

		/**
		 * @param next
		 * @param element
		 */
		public Cell(Cell next, E element) {
			super();
			this.next = next;
			this.element = element;
		}

		public Cell getNext() {
			return next;
		}

		public void setNext(Cell next) {
			this.next = next;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}
		
		protected Cell head;
		protected Cell tail;
		public void add(E item) {
			Cell cell = new Cell(item);
			if (tail == null){
				head = tail = cell;
			}else {
				tail.setNext(cell);
				tail = cell;
			}
		}
		
		public E remove(){
			if (head == null){
				return null;
			}
			Cell cell = head;
			head = head.getNext();
			if (head == null){
				tail = null;
			}
			return cell.getElement();
			} 
		}
	}

