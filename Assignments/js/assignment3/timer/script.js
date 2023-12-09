let countdownValue = 5;
let countdownInterval;

function startCountdown() {
  document.getElementById("startButton").disabled = true;

  countdownInterval = setInterval(function () {
    document.getElementById("countdown").innerHTML = countdownValue;

    if (countdownValue === 1) {
      clearInterval(countdownInterval);
      document.getElementById("countdown").innerHTML = "Go!";
      document.getElementById("replayButton").disabled = false;
    } else {
      countdownValue--;
    }
  }, 1000);
}

function replayCountdown() {
  countdownValue = 5;
  document.getElementById("countdown").innerHTML = countdownValue;
  document.getElementById("replayButton").disabled = true;
  startCountdown();
}
