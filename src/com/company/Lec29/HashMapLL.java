package com.company.Lec29;

import java.util.LinkedList;

public class HashMapLL {

    LinkedList<Entity> list = new LinkedList<>();

    public void put(String key, String value){

        for (Entity e : list) {

            if(e.key.equals(key)){
                e.value =value;
                return;
            }
        }

        list.add(new Entity(key, value));
    }

    public String get(String key){

        for (Entity e : list) {

            if(e.key.equals(key)){
                return e.value;
            }
        }

        return null;
    }

    public String remove(String key){

        Entity target =null;

        for (Entity entity : list) {

            if(entity.key.equals(key)){

                target = entity;

            }
        }

        String temp = target.value;
        list.remove(target);

        return temp;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("{");

        for (Entity e:list) {

            s.append(e.key).append(" => ").append(e.value).append(", ");
        }

        s.append("}");

        return s.toString();
    }

    class Entity{

        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
