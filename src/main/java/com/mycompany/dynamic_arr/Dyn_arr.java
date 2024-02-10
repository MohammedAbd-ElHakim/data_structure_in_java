/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dynamic_arr;

import java.util.Arrays;

/**
 *
 * @author moa19
 */
public class Dyn_arr {
    int[] data;
    int size;
    
    public Dyn_arr(){
        size=0;
        data = new int[1];
    }
    
    //return the data of current index
    public int get_data_of_index(int index){
        return data[index]; 
    }
    
    //add new element in the array
    public void push(int element){
        //حنتاكد اول حاجه قبل ما نضيف منتج او شي جديد للااي انو في مكان فاضي ليها
        do_we_have_empty_indexes_to_new_element(size+1);
       data[size++] = element; 
    }
    
    //do_we_can_add_a_new_size_without_increase_size
    public void do_we_have_empty_indexes_to_new_element(int new_size_wich_get){
        int current_Size = data.length;
        if(new_size_wich_get > current_Size){
           int new_size = current_Size * 2;
           data = Arrays.copyOf(data,new_size);
            if(new_size < new_size_wich_get){
                new_size = new_size_wich_get;
                data = Arrays.copyOf(data,new_size);
            }
        }       
    }
    
    public int get_size(){
        return data.length;
    }
//end of class
}


