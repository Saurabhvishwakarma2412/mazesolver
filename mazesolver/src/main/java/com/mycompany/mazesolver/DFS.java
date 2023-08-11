/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazesolver;

import java.util.List;

/**
 *
 * @author HP
 */
public class DFS {
   static int[] dx=new int[]{1,-1,0,0};
   static  int[] dy=new int[]{0,0,1,-1};
    public static boolean SearchPath(int[][] maze,int x,int y,List<Integer> path){
        if(maze[x][y]==9){
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[x][y]==0){
            maze[x][y]=2;
        for(int i=0;i<4;i++){
            
            if(SearchPath(maze,x+dx[i],y+dy[i],path)){
                path.add(x);
                path.add(y);
                return true;
            }
        }
        }
        return false;
    }
    
}
