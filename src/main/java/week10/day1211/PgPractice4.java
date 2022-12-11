package week10.day1211;
public class PgPractice4 {

    // lv.1 소수 찾기
    // 못품
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i%j==0) flag = false;
            }
            if (flag==true) answer++;
        }
        System.out.println(answer);
        return answer;
    }


    public int solution2(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n + 1];
        System.out.println(prime.toString());
        for (int i = 0; i < n; i++) prime[i] = true;
        //제곱근 구하기
        int root=(int)Math.sqrt(n);
        for(int i=2; i<=root; i++){ //2~루트n까지 검사
            if(prime[i]==true){ //i번째의 수가 소수일 때
                for(int j=i; i*j<=n; j++) //그 배수들을 다 false로 초기화(배수는 소수가 아니기 때문)
                    prime[i*j]=false;
            }
        }

        for(int i =2; i<=n; i++) {
            if(prime[i]==true)
                answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        PgPractice4 pg = new PgPractice4();
        int n = 4;
//        pg.solution(10);
//        pg.solution2(10);
//
//        boolean[] prime= new boolean[2];
//        int[] arrI = new int[2];
//        String[] arrS = new String[2];
//        char[] arrC = new char[2];
//
//        System.out.println("boolean 기본 값 : "+Arrays.toString(prime));
//        System.out.println("int 기본 값 : "+Arrays.toString(arrI));
//        System.out.println("String 기본 값 : "+Arrays.toString(arrS));
//        System.out.println("char 기본 값 : "+Arrays.toString(arrC));
//
//
//        arrI[0] = 1;
//        arrI[1] = 2;
//
//        System.out.println(Arrays.toString(arrI));
//
//        prime[0] = true;
//        prime[1] = true;
//        System.out.println(Arrays.toString(prime));
//
//        int root=(int)Math.sqrt(10);
//        System.out.println(root);
        pg.solution2(10);

    }
}
