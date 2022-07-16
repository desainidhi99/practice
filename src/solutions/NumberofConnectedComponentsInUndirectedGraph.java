package solutions;/*
You have a graph of n nodes. You are given an integer n and an array edges where edges[i] = [ai, bi] indicates that there is an edge between ai and bi in the graph.

Return the number of connected components in the graph.
 */

/*
Input: n = 5, edges = [[0,1],[1,2],[3,4]]
Output: 2

Input: n = 5, edges = [[0,1],[1,2],[2,3],[3,4]]
Output: 1
 */

/*
Approach 1 -
Adj list creation for bi-directional edges
DFS on each vertices - marking visited node as 1
intialize counter when visited is 0;

TC - O(E+V)
 */


import java.util.ArrayList;
import java.util.List;

class NumberofConnectedComponentsInUndirectedGraph {


    public int countComponents(int n, int[][] edges) {

        List<Integer>[] adjList = new ArrayList[n];

        for(int i =0; i<n ; i++)
        {
            adjList[i] = new ArrayList<Integer>();
        }

        for(int i=0; i< edges.length; i++)
        {
            adjList[edges[i][0]].add(edges[i][1]);
            adjList[edges[i][1]].add(edges[i][0]);
        }


        int[] visited = new int[n];

        int counter =0;

        for(int i=0; i< n; i++)
        {
            if(visited[i] ==0)
            {
                counter++;
                dfs(adjList,visited, i);
            }
        }

        return counter;
    }

    public void dfs(List<Integer>[] adjList, int[] visited, int node)
    {
        visited[node] =1;

        for(int i =0; i< adjList[node].size(); i++)
        {
            if(visited[adjList[node].get(i)] == 0)
            {
                dfs(adjList,visited, adjList[node].get(i));
            }
        }
    }
}