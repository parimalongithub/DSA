
public class linkied_list {
    private Node head;
    private Node tail;
    int size;  
    linkied_list() {
        this.size=0;

    }


    public void insertfirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
      

        if(tail==null){
            tail=head;
        }
        size++;
    }



    public void insertlast(int val){
        if(tail==null){
            insertfirst(val);
            
        }
        else{
        Node node=new Node(val);
        tail.next=node;
        tail=node; 
         size++;

        }

    }

 

    public void insert(int val, int index){
        if (index==0){
        insertfirst(val);
        }
 
    
    else if (index==size){
        insertlast(val);
    }
    Node temp=head;
    for (int i=1;i<index;i++){
        temp=temp.next;  
    } 
    Node node =new Node (val);
    node.next = temp.next; 
    temp.next=node;
    size++; 

}



public void deletefirst(){
    head=head.next;
    if ( head==null){
        tail=null;
    }
    size--;

}





public Node get(int index){
    Node node=head;
    for (int i=0;i<index;i++){
        node=node.next;
    }
    return node;

}



public void deletelast(){
    if (size<=1){
        deletefirst();

    }
    Node secondlast=get(size-2);
    tail=secondlast; 
    tail.next=null;

    

}




public  void delete(int index){
    if(index==0){
        deletefirst();
        
    }
    else if(index==size-1){
        deletelast();
    }
    Node previous=get(index-1); 
    previous.next =previous.next.next;
     

    
}







    public  void display (){
        Node temp=head;
        while(temp!=null ){ 
            System.out.print(temp.value+"-->");
           temp=temp.next;
           //System.out.println(temp);

        }
        System.out.println("End");

    }
    
    private class Node{
        private int value;
        private Node next; 
        

    public Node (int value){
        this.value=value;
    }

    }
     public static void main(String[] args) {
       
        linkied_list ll=new linkied_list();
        ll.insertfirst(3); 
        ll.insertfirst(5);
        ll.insertfirst(8);
        ll.insertlast(100 );
        ll.insert(23, 3);
        ll.deletefirst();
        ll.deletelast();
        ll.delete(2);
        ll.display();


    } 
}