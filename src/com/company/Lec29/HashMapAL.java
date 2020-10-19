package com.company.Lec29;


import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapAL<K,V> {

    ArrayList<LinkedList<Entity>> list = new ArrayList<>();

    int size;

    float lf = 0.5f;


    public HashMapAL() {

        this.size =0;
        for (int i = 0; i <10 ; i++) {

            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){


        if(((float)(size)/list.size())>lf){

            rehash();
        }

        int index = Math.abs(key.hashCode()%list.size());

        LinkedList<Entity> entities = list.get(index);

        for (Entity e : entities) {

            if(e.key.equals(key)){
                e.value =value;
                return;
            }
        }

        size++;
        entities.add(new Entity(key, value));
    }

    private void rehash() {

        ArrayList<LinkedList<Entity>> old = list;

        list = new ArrayList<>();

        for (int i = 0; i <2*old.size() ; i++) {

            list.add(new LinkedList<>());
        }

         size = 0;

        for (LinkedList<Entity> entityLinkedList : old) {

            for (Entity e :entityLinkedList) {

                put(e.key, e.value);
            }
        }

    }

    public V get(K key){

        int index = Math.abs(key.hashCode()%list.size());

        LinkedList<Entity> entities = list.get(index);

        for (Entity e : entities) {

            if(e.key.equals(key)){
                return e.value;
            }
        }

        return null;

    }

    public V remove(K key){


        int index = Math.abs(key.hashCode()%list.size());

        LinkedList<Entity> entities = list.get(index);

        Entity target =null;

        for (Entity entity : entities) {

            if(entity.key.equals(key)){

                target = entity;
                size--;

            }
        }

        V temp = target.value;

        entities.remove(target);

        return temp;

    }


    class Entity{

        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
