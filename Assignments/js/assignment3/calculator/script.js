let result = document.getElementById("result");
      let currentInput = "";

      function appendToResult(value) {
        currentInput += value;
        updateResult();
      }

      function clearResult() {
        currentInput = "";
        updateResult();
      }

      function operate(operator) {
        if (operator === "remove") {
          currentInput = currentInput.slice(0, -1);
        } else if (operator === "=") {
          try {
            currentInput = eval(currentInput).toString();
          } catch (error) {
            currentInput = "Error";
          }
        } else {
          currentInput += operator;
        }
        updateResult();
      }

      function updateResult() {
        result.innerText = currentInput;
      }