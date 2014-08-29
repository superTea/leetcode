/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 * 
 * 
 * @author superTea
 * @date Aug.28,2014
 * @plaform Leetcode OJ
 */
public class Solution {
    /** use deep first traversal
     * 
     * @param HashMap<UndirectedGraphNode, UndirectedGraphNode> map, it is used to track current graph and copy graph
     * 
     */
     
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null){
            return null;
        }
        LinkedList<UndirectedGraphNode> stack = new LinkedList<UndirectedGraphNode>();
        HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
        UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
        map.put(node,copy);
        stack.push(node);
        
        while(!stack.isEmpty()){
            UndirectedGraphNode cur = stack.pop();
            for(int i = 0; i<cur.neighbors.size(); i++){
                if(!map.containsKey(cur.neighbors.get(i))){
                    copy = new UndirectedGraphNode(cur.neighbors.get(i).label);
                    map.put(cur.neighbors.get(i),copy);
                    stack.push(cur.neighbors.get(i));
                }
                map.get(cur).neighbors.add(map.get(cur.neighbors.get(i)));
            }
        }
        
        return map.get(node);
    }
}