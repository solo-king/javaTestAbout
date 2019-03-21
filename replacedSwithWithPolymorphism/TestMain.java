class TestMain{


	public  static void main(String args[]){
		
		Teacher tec = new Teacher();
		Student stu = new Student();
		
		printPlayerLevel(tec);	
		printPlayerLevel(stu);	
	
	}  

	static public void printPlayerLevel(Person pson){

		System.out.println(pson.playerLevel());
	}


}
