class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Initialize sets for rows, columns, and 3x3 boxes
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        
        // Single pass through the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char digit = board[i][j];
                
                // Skip empty cells
                if (digit == '.') continue;
                
                // Calculate which 3x3 box this cell belongs to
                int boxIndex = (i / 3) * 3 + (j / 3);
                
                // Check if digit already exists in row, column, or box
                if (rows[i].contains(digit) || 
                    cols[j].contains(digit) || 
                    boxes[boxIndex].contains(digit)) {
                    return false;
                }
                
                // Add digit to all three tracking sets
                rows[i].add(digit);
                cols[j].add(digit);
                boxes[boxIndex].add(digit);
            }
        }
        
        return true;

    }
}
