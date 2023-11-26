function isValidSudoku(board) {
  // Function to check if an array has duplicate values
  const hasDuplicates = (arr) => {
    const uniqueSet = new Set(arr.filter((num) => num !== "."));
    return uniqueSet.size !== arr.filter((num) => num !== ".").length;
  };

  // Check each row
  for (let i = 0; i < 9; i++) {
    if (hasDuplicates(board[i])) {
      return false;
    }
  }

  // Check each column
  for (let j = 0; j < 9; j++) {
    const column = [];
    for (let i = 0; i < 9; i++) {
      column.push(board[i][j]);
    }
    if (hasDuplicates(column)) {
      return false;
    }
  }

  // Check each 3 x 3 sub-box
  for (let boxRow = 0; boxRow < 3; boxRow++) {
    for (let boxCol = 0; boxCol < 3; boxCol++) {
      const box = [];
      for (let i = boxRow * 3; i < boxRow * 3 + 3; i++) {
        for (let j = boxCol * 3; j < boxCol * 3 + 3; j++) {
          box.push(board[i][j]);
        }
      }
      if (hasDuplicates(box)) {
        return false;
      }
    }
  }

  // If no duplicates found, the Sudoku board is valid
  return true;
}

// Example usage:
const sudokuBoard = [
  ["5", "3", ".", ".", "7", ".", ".", ".", "."],
  ["6", ".", ".", "1", "9", "5", ".", ".", "."],
  [".", "9", "8", ".", ".", ".", ".", "6", "."],
  ["8", ".", ".", ".", "6", ".", ".", ".", "3"],
  ["4", ".", ".", "8", ".", "3", ".", ".", "1"],
  ["7", ".", ".", ".", "2", ".", ".", ".", "6"],
  [".", "6", ".", ".", ".", ".", "2", "8", "."],
  [".", ".", ".", "4", "1", "9", ".", ".", "5"],
  [".", ".", ".", ".", "8", ".", ".", "7", "9"],
];

console.log(isValidSudoku(sudokuBoard)); // Output: true
