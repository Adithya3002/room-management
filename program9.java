class Add
{
   int a,b;
    Add()
    {
       
        System.out.println("Default constructor");
        a=10;
        b=20;
        System.out.println("A:"+a);
        System.out.println("B:"+b);
    }

    Add(int a,int b)
    {
        System.out.println("The parameterised constructor is");
        this.a=a;
        this.b=b;
        System.out.println("A:"+a);
        System.out.println("B"+b);
    }

    void addItem()
    {
        System.out.println("The sum is"+(a+b));
    }

    void addItem(Add ob)
    {
        System.out.println("The sum is"+(ob.a+ob.b));
    }

}
class program9
{
    public static void main(String args[])
    {
        Add ob=new Add();
        ob.addItem();

        Add ob1=new Add(10,20);
        ob1.addItem(ob1);
    }
}