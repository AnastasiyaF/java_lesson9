package com.epam.java_training.task;

import java.util.NoSuchElementException;

public class ParameterList<E> {
	
	private ElementList<E> head;
	
	private int size;
	
	public ParameterList(){
		
		head = null;
		size = 0;
	}
	
	
	public int getSize(){
		
		return this.size;
	}
	
	public ElementList<E> getHead(){
		
		return this.head;
	}
	
	public ElementList<E> getTail(){
		
		return this.head;
	}
	
	public boolean isEmpty(){
		
		if (head == null){
			
			return true;
		}
		return false;
	};
	
	public void addFirstElement(E element)
	{
		ElementList<E> new_element;
		
		if (isEmpty() == true){
			
			new_element = new ElementList<E>(element, null);
			head = new_element;
		}
		else {
			
			new_element = new ElementList<E>(element, this.head);
			this.head = new_element;	
		}
		
		this.size = this.size + 1;
	}
	
	public void addLastElement(E element) 
	{  
	   ElementList<E> new_element = new ElementList<E>(element, null);;
	  
	   if (isEmpty() == true) {
		 
		   head = new_element;
	   }
	   else
	   {
		   ElementList<E> last_element = getElement(this.size - 1);
		   last_element.setNext(new_element);
	   }
	   
	   this.size = this.size + 1;
	}
	
	
	public void add(int index, E element) //Inserts the specified element at the specified position in this list and shift the current
	{  
	   ElementList<E> new_element;

	   if (isValidIndex(index) == false){
		   return;
	   };
	   
	   if (index == 0){
		   
		   addFirstElement(element);
		   return;
	   }
	   else if (index == this.size)
	   
	   {
		   addLastElement(element);
		   return;   
	   }
	   else{
		   
		   ElementList<E> current_element = getElement(index);
		   ElementList<E> current_element_previous = getElement(index-1);
		   
		   new_element = new ElementList<E>(element, current_element);
		   current_element_previous.setNext(new_element);
		   
	   }
	   
	   this.size = this.size + 1;
	}
	
	
	public void removeFirstElement() {
	      
		if (size == 0){
			throw new NoSuchElementException();
		}
		else if (size == 1){
			this.head = null;
		}
		else{
			this.head = this.head.getNext();	
		}
		
	    this.size = this.size - 1;
	}


	public void removeLastElement() {
	      
		if (size == 0){
			throw new NoSuchElementException();
		}
		else if (size == 1){
			this.head = null;
		}
		else{
			
			ElementList<E> last_element_before = getElement(size-2);
			
			last_element_before.setNext(null);	
		}
		
	    this.size = this.size - 1;
	}

	public void remove(int index) {

		 if (isValidIndex(index) == false){
			   return;
		 };
		   
		 if (index == 0){
			 removeFirstElement();
			 return;
		 }
		 else if (index == size){
			 removeLastElement();
			 return;
		 }
		 else{
			   
			 ElementList<E> current_element_before = getElement(index-1);
			 ElementList<E> current_element = getElement(index);
			 
			 current_element_before.setNext(current_element.getNext());
		 }
		   
		 this.size = this.size - 1;
	}
	
	
	public ElementList<E> getElement(int index){
		 
		 if (index == 0){
			 return this.head;
		 }
		 
		 ElementList<E> current_element = this.head;
		 
		 for (int i = 0; i < index; i++){
	                
			 current_element = current_element.getNext();
		 }
		 
		 return current_element;
		   
	};
	
	 
	public boolean contains(E element){
		
		ElementList<E> current_element = this.head;
		
		while (current_element != null) {
			
			if (current_element.getElement().equals(element)){
				return true;
			}
			
			current_element = current_element.getNext();
		}
		
		return false;
	};
	 
	
	boolean isValidIndex(int index) {
		   
        if ((index >= 0) && (index < this.size)){
        
        	return true;
        }
        
        System.out.println("Invalid values: Index: " + index + ", size: " + this.size);
        return false;
    }
	
	@Override
	public String toString() {

	    if ( isEmpty() == true){
	    	
	    	System.out.println("The list is empty");
	    }
		
		
		ElementList<E> current_element = head;
	    String current_list = "";
	    
	    while (current_element != null){
	        
	    	current_list = current_list + current_element.toString() + "\n";
	    	current_element = current_element.getNext();
	    }

	    return current_list;

	}	

}
