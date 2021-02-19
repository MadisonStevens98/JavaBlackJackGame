/*
Madison Stevens
CompSci 182/182L
10-9-17
 */
package project3;
/*****************************************************************
   Class Link, the base class for a link list of playing cards
   May be placed in a file named Link.java

******************************************************************/
class Link {
  protected Link next;

  public Link getNext() { return next; }
  public void setNext(Link newnext) { next = newnext; }

}  // end class Link
