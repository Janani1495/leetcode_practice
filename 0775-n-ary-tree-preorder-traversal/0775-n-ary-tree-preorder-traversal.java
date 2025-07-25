/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node node) {
     Stack<Node>stack=new Stack<>();
     List<Integer>list=new ArrayList<>();
     if (node == null) return list;
     stack.push(node);
     while(!stack.isEmpty()){
        Node temp=stack.peek();
        stack.pop();
        list.add(temp.val);
        for(int i=temp.children.size()-1;i>=0;i--){
            stack.push(temp.children.get(i));
        }
     } return list;  
    }
}