package week4.day1025;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

    private int size = 10000;

//    private int[] table = new int[size];
//    List 로 변환
    private List<Node>[] table = new ArrayList[size];

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }
    public void insert(String key, int value){
        int hashcode = hash(key);
        if (this.table[hashcode] == null) {
            this.table[hashcode] = new ArrayList<>();
        }
        this.table[hashcode].add(new Node(key, value));

    }

//    public int search(String key){
//        return this.table[hash(key)];
//    }

    public Integer get(String key){
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())){
                return node.getValue();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable ht2 = new HashTable(200);
        ht2.insert("Yonnseo", 1);
        ht2.insert("Seoyoon", 2);
        int result = ht2.get("Yonnseo");
        if (result == 1 ){
            System.out.println("테스트 성공");
        }else System.out.printf("테스트 실패 value : %d", result);
    }

}


