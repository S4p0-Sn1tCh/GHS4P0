/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: magipedgay
 *
 * Created on 19 de enero de 2021, 9:54
 */

#include <cstdlib>
#include <iostream>
#include <math.h>
#include "operacion.h"

using namespace std;
float a,b, sumaf, n1;
    //int n1;
    void getvalor(float&, float&);
    
    void resultado(float, float);
    
    
    
  int main() {
     getvalor(a,b);
     n1 = calculo(a,b,sumaf);
     resultado(n1, sumaf);
     
    
    }
    void getvalor(float& oa, float& ob){
    cout<<"insert a value:\n";
    cin>>oa;
    cout<<"valor a: "<<oa<<"\n";
    cout<<"insert b value:\n";
    cin>>ob;
    cout<<"valor b: "<<ob<<"\n";
    
    

   
   
   }
    
    void resultado(float iN1, float osumaf){
        cout<<"Suma: "<<osumaf<<"\n";
        cout<<"Resta: "<<iN1<<"\n";
    
     
   }