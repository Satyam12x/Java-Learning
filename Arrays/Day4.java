//2-D Arrays: In Java, a two-dimensional (2D) array is an array of arrays, representing data in a tabular format with rows and columns. It is also commonly referred to as a matrix.

//Declaration of 2-D arrays:
//Type[][] arrayName; // Declaration
int[][] mat;

//Initialization of 2-D arrays:
//arrayName = new dataType[rows][columns]; // Initialization

mat = new int[5][5];

//Declaration and initialization in one step:
//dataType[][] arrayName = new dataType[rows][columns];
int[][] arr = new int[5][5];

//Initialization with values during declaration:
//dataType[][] arrayName = { {value1, value2}, {value3, value4} };
int[][] arr2 = {
    {
        1,2
    },
    {
        3,4
    }
};

//Accessing elements in the 2-D array:
//dataType value = arrayName[rowIndex][columnIndex];

