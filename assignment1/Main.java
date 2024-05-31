package assignment1;

public class Main {
	public static void main(String[] args) {
		ToDoList todoList = new ToDoList();
		Task task1 = new Task("Buy groceries"," Bread, Eggs, and Butter");
        Task task2 = new Task("Read book", "Read '1984' by George Orwell");

        todoList.addToDo(task1);
        todoList.addToDo(task2);

        todoList.viewToDoList();

        todoList.markToDoAsCompleted("Buy groceries");

        todoList.viewToDoList();
    
       
	}
}
	
