/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazesolver;


import java.awt.Color;
import java.awt.Graphics;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class NewClass extends JFrame{
    
    public int[][] maze=new int[][]{
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,0,1,1,1,0,1,1,0,0,0,0,1},
        {1,0,0,0,0,0,1,0,1,0,0,1,0,0,1},
        {1,0,1,0,1,1,1,0,1,1,1,1,0,0,1},
        {1,0,0,1,0,0,0,0,0,0,0,0,0,1,1},
        {1,0,0,1,0,0,1,1,1,0,1,1,0,0,1},
        {1,0,0,0,0,0,0,0,1,0,1,0,1,0,1},
        {1,0,1,1,0,1,1,0,1,0,1,0,1,9,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    
    public List<Integer> path=new ArrayList<>();
    
    public NewClass(){
        setTitle("MAZE SOLVER");
        setSize(700,700);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        DFS.SearchPath(maze, 1, 1, path);
       // System.out.println(path);
    }
    @Override
    public void paint(Graphics g){
        g.translate(70, 70);
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                Color color;
                if(maze[i][j]==1){
                    color=Color.BLACK;
                }else if(maze[i][j]==9){
                    color=Color.RED;
                }else{
                    color=Color.WHITE;
                }
                g.setColor(color);
                g.fillRect(30*j,30*i,30,30);
                g.setColor(Color.RED);
                g.drawRect(30*j,30*i, 30, 30);
                
                
            }
        }
        for(int i=0;i<path.size();i+=2){
            int x=path.get(i);
            int y=path.get(i+1);
            
            g.setColor(Color.GREEN);
            g.fillOval(30*y, 30* x, 30, 30);
        }
    }
    
    public static void main(String[] args){
        NewClass obj=new NewClass();
        obj.setVisible(true);
    }
    
    
}
