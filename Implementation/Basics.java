class Basics {
  public static void main(String[] args) {

    // Type 1 for creating an array:-
    int[] marks;                    // Declaring an array
    marks = new int[5];            // Instantiating array
    // Initialising array
    marks[0] = 45;                  
    marks[1] = 65;
    marks[2] = 47;
    marks[3] = 20;
    marks[4] = 90;
    System.out.println("Marks : " + marks[3]);  // Accessing a specific element of array

    // Type 2 for creating an array:-
    int[] rollNo = {1,2,3,4,5,6,7,8,9,10};  // Creating (declaring,instantiating,initialising) an array 
    System.out.println("Roll No : " + rollNo[5]);  // accessing a specific element of array  
  }
}


// Time Complexity of creating an array :-
// In Type 1 : Time complexity of the declaring and instantiating step is O(1) and time complexity of Initialising step is O(n) . Thus overall time complexity = O(1) + O(1) + O(n)
// In Type 2 : Time complexity is O(1) as all the 3 steps in the Type 1 scenario is combined in one single step in Type 2. 
// Thus Type 2 code in more optimized in terms of Time Complexity 

// Space Complexity :- space complexity is same in both the cases as both are using same amount of memory 