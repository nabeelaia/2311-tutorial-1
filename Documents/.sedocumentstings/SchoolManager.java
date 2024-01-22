package lab5;

import java.util.*;

/**
 * This class manages employees in a school and their lists/sets.
 * Your implementation of this class or methods should not contains:
 * 1. No System.out.println statements should appear here. Instead, you need to
 * return the result. 2. No Scanner operations should appear here (e.g.,
 * input.nextInt()). Instead, refer to the input parameters of this method.
 */


/**
 * 
 * This class represents an employee in the school management system.
 * Your implementation of this class or methods should not contains:
 * 1. No System.out.println statements should appear here. Instead, you need to
 * return the result. 2. No Scanner operations should appear here (e.g.,
 * input.nextInt()). Instead, refer to the input parameters of this method.
 */
class Employee {

	    private String name;
	    private int age;
	    private String employeeId;

	    public Employee(String name, int age, String employeeId) {
	        this.name = name;
	        this.age = age;
	        this.employeeId = employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(String employeeId) {
	        this.employeeId = employeeId;
	    }

	    @Override
	    public String toString() {
	    	return   "{"+name+"(ID:"+employeeId+  ")}";
	      
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == this) {
	            return true;
	        }
	        if (obj == null || obj.getClass() != this.getClass()) {
	            return false;
	        }

	        Employee other = (Employee) obj;
	        return this.employeeId.equals(other.employeeId);
	    }

	    @Override
	    public int hashCode() {
	        return employeeId.hashCode();
	    }
	}
	
		// TODO: Your implementation starts here
		/* 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
	
	



/**
 * 
 * This class represents a container that stores objects in an array-like
 * structure. Your implementation of this class or methods should not contains:
 * 1. No System.out.println statements should appear here. Instead, you need to
 * return the result. 2. No Scanner operations should appear here (e.g.,
 * input.nextInt()). Instead, refer to the input parameters of this method.
 */
class Container {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	/**
	 * The initial size of the container.
	 */
	protected final int INITIAL_SIZE = 10;

	/**
	 * The array that holds the objects.
	 */
	protected Object[] list;

	/**
	 * The number of elements currently stored in the container.
	 */

	    protected int size;

	    public Container() {
	        list = new Object[INITIAL_SIZE];
	        size = 0;
	    }

	    public void add(Object object) {
	        if (size == list.length) {
	            doubleCapacity();
	        }
	        list[size++] = object;
	    }

	    public Object remove(Object object) {
	        for (int i = 0; i < size; i++) {
	            if (list[i].equals(object)) {
	                Object removedObject = list[i];
	                list[i] = list[size - 1];
	                size--;
	                return removedObject;
	            }
	        }
	        return null;
	    }

	    public int getSize() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public boolean contains(Object object) {
	        for (int i = 0; i < size; i++) {
	            if (list[i].equals(object)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public int countOccurrences(Object object) {
	        int count = 0;
	        for (int i = 0; i < size; i++) {
	            if (list[i].equals(object)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder("[");
	        for (int i = 0; i < size; i++) {
	            sb.append(list[i]);
	            if (i < size - 1) {
	                sb.append(", ");
	            }
	        }
	        sb.append("]");
	        return sb.toString();
	    }

	    private void doubleCapacity() {
	        Object[] newList = new Object[list.length * 2];
	        for (int i = 0; i < size; i++) {
	            newList[i] = list[i];
	        }
	        list = newList;
	    }
	}


	// TODO: Your implementation starts here
	/*  Your implementation starts here
	 * Recall that :
	 * 1. No System.out.println statements should appear here.
	 * 	  Instead, you need to return the result.
	 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of this method.   
	 */


/**
 * This class simulates an ArrayList concept, where you can add unlimited number
 * of elements to the list.
 */
class MyList extends Container {

	    @Override
	    public void add(Object object) {
	        // Add the object to the end of the list.
	        super.add(object);
	    }

	    @Override
	    public Object remove(Object object) {
	        // Remove the first occurrence of the object from the list.
	        int index = indexOf(object);
	        if (index != -1) {
	            return removeAt(index);
	        } else {
	            return null;
	        }
	    }

	    public Object get(int index) {
	        // Check if the index is valid.
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
	        }

	        // Return the element at the specified index.
	        return list[index];
	    }

	    private int indexOf(Object object) {
	        for (int i = 0; i < size; i++) {
	            if (list[i].equals(object)) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    private Object removeAt(int index) {
	        // Shift the elements to the left to fill the gap.
	        for (int i = index + 1; i < size; i++) {
	            list[i - 1] = list[i];
	        }

	        // Reduce the size of the list.
	        size--;

	        // Return the removed element.
	        return list[index];
	    }
	}


	// TODO: Your implementation starts here
	/*  Your implementation starts here
	 * Recall that :
	 * 1. No System.out.println statements should appear here.
	 * 	  Instead, you need to return the result.
	 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of this method.   
	 */
	
	
	


/**
 * This class simulates a custom set that stores unique elements.
 */
class MySet extends Container {

	    @Override
	    public void add(Object object) {
	        // Add the object to the set if it does not already exist.
	        if (!contains(object)) {
	            super.add(object);
	        }
	    }

	    @Override
	    public Object remove(Object object) {
	        // Remove the object from the set if it exists.
	        if (contains(object)) {
	            return super.remove(object);
	        } else {
	            return null;
	        }
	    }

	    public boolean contains(Object object) {
	        for (int i = 0; i < size; i++) {
	            if (list[i].equals(object)) {
	                return true;
	            }
	        }
	        return false;
	    }

		public Employee get(int i) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	

	// TODO: Your implementation starts here
	/*  Your implementation starts here
	 * Recall that :
	 * 1. No System.out.println statements should appear here.
	 * 	  Instead, you need to return the result.
	 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of this method.   
	 */
public class SchoolManager {

    private MyList overtimeList;
    private MySet displayseminarRegistrationList;

    public SchoolManager() {
        overtimeList = new MyList();
        displayseminarRegistrationList = new MySet();
    }

    public void addToOvertimeList(Employee employee) {
        overtimeList.add(employee);
    }

    public void addToSeminarRegistrationList(Employee employee) {
        displayseminarRegistrationList.add(employee);
    }

    public int getOvertimeEmployeeCount() {
        return overtimeList.getSize();
    }

    public int getSeminarRegistrationsCount() {
        return displayseminarRegistrationList.getSize();
    }

    public String displayOvertimeList() {
        StringBuilder sb = new StringBuilder("Overtime List:\n");
        for (int i = 0; i < overtimeList.getSize(); i++) {
            Employee employee = (Employee) overtimeList.get(i);
            sb.append(employee.toString()).append("\n");
        }
        return sb.toString();
    }

    public String displaySeminarRegistrationList() {
        StringBuilder sb = new StringBuilder("Seminar Registration List:\n");
        for (int i = 0; i < displayseminarRegistrationList.getSize(); i++) {
            Employee employee = (Employee) displayseminarRegistrationList.get(i);
            sb.append(employee.toString()).append("\n");
        }
        return sb.toString();
    }
}

