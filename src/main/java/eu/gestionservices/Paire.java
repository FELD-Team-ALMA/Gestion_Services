package eu.gestionservices;

public class Paire<A, B> {
	    private A first;
	    private B second;

	    public Paire(A first, B second) {
	        super();
	        this.first = first;
	        this.second = second;
	    }

	    public int hashCode() {
	        int hashFirst = first != null ? first.hashCode() : 0;
	        int hashSecond = second != null ? second.hashCode() : 0;

	        return (hashFirst + hashSecond) * hashSecond + hashFirst;
	    }

	    public boolean equals(Object other) {
	        if (other instanceof Paire) {
	            Paire otherPaire = (Paire) other;
	            return 
	            ((  this.first == otherPaire.first ||
	                ( this.first != null && otherPaire.first != null &&
	                  this.first.equals(otherPaire.first))) &&
	             (  this.second == otherPaire.second ||
	                ( this.second != null && otherPaire.second != null &&
	                  this.second.equals(otherPaire.second))) );
	        }

	        return false;
	    }

	    public String toString()
	    { 
	           return "(" + first + ", " + second + ")"; 
	    }

	    public A getFirst() {
	        return first;
	    }

	    public void setFirst(A first) {
	        this.first = first;
	    }

	    public B getSecond() {
	        return second;
	    }

	    public void setSecond(B second) {
	        this.second = second;
	    }
}