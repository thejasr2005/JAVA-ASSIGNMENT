package MODULE9;

public class NQueens {

        static int N = 4;
        static int board[][] = new int[N][N];

        static boolean safe(int r,int c){
            for(int i=0;i<c;i++)
                if(board[r][i]==1) return false;

            for(int i=r,j=c;i>=0&&j>=0;i--,j--)
                if(board[i][j]==1) return false;

            for(int i=r,j=c;i<N&&j>=0;i++,j--)
                if(board[i][j]==1) return false;

            return true;
        }

        static boolean solve(int col){
            if(col>=N) return true;

            for(int i=0;i<N;i++){
                if(safe(i,col)){
                    board[i][col]=1;
                    if(solve(col+1)) return true;
                    board[i][col]=0;
                }
            }
            return false;
        }

        static void print(){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++)
                    System.out.print(board[i][j]+" ");
                System.out.println();
            }
        }

        public static void main(String[] args){
            if(solve(0))
                print();
            else
                System.out.println("No solution");
        }
}
