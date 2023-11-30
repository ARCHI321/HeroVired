function register() {
  var username = document.getElementById("username").value;
  var email = document.getElementById("email").value;
  var password = document.getElementById("password").value;
  var data = { email: email, password: password };

  localStorage.setItem(username, JSON.stringify(data));
}
