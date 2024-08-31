// Basics of Array is Java

// Array ----> An array is a type of data structure which stores homogeneous elements (elements of same data type) in a cotigious (continous) memory location.

// Properties of Array ----> (1) It stores elements of similar data type 
//                           (2) Continous memory is allocated to array elements 
//                           (3) Each element has a unique index in array through which it can be accessed 

// Types of array ----> (1) One Dimensional Array ( has one row and multiple column )
//                      (2) Multi Dimensional Array ( has multiple rows and multiple columns )

// Steps involved in creating an array ----> (1) Declaration of array 
//                                           (2) Instantiation of array 
//                                           (3) Initialisation of array 

// Declaring an array (creating an array) ----> dataType[] arrayName  ( It creates a refrence variable for an array in the memory )
// Instantiating an array (allocating memory to the elements of array) ----> arrayName = new dataType[arraySize] ( It allots memory to the elements of the array according to the size given . Note :- the size of an array cannot be changed once its declared . Here new keyword is used to allocate a new memory in the memory ). The default value in the memory after instantiation(memory allocation) is undefied at each index of array.
// Initialising an array(Assigning values to array) ----> arrayName[indexNumber] = value ;

// Indexing in array ----> Indexing is  used to access a particular element in the array.
// Types of Indexing :-  (1) Forward Indexing :- starts from left of array ( 0,1,2,3,4,5,6,7,8,........n )
//                       (2) Backword Indexing :- starts from right of array ( -1,-2,-3,-4,-5,-6,-7,......starting_element )
// Accessing an element in an array :- arrayname[IndexNumber]; (will give the value at that particular index in the array)

// Dynamic memory allocation in an Array :-
// Reference variable of array i.e, ArrayName is stored in Stack memory and the array is stored in the heap memory . Reference variable by default points to the address of first element (element at 0 index) of the array thus on printing arrayName we will get the memory address of the first element of the array as an output, to get the value stored at that location or array index we use arrayName[indexNumber]. To get the further elements we have to increase the index number by one as elements in array are stored continously in the memory one after the other.  


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