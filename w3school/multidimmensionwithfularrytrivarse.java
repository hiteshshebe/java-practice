class Program
{
    public static void main(String[] args) {
        int[][] myNumber={{1,2,3,4},{5,6,7}};

        for(int index1=0;index1<myNumber.length;index1++){
            for(int index2=0;index2<myNumber[index1].length;index2++){
                System.out.println(myNumber[index1][index2]);

            }
        }
    }
}