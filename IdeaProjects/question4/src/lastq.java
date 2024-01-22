private String studName;
private int arrMarks[] = new int[4]; // for storing four marks

// Paramterized constructor
public Student(String studName, int marks[]){

        this.studName = studName;
        for(int i = 0; i<4; i++){
        this.arrMarks[i]  = marks[i];
        }

        }

// Getters

public String getStudName(){
        return studName;
        }

        int[] getArrMarks(){
        return this.arrMarks;
        }

public double calcAve(){

        int total = 0;
// Add add marks to total one by one
        for(int i = 0; i<4; i++){
        total += this.arrMarks[i];
        }

        return (double)total / 4; // Return the average marks
        }
/* determine whether the student passes the module with an average of at least 50%.
 Returns the word Pass or Fail. */
public String didPass(){

        if(calcAve() >= 50)
        return "Pass";
        else
        return "Fail";
        }

public String toString(){

        String arrString = "";

        for(int i = 0; i<4; i++)
        arrString  = arrString + this.arrMarks[i] + " ";

        return ("Student Name: " + studName +
        "\nMarks: " + arrString +
        "\nAverage marks: "+ calcAve()+
        "\nResult: "+ didPass());
        }

        }


    }