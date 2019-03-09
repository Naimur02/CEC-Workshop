package day4;

public class Student {
    public static void main(String[] args) {
        //initialize attributes
        String [] name = new String[4];
        String [] location = new String[4];
        String [] semester = new String[4];
        int [] id = new int[4];


         name[0]="Namiur";
         name[1]="Rakib";
         name[2]="Sakib";
         name[3]="Rabbi";
        location[0]="Bashundhara";
        location[1]="Nordha";
        location[2]="Bashundhara";
        location[3]="Baridhara";
        semester[0] = "1st";
        semester[1] = "2nd";
        semester[2] = "3rd";
        semester[3] = "4th";
        id[0] = 1813344;
        id[1] = 1813345;
        id[2] = 1813346;
        id[3] = 1813347;

        //presention
        for(int i=0;i<4;i++){
            System.out.println("Name :"+name[i]);
            System.out.println("ID : "+id[i]);
            System.out.println("Semester : "+semester[i]);
            System.out.println("Location : "+location[i]);
            System.out.println();

        }

    }
}
