package week4.day1025;

public class HashFunction2 {

    // hash함수 완성
    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;
    }


    // ascii 코드로 변환
    public int hash1(String key){
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int ascii = c;
            System.out.printf("%s %d ,",c,ascii);
        }
        System.out.println();
        return 0;
    }

    // ascii 코드 합치기
    public int hash2(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int ascii = c;
            System.out.printf("%s %d ," ,c, ascii);
            asciiSum += ascii;
        }
        System.out.println("asciiSum:" + asciiSum);
        return 0;
    }


    public static void main(String[] args) {
        HashFunction2 hf = new HashFunction2();

        hf.hash1("kyeongrok");
        hf.hash2("kyeongrok");
        System.out.println(hf.hash("kyeongrok"));
        System.out.println(985%90);
    }
}
