package Fourth_Semester;

//public class StudentMarks {
//    public static void main(String[] args) {
//        int MARKS[][]={{20,30,40,50,60},{16,18,98,57,60},{10,40,80,41,26},{20,40,60,80,98}};
//
//    }

    public class StudentMarks {



        public static void main(String[] args) {

            int [][]  MARKS = {{48,27,10,67,18}, {58,89,40,80,78},{47,40,49,78,40},{69,40,89,88,67},
                    {38,91,76,34,67},{66,45,89,34,90}, {97,78,90,67,56},{57,78,90,87,76},
                    {77,98,50,57,46}, {57,98,70,67,86}, {77,68,70,67,56}, {97,98,90,67,56},
                    {67,78,90,67,56}, {27,48,60,87,56},{17,58,90,97,86}, {67,78,90,67,56},
                    {37,58,90,67,56}, {77,78,70,67,66}, {67,78,90,67,56}, {97,88,90,67,76}};

            float total = 0;
            float average = 0;
//Part a
            System.out.println("Average marks for each subject\n");
            System.out.println("Subject     \tAverage\n");
            int [] student = new int [100];
            int n  = 0;
            for(int i=0; i<20; i++){
                for(int j=0; j<5; j++){
                    student[n++] = MARKS[i][j];
                }
            }
            int [][] marks = new int[5][20];
            int k = 0;
            for(int i=0; i<5; i++){
                for(int j=0; j<20; j++){
                    marks[i][j] = student[k++];
                }
            }












            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j < 20; j++)
                {
                    total += marks[i][j];
                }
                average = total/20;
                System.out.printf("%d\t\t %f\n", (i+1), average);


                average = 0;
                total = 0;
            }
            int count =0;
            double [] averageScore = new double[20];
//Part b Answer
            System.out.println("Average marks for every student\n");
            System.out.println("Student     \tAverage\n");


            for(int i=0; i<20; i++){
                float sum = 0;
                for(int j=0; j<5; j++){
                    sum +=  MARKS[i][j];
                }
                System.out.printf("%d     \t\t%f\n", (i+1), (sum / 5 ));

                averageScore[i] = sum / 5;
            }
            for(int i=0; i<20; i++){
                if(averageScore[i]<50){
                    count++;
                }
            }
//Part (c) answer
            System.out.printf("The number of students with average less than 50: %d\t", count);


//Part (d) answer
            System.out.printf("Average marks obtained by every student\n");
            System.out.printf("Student     \tScores\n");




            for(int i=0; i<20; i++){
                System.out.printf("%d:   \t\t  %f \n", (i+1), (averageScore[i] * 5 ));

            }


        }



    }

