/* Creates a basic class for a Binary Search Tree*/

public class BinTree 
{
	private TreeNode root;

	public BinTree() 
	{ 
		root = null; 
	}

	public BinTree(String initValue)
	{
		root = new TreeNode(initValue);
	}

	/* Subclass for Nodes */

	public class TreeNode
	{
		private String value;
		 TreeNode left;
		 TreeNode right;

		public TreeNode(String initValue)
		{
			value = initValue;
			left = null;
			right = null;
		}

		public TreeNode(String initValue, TreeNode initLeft, TreeNode initRight)
		{
			value = initValue;
			left = initLeft;
			right = initRight;
		}

		public String getValue() 
		{ 
			return value; 
		}

		public TreeNode getLeft() 
		{ 
			return left; 
		}

		public TreeNode getRight() 
		{ 
			return right; 
		}

		public void setValue (String newVal) 
		{ 
			value = newVal; 
		}

		public void setLeft (TreeNode newLeft) 
		{ 
			left = newLeft; 
		}

		public void setRight (TreeNode newRight) 
		{ 
			right = newRight; 
		}
	}
  // public void insertNodeRight (TreeNode toInsert)
  // {
  //   right = toInsert;
		// return;
  // }
  // public void insertNodeLeft ( TreeNode toInsert)
  // {
  //   left = toInsert;
		// return;
  // }

	// private void recInsertItem (TreeNode current, TreeNode toInsert)
	// {
	// 	if (current.value == toInsert.value)
	// 	{
	// 		return;
	// 	}
	// 	if (current.value.equals(".")) 
	// 	{
	// 		if (current.left == null) 
	// 		{
	// 			current.left = toInsert;
	// 			return;
	// 		}
	// 		else 
	// 		{
	// 			recInsertItem (current.left, toInsert);
	// 		}
	// 	}
	// 	else 
	// 	{
	// 		if (current.right == null) 
	// 		{
	// 			current.right = toInsert;
	// 			return;
	// 		}
	// 		else 
	// 		{
	// 			recInsertItem(current.right, toInsert);
	// 		}
	// 	}
	// }

	// public void InsertItem(String item)
	// {
	// 	// TreeNode temp = new TreeNode (item);
	// 	if (root == null) 
	// 	{
	// 		root = new TreeNode(item);
	// 		return;
	// 	}
	// 	else 
	// 	{
	// 		recInsertItem (root, new TreeNode(item));
	// 	}
	// }

	// public void deleteNode(String toRemove)
	// { 
	// 	root = deleteNode (root, toRemove); 
	// }

    void insert(String letter, String morse, int i) 
    {
        TreeNode currentNode = this.root; //goes in as parameter otherwise resets every recursive statement
        TreeNode morseNode = new TreeNode(letter);
        try
            {
                if(morse.substring(i,i+1).equals("."))
                    currentNode = currentNode.left;
                else
                    currentNode = currentNode.right;
            }
        catch(StringIndexOutOfBoundsException e)
        {
            if(morse.equals("."))
                currentNode.setLeft(morseNode);
            else
                currentNode.setRight(morseNode);
        }
        insert(letter, morse.substring(i+1, morse.length()), i+1);
    }
}

