package Enum;

public class Main {
    public static void main(String[]args){
        Level levelNew = Level.HIGHT;
        System.out.println(levelNew);
        Level levelNew1 = Level.DEVTRINH;
        System.out.println(levelNew1);
        for(Level newLevel2 : Level.values()){
            System.out.println(newLevel2);
        }
    }
}
