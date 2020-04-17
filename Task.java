class Task{
	private String name;
	private boolean isCompleted;
	public Task(String name,boolean isCompleted){
		this.name=name;
		this.isCompleted=isCompleted;
	}
	public void setName(String name){
		this.name=name;
	}
	public boolean markAsComplete(){
		return isCompleted;
	}
	 public static void main(String[] args) {
		Task task1= new Task("Swikriti",false);
		Task task2=new Task("Yamuna",true);
		System.out.println("Task1 isCompleted: " +task1.markAsComplete());
		System.out.println("Task2 isCompleted: " +task2.markAsComplete());

	}


}