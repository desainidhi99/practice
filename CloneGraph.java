/*
Given a reference of a node in a connected undirected graph.

Return a deep copy (clone) of the graph.

Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

class Node {
    public int val;
    public List<Node> neighbors;
}
 */

class Solution {
    public Node cloneGraph(Node node) {

        if(node == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();
        LinkedList<Node> queue = new LinkedList<Node>();

        queue.add(node);

        Node clone = new Node(node.val, new ArrayList<Node>());

        map.put(node, clone);

        while(!queue.isEmpty())
        {
            Node current = queue.pop();

            for(Node neighbour : current.neighbors){

                if(!map.containsKey(neighbour)){
                    Node cloneNode = new Node(neighbour.val, new ArrayList<Node>());
                    map.put(neighbour, cloneNode);

                    queue.add(neighbour);
                }

                map.get(current).neighbors.add(map.get(neighbour));

            }
        }

        return map.get(node);
    }
}