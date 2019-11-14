package ques1;
import java.util.*;
class node
        {
            int data;
            node left=null;
            node right=null;
        }
public class Ques1
{
    
	int height(node root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int m=height(root.left);
			int n=height(root.right);
			if(m>n)
			{
				return m+1;
			}
			else
			{
				return n+1;
			}
                        
		}
                
	}
       static void level1(node root,int level)
        {
            if (root == null)  
        return ;  
    if (level == 1)  
       System.out.println(root.data);
    else if (level > 1)  
    {  
        level1(root.right,level-1);  
        level1(root.left,level-1);  
    } 
        }
        
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		node root=null;
		node parent=null;
		node ptr=null;
                System.out.println("Enter size"); 
		int n=s.nextInt();
                System.out.println("Enter the elements"); 
		for(int i=0;i<n;i++)
		{
			node temp=new node();
			temp.data=s.nextInt();
			if(root==null)
			{
				root=temp;
			}
			else
			{
				ptr=root;
				while(ptr!=null)
				{
					parent=ptr;
					if(ptr.data>temp.data)
					{
						ptr=ptr.left;
					}
					else
					{
						ptr=ptr.right;
					}
				}
				if(parent.data>temp.data)
				{
					parent.left=temp;
				}
				else
				{
					parent.right=temp;
				}
			}
		}
		Ques1 c=new Ques1();
                
		int z=c.height(root);
                System.out.println("Height of the tree is"); 
		System.out.println(z); 
                  System.out.println("Level order"); 
                for(int j=z;j>=1;j--)
                {
                    level1(root,j); 
                }
	}
}