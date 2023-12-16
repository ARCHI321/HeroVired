class TreeNode:
    def __init__(self, value=0, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

def flatten_tree(root):
    if not root:
        return

    
    flatten_tree(root.left)
    
    
    flatten_tree(root.right)

    
    right_child = root.right
    
    
    root.right = root.left
    root.left = None
    
    
    while root.right:
        root = root.right
    
    
    root.right = right_child



root = TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4)), TreeNode(5, None, TreeNode(6)))


flatten_tree(root)


while root:
    print(root.value, end=" ")
    root = root.right
