
public class Chess {


    public static void main(String[] args) {
           
              
       // char[][]board = {{'w','b','w','b','w','b','w','b'},
       //                 {'b','w','b','w','b','w','b','w'},
       //                 {'w','b','w','b','w','b','w','b'},
        //                {'b','w','b','w','b','w','b','w'},
        //                {'w','b','w','b','w','b','w','b'},
        //                {'b','w','b','w','b','w','b','w'},
         //               {'w','b','w','b','w','b','w','b'},
        //                {'b','w','b','w','b','w','b','w'},
         //               {'w','b','w','b','w','b','w','b'}};
        
       char[][]board = new char[8][8]; 

       for (int i = 0; i < board.length; i++){ //goes trough each array
           for (int j = 0; j < board[i].length; j++) { //goes trough each item in array
            if((i+j) % 2 == 0){
                board[i][j] = 'w';
            }else {
                board[i][j] = 'b';
            }
             System.out.print(board[i][j]);  
           }
           System.out.println();
       }
    }
}
