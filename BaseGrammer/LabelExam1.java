public class LabelExam1{
    public static void main(String[] args){
        outter:
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if ( i == 0 && j == 2 ){
                    break outter;
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}