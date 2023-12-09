let tasks = [];

function addTask() {
  const taskInput = document.getElementById("todoInput");
  const taskText = taskInput.value.trim();

  if (taskText !== "") {
    tasks.push({ text: taskText, completed: false });
    updateTaskList();
    taskInput.value = "";
  }
}

function removeTask(index) {
  tasks.splice(index, 1);
  updateTaskList();
}

function toggleTaskStatus(index) {
  tasks[index].completed = !tasks[index].completed;
  updateTaskList();
}

function updateTaskList() {
  const taskList = document.getElementById("taskList");
  const totalTasks = document.getElementById("totalTasks");

  taskList.innerHTML = "";
  tasks.forEach((task, index) => {
    const listItem = document.createElement("li");
    listItem.className = `task ${task.completed ? "completed" : ""}`;

    const taskText = document.createTextNode(task.text);
    const removeButton = document.createElement("button");
    removeButton.innerHTML = "Delete";
    removeButton.onclick = () => removeTask(index);

    const statusButton = document.createElement("button");
    statusButton.innerHTML = task.completed ? "Undo" : "Complete";
    statusButton.onclick = () => toggleTaskStatus(index);

    listItem.appendChild(taskText);
    listItem.appendChild(removeButton);
    listItem.appendChild(statusButton);

    taskList.appendChild(listItem);
  });

  totalTasks.innerHTML = `Total Tasks: ${tasks.length}, Completed Tasks: ${
    tasks.filter((task) => task.completed).length
  }`;
}

// Initial rendering
updateTaskList();
