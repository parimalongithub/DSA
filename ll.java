package linkied_list;

 class linkiedlist {

    private node head;
    private node tail;

    private int size;

    public linkiedlist(){
         this.size=0;
    }


    private class node{
        private int value;
        private node next; 
    
    public node(int value){
        this.value=value;

    }
    public node(int value,node next){
        this.value=value;
        this.next=next;
    }

    }

    public void insertfirst(int val){
        node node=new node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size ++;
                      

                      




    }
    public void insertlast(int val){
        if(tail==null){
            insertfirst(val); 
        }
        else{
        node node=new node(val);
        tail.next=node;
        tail=node;
         size++;  

        }   
       
        }
        

    public void insert(int val,int index){

          if (index==0){
            insertfirst(val);
          }
          else if (index==size){
            insertlast(val);

          }
          else{
            node temp=head;
            for (int i=1;i<index;i++){
                temp=temp.next;
            }
            node node=new node(val,temp.next);
            temp.next=node;
            size++;


        }
      

    }

    public int  deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public node getindex(int index){

        node n=head;
        for(int i=0;i<index;i++){
            n=n.next;
        }
        return n;
    }

    public int deletelast(){

        if(size<=1){
            return deletefirst();
        }
        node secondlast=getindex(size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        size--;
         return val;
    }

    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        node previous =getindex(index-1);
        System.out.println(previous.value);
        int val=previous.next.value;
        previous.next=previous.next.next;
        size--;
        return val;
        


    }


    public void display(){
    node temp=head;
    while(temp!=null){
        System.out.print(temp.value+" -> ");
        temp=temp.next;
    }
    System.out.print("end");

    }
 }





public class ll{
    public static void main(String[] args) {
        linkiedlist l =new linkiedlist();
        l.insertfirst(3);
        l.insert(4,1);
        l.insert(5, 2);
        l.insert(6, 3);
        l.insert(7, 4);
        l.insert(7, 5);
        l.deletelast(); 
        l.delete(3);
        l.display();
        
     

        

          
    }
}





  
    

