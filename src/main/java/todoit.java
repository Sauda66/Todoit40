import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Applicationtodoit
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //Number of task
        System.out.println("How many task ?");
        int numOfTask=sc.nextInt();
        //todolist
        sc.nextLine();
        //Storing the Task details in ArrayList
        List<Todo> listOfTask=new ArrayList<>();
        for(int i=0;i<numOfTask;i++){
            Todo t=new Todo();
            System.out.println("Task Name : ");
            t.setTaskName(sc.nextLine());
            System.out.println("Task Timing : ");
            t.setTaskTime(sc.nextLine());
            listOfTask.add(t);
        }
        System.out.println("\n\t\t\t~~~~Given Tasks are~~~~\n");

        for(int i=0;i<numOfTask;i++){
            System.out.println("+++++++++------+++++++++++-------+++++-------");
            System.out.println(listOfTask.get(i));
            System.out.println("+++++++++------+++++++++++-------+++++-------\n");
        }

    }
}

class Todo{

    private String taskName;
    private String taskTime;

    public void setTaskName(String taskName){

        this.taskName=taskName;
    }

    public void setTaskTime(String taskTime){
        this.taskTime=taskTime;
    }
    public String toString(){
        return "[ TaskName: "+taskName+" | TaskTime : "+taskTime+" ]";
    }
}
