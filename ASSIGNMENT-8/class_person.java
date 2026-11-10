class person 
{
	string name;
	person()
	{
		name="ram";
	}
	public void getname()
	{
		return name;
	}
class employee extends person
{
	double salary;
	string doj;
	string pan;
	employee()
	{
		salary=101010;
		doj="15/11/2009";
		pan="APAPP61X";
	}
	public double getsal()
	{
		return salary;
	}
	public string getdoj()
	{
		return doj;
	}
    }
}
