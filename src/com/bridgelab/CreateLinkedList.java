package com.bridgelab;

public class CreateLinkedList {
    Node head; // head of list

        // Linked list Node.
        // This inner class is made static
        // so that main() can access it
        static class Node {

            int data;
            Node next;

            // Constructor
            Node(int d)
            {
                data = d;
                next = null;
            }
        }

        // Method to insert a new node
        public static CreateLinkedList insert(CreateLinkedList list, int data)
        {
            // Create a new node with given data
            Node new_node = new Node(data);
            new_node.next = null;

            // If the Linked List is empty,
            // then make the new node as head
            if (list.head == null) {
                list.head = new_node;
            }
            else {
                // Else traverse till the last node
                // and insert the new_node there
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }

                // Insert the new_node at last node
                last.next = new_node;
            }

            // Return the list by head
            return list;
        }

        // Method to print the LinkedList.
        public static void printList(CreateLinkedList list)
        {
            Node currNode = list.head;

            System.out.print("LinkedList: ");

            // Traverse through the LinkedList
            while (currNode != null) {
                // Print the data at current node
                System.out.print(currNode.data + " ");

                // Go to next node
                currNode = currNode.next;
            }
        }

        // Driver code
        public static void main(String[] args)
        {
            /* Start with the empty list. */
            CreateLinkedList list = new CreateLinkedList();

            //
            // ******INSERTION******
            //

            // Insert the values
            list = insert(list, 56);
            list = insert(list, 30);
            list = insert(list, 70);

            // Print the LinkedList
            printList(list);
        }
    }

