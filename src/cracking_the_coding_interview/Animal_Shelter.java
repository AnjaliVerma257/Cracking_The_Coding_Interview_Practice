/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

import java.util.Date;

class Animal {

    String type;
    Date date;

    public Animal(String type, Date date) {
        this.type = type;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public String toString() {
        String s = "Type:   " + type + "   Date:   " + date;
        return s;
    }
}

/**
 *
 * @author Anjali
 */
public class Animal_Shelter {

    class Node {

        Animal an;
        Node next;

        public Node(Animal a) {
            an = a;
            next = null;
        }

    }

    Node Dog_Top = null;
    Node Cat_Top = null;
    Node Dog_Last = null;
    Node Cat_Last = null;

    public Date peek_cat() {
        return Cat_Top.an.getDate();
    }

    public Date peek_dog() {
        return Dog_Top.an.getDate();
    }

    /*
    public void enqueue(Animal A) {
        if (A.getType() == "cat") {
            if (Cat_Top == null) {
                Cat_Top = new Node(A);
                Cat_Top.next = null;
            } else {
                Node temp = Cat_Top;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(A);
            }
        } else {
            if (Dog_Top == null) {
                Dog_Top = new Node(A);
                Dog_Top.next = null;
            } else {
                Node temp = Dog_Top;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(A);
            }
        }

    }
*/
    
    public void enqueue(Animal A) {
        if (A.getType() == "cat") {
            if (Cat_Top == null) {
                Cat_Top = new Node(A);
                Cat_Top.next = null;
                Cat_Last = Cat_Top;
            } else {
                Cat_Last.next = new Node(A);
                Cat_Last = Cat_Last.next;
            }
        } else {
            if (Dog_Top == null) {
                Dog_Top = new Node(A);
                Dog_Top.next = null;
                Dog_Last = Cat_Top;
            } else {
                Dog_Last.next = new Node(A);
                Dog_Last = Dog_Last.next;
            }
        }

    }
    
    
    
    public Animal dequeueAny() {
        if(Dog_Top == null && Cat_Top==null)
            return null;
        if(Dog_Top==null)
            return Cat_Top.an;
        else if(Cat_Top == null)
            return Dog_Top.an;
        int x = peek_cat().compareTo(peek_dog());
        Animal ans = null;
        if (x < 0) {
            ans = Cat_Top.an;
            Cat_Top = Cat_Top.next;
        } else {
            ans = Dog_Top.an;
            Dog_Top = Dog_Top.next;
        }
        return ans;
    }

    public Animal dequeueDog() {

        Animal ans = null;
        ans = Dog_Top.an;
        Dog_Top = Dog_Top.next;
        return ans;
    }

    public Animal dequeueCat() {
        Animal ans = null;
        ans = Cat_Top.an;
        Cat_Top = Cat_Top.next;
        return ans;
    }

    public static void main(String args[]) {
        Animal_Shelter as = new Animal_Shelter();
        as.enqueue(new Animal("cat", new Date(1992, 07, 21)));
        as.enqueue(new Animal("cat", new Date(1992, 07, 22)));
        as.enqueue(new Animal("cat", new Date(1992, 07, 23)));
        as.enqueue(new Animal("cat", new Date(1992, 07, 24)));
        as.enqueue(new Animal("cat", new Date(1992, 07, 25)));
        
        as.enqueue(new Animal("dog", new Date(1992, 07, 21)));
        as.enqueue(new Animal("dog", new Date(1992, 07, 22)));
        as.enqueue(new Animal("dog", new Date(1992, 07, 23)));

        System.out.println(as.dequeueCat().toString());
        System.out.println(as.dequeueCat().toString());
        System.out.println(as.dequeueCat().toString());
        
        System.out.println(as.dequeueAny().toString());

    }
}
