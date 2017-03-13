package com.epam.java_training.task;

public class ElementList<E> {
	
	private ElementList<E> next; //указатель на следующий элемент
	private E element; //непосредственно данные
	
	ElementList(){
		
		element = null;
		next = null;
	}
	
	ElementList(E element){
		
		this.element = element;
		this.next = null;
	}
	
	
	ElementList(E element, ElementList<E> next){
		
		this.element = element;
		this.next = next;
	}
	
	public E getElement(){
		
		return this.element;
	}
	
	public void setElement(E element){
		
		this.element = element;
	}
	
	public ElementList<E> getNext(){
		
		return this.next;
	}
	
	public void setNext(ElementList<E> next){
		
		this.next = next;
	}
	
	@Override
	public String toString(){
		
		String result;
		
		if (this.next == null){
			result = " [ element = " + this.element + ", next_element = " + this.next + " ]; ";
		}
		else{
			result = " [ element = " + this.element + ", next_element(get value) = " + this.next.getElement() + " ]";
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
    public boolean equals(Object object) {
		if( this == object){
			return true;
		}
		
		if (object == null){
			return false;
		}
		
		if (this.getClass() != object.getClass()){
			return false;
		}

		ElementList<E> element_compare = (ElementList<E>) object;

        if (!this.element.equals(element_compare.element)){
        	
        	return false;
        }
        
        if (this.next != null ){
        	if (!this.next.equals(element_compare.next) ){
        		return false;
        	}
        }
        
        return true;
    }
	
}
