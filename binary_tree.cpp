#include<iostream>
#include<string>
using namespace std;
struct node{
    int data;
    struct node* left;
    struct node* right;
};
struct node* createnode(int data){
    struct node *n;
    n=new struct node ;
    n->data=data;
    n->left=NULL;
    n->right=NULL;

    return n;


}

void inOrder(struct  node* root){

    if(root!=NULL){
        inOrder(root->left);
        cout<<( root->data);
        inOrder(root->right);
    }
}
struct node*  search(struct node* root,int key){
    if(root==NULL){
        return NULL;
    }
    if(key==root->data){
        return root;
    }
    else if(key<root->data){
        return search(root->left, key);
    }
    else{
        return search(root->right, key);
    }
}
struct node *insert(struct node *node, int key)
{
    if (node == NULL)
    {
        return createnode(key);
    }
    if (key < node->data)
    {
        node->left = insert(node->left, key);
    }
    else
    {
        node->right = insert(node->right, key);
    }
    return node;
}






int main(){
    struct node *root;
    root=insert(root,5);   root=insert(root,3);   root=insert(root,6);  
     root=insert(root,1);
    


    




    inOrder(root);
    cout<<"\nplease enter the element that you want to search ";
    int search_element;
    cin>>search_element;
//
   struct  node* n=search(root,search_element);
    if(n!=NULL){
    cout<<(n->data)<<"element found!!";
    }
    else{
        cout<<"element not found  ";
   }

    //search(p,7);





    
}


