class Developer
{
	String name;
	String type;
	int experience;
	int age;
	float salary;
	
	String getName()
	{
		return this.name;
	}
	String getType()
	{
		return this.type;
	}
	int getExperience()
	{
		return this.experience;
	}
	int getAge()
	{
		return this.age;
	}
	float getSalary()
	{
		return this.salary;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	void setType(String type)
	{
		this.type=type;
	}
	void setExperience(int experience)
	{
		this.experience=experience;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	void setSalary(float salary)
	{
		this.salary=salary;
	}
	
public static void main(String[] sun)
{
	
	Developer ref=new Developer();
	ref.setName("Ayyappa reddy");
	String name=ref.getName();
	System.out.println("Developer Name is "+name);
	
	ref.setType("CSS HTML");
	String type=ref.getType();
	System.out.println(type);
	
	ref.setExperience(3);
	int experience=ref.getExperience();
	System.out.println(experience);
	
	ref.setAge(31);
	int age=ref.getAge();
	System.out.println(age);
	
	ref.setSalary(9.2f);
	float salary=ref.getSalary();
}
}