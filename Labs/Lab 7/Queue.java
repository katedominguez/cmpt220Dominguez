/**
file: Lab7Problem2.java;
Kaitlyn Dominguez
CMPT 220
Lab 7 Problem 10.10
April 20, 2017
*/
import java.util.Scanner;
public class Queue{ 
	public static void main(String[] args) {
    Queue queue = new Queue();
    // Putting 20 elements into the queue
    for (int x = 0; x < 20; x++) {
       queue.enqueue(x);
    }

    // Display the 20 elements first-in first-out
    for (int i = 0; i < 20; i++) {
      System.out.printf("%2d ", queue.dequeue());
      if ((i + 1) % 5 == 0) 
        System.out.printf("\n");
    }
  }
  private int[] elements;
  private int size;
  private int capacity;

  public Queue(int capacity) {
    this.capacity = capacity;
    elements = new int[capacity];
  }
  public Queue() {
    this(8);
  }

  public void enqueue(int v) {
    if (size >= elements.length) {
      int[] a = new int[size * 2];
      System.arraycopy(elements, 0, a, 0, size);
      elements= a;
    }
    elements[size++] = v;

  }

  public int dequeue() {
    int c = elements[0];
    size--;
    for (int y = 0; y < size; y++) {
      elements[y] = elements[y + 1];
    }
    return c;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int getSize() {
    return size;
  }

  public int getCapacity() {
    return capacity;
  }
}