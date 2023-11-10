package org.example;

public class Sack {
    private Object[] list = new Object[0];

    public Sack(){

    }
    public Sack(Object[] list){
        this.list = list;
    }
    public void add(Object o){
        Object[] newList = new Object[this.list.length +1];
        for(int i = 0; i < this.list.length; i++){
            newList[i]=this.list[i];
        }
        newList[this.list.length]= o;
        this.list = newList;
    }

    public void remove(Object o){
        boolean exists = false;
        for(Object object : this.list){
            if(object.equals(o)){
                exists = true;
            }
        }
        if(!exists) return;
        Object[] newList = new Object[list.length-1];
        int indexToRemove = 0;
        while(!this.list[indexToRemove].equals(o)){
            indexToRemove++;
        }
        for(int i = 0; i< list.length;i++){
            if(i<indexToRemove){
                newList[i]=list[i];

            }
            if(i>indexToRemove){
                newList[i-1]=list[i];
            }
        }
        this.list=newList;
    }
    public void remove(int indexToRemove){
        Object[] newList = new Object[list.length-1];
        for(int i = 0; i< list.length;i++){
            if(i<indexToRemove){
                newList[i]=list[i];

            }
            if(i>indexToRemove){
                newList[i-1]=list[i];
            }
        }
        this.list=newList;
    }
    public int size(){
        return this.list.length;
    }
    public Object get(int index){
        return this.list[index];
    }
    public void removeLast(){
        this.remove(this.list.length - 1 );
    }

}
